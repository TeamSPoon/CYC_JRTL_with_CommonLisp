package com.cyc.baseclient.soap;

//// Internal Imports
import com.cyc.base.CycAccess;
import com.cyc.baseclient.api.CycApiServerSideException;
import com.cyc.baseclient.api.SubLWorkerSynch;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.api.DefaultSubLWorkerSynch;
import com.cyc.baseclient.CycClientManager;
import com.cyc.baseclient.api.SubLWorkerEvent;
import com.cyc.base.CycApiException;
import com.cyc.baseclient.api.CycConnection;
import com.cyc.base.CycConnectionException;
import com.cyc.base.conn.WorkerStatus;
import com.cyc.base.conn.Worker;
import com.cyc.base.cycobject.CycList;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.util.Map;
import java.util.UUID;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.util.Base64;
import com.cyc.baseclient.util.Log;
import com.cyc.base.CycTimeOutException;
import com.cyc.base.conn.CycConnectionInterface;
import com.cyc.base.conn.LeaseManager;
import com.cyc.base.conn.TimerI;
import com.cyc.baseclient.CycClient;
import com.cyc.baseclient.util.Timer;

/** Provides a Cyc binary (CFASL) API connection via the XML SOAP protocol.
 *
 * @author reed
 date March 28, 2005
 * @version $Id: SOAPBinaryCycConnection.java 138070 2012-01-10 19:46:08Z sbrown $
 */
public class SOAPBinaryCycConnection implements CycConnectionInterface {

  //// Constructors
  /** Creates a new instance of SOAPCycConnection using a default endpoint URL */
  public SOAPBinaryCycConnection() {
    try {
      endpointURL = new URL("http://localhost:8080/axis/services/CycSOAPService");
      // for use with tcp monitor
      //endpointURL = new URL("http://localhost:9080/axis/services/CycSOAPService");
    } catch (MalformedURLException e) {
      Log.current.errorPrintln(e.getMessage());
      Log.current.printStackTrace(e);
      System.exit(1);
    }
    uuid = UUID.randomUUID();
  }

  /** Creates a new instance of SOAPCycConnection using the given endpoint URL and the given
 CycAccess API method provider.
   *
   * @param endpointURL the SOAP XML endpoint URL which indicates the Cyc API web services host
   * @param hostName the name of the computer hosting the Cyc server
   * @param basePort the tcp base listening port
   * @param cycAccess the parent CycAccess object
   */
  public SOAPBinaryCycConnection(final URL endpointURL,
          final String hostName,
          final int basePort,
          final CycAccess cycAccess) throws CycConnectionException, CycApiException {
    this.endpointURL = endpointURL;
    this.cycAccess = cycAccess;
    this.hostName = hostName;
    this.basePort = basePort;
    uuid = UUID.randomUUID();
  }
  //// Public Area
  /** no api trace */
  public static final int API_TRACE_NONE = 0;
  /** message-level api trace */
  public static final int API_TRACE_MESSAGES = 1;
  /** detailed api trace */
  public static final int API_TRACE_DETAILED = 2;
  /** SOAP mode connnection to the Cyc server. */
  public static final int SOAP_MODE = 3;

  /** Sends a message to Cyc and return the <tt>Boolean</tt> true as the first
   * element of an object array, and the cyc response Symbolic Expression as
   * the second element.  If an error occurs the first element is <tt>Boolean</tt>
   * false and the second element is the error message string.
   *
   * @param message the api command
   * @return an array of two objects, the first is an Integer response code, and the second is the
   * response object or error string.
   */
  public Object[] converse(final Object message) throws CycConnectionException, CycApiException {
    return converse(message, notimeout);
  }

  /** Sends a message to Cyc and return the response code as the first
   * element of an object array, and the cyc response Symbolic Expression as
   * the second element, spending no less time than the specified timer allows
   * but throwing a <code>CycTimeOutException</code> at the first opportunity
   * where that time limit is exceeded.
   * If an error occurs the second element is the error message string.
   *
   * @param message the api command which must be a String or a CycArrayList
   * @param timeout a <tt>Timer</tt> object giving the time limit for the api call
   * @return an array of two objects, the first is an Integer response code, and the second is the
   * response object or error string.
   */
  public Object[] converse(final Object message, final TimerI timeout)
          throws CycConnectionException, CycTimeOutException, CycApiException {
    CycList messageCycList;
    if (message instanceof CycArrayList) {
      messageCycList = (CycArrayList) message;
    } else if (message instanceof String) {
      if (cycAccess == null) {
        throw new RuntimeException("CycAccess is required to process commands in string form");
      }
      messageCycList = cycAccess.getObjectTool().makeCycList((String) message);
    } else {
      throw new CycApiException("Invalid class for message " + message);
    }
    messageCycList = substituteForBackquote(messageCycList, timeout);
    return converseBinary(messageCycList, timeout);
  }

  /**
   * Send a message to Cyc spending no less time than the specified timer allows but throwing a <code>CycTimeOutException</code> 
   * at the first opportunity where that time limit is exceeded. The concurrent mode of Cyc server communication 
 is supported by Cyc's pool of transaction processor threads, each of which can concurrently process an api request.  The
 Worker object notifies the caller when the api response is aschronously received.
   * 
   * @param worker a <tt>Worker</tt> object that notifies the caller when work is done
   * 
   * @throws IOException when a communication error occurs
   * @throws CycTimeOutException when the time limit is exceeded
   * @throws CycApiException when a Cyc api error occurs
   */
  public void converseBinary(final Worker worker)
          throws CycConnectionException, CycTimeOutException, CycApiException {

    if ((worker instanceof SubLWorkerSynch) && CycConnection.inAWTEventThread()) {
      throw new CycApiException("Invalid attempt to communicate with Cyc "
              + "from the AWT event thread.\n\n" + worker);
    }
    new SubLWorkerProcessor(worker).run();
  }

  /**
   * Sets the client name of this api connection.
   * 
   * @param myClientName the client name of this api connection
   */
  public void setMyClientName(String myClientName) {
    this.myClientName = myClientName;
  }

  /**
   * Gets the client name of this api connection.
   * 
   * @return the client name of this api connection
   */
  public String getMyClientname() {
    return myClientName;
  }

  /**
   * Returns the next apiRequestId.
   * 
   * @return the next apiRequestId
   */
  static public synchronized Integer nextApiRequestId() {
    return new Integer(++apiRequestId);
  }

  /** Closes the api sockets and streams */
  public void close() {
  }

  /** Returns the trace value.
   *
   * @return the trace value
   */
  public int getTrace() {
    return trace;
  }

  /** Sets the trace value.
   *
   * @param trace the trace value
   */
  public void setTrace(final int trace) {
    this.trace = trace;
  }

  /** Turns on the diagnostic trace of socket messages. */
  public void traceOn() {
    trace = API_TRACE_MESSAGES;
  }

  /** Turns on the detailed diagnostic trace of socket messages. */
  public void traceOnDetailed() {
    trace = API_TRACE_DETAILED;
  }

  /** Turns off the diagnostic trace of socket messages. */
  public void traceOff() {
    trace = API_TRACE_NONE;
  }

  /** Returns connection information, suitable for diagnostics.
   *
   * @return connection information, suitable for diagnostics
   */
  public String connectionInfo() {
    return "Cyc API Web Service at " + endpointURL.toString();
  }

  /** Returns the UUID that identifies this java api client connection.
   *
   * @return the UUID that identifies this java api client connection
   *
   */
  public UUID getUuid() {
    return null;
  }

  /** Returns the base port of this connection.
   * @return <code>int</code> of this connection's base port.
   *
   */
  public int getBasePort() {
    return basePort;
  }

  /** @return the http port of the server this connection is connected to.
   */
  public int getHttpPort() {
    return basePort + 2;
  }
  
  /** Returns the hostname of this connection.
   * @return <code>String</code> denoting this hostname.
   *
   */
  public String getHostName() {
    return hostName;
  }

  public void cancelCommunication(final Worker worker) throws CycConnectionException {
    final Integer id = worker.getId();
    if (id.intValue() < 0) {
      //@note serial communications cannot be canceled right now
      return;
    }
    final String command = "(fif (" + "terminate-active-task-process"
            + " " + worker.getId() + " \"" + uuid + "\" " + ":cancel"
            + ") '(ignore) '(ignore))";
    converse(cycAccess.getObjectTool().makeCycList(command));
    // the SubL implementation of CANCEL will send a CANCEL event back,
    // which will cleanup the waiting thread info and signal the termination 
    // event, so no need to perform event signaling and cleanup
  }

  public void abortCommunication(final Worker worker) throws CycConnectionException {
    final Integer id = worker.getId();
    if (id.intValue() < 0) {
      //@note serial communications cannot be canceled right now
      return;
    }
    try {
      final String command = "(fif (" + "terminate-active-task-process"
              + " " + worker.getId() + " \"" + uuid + "\" " + ":abort"
              + ") '(ignore) '(ignore))";
      converse(cycAccess.getObjectTool().makeCycList(command));
    } finally {
      // the SubL implementation of ABORT will not send anything back,
      // so we do need to perform event signaling and cleanup
      worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker,
              WorkerStatus.ABORTED_STATUS, null));
//      waitingReplyThreads.remove(id);
    }
  }

  /** Gets the connection type.
   *
   * @return the connection type
   */
  public int getConnectionType() {
    return CycClient.PERSISTENT_CONNECTION;
  }

  //// Protected Area
  /** Substitutes a READ-FROM-STRING expression for expressions directly containing a
   * backquote symbol.  This transformation is only required for the binary api,
   * which does not parse the backquoted expression.
   *
   * @param messageCyclist the input expression to be checked for directly containing
   * a backquote symbol.
   * @param timeout a <tt>Timer</tt> object giving the time limit for the api call
   * @return the expression with a READ-FROM-STRING expression substituted for
   * expressions directly containing a backquote symbol
   */
  protected CycList substituteForBackquote(final CycList messageCycList, TimerI timeout)
          throws CycConnectionException, CycApiException {
    if (messageCycList.treeContains(CycObjectFactory.backquote)) {
      final CycArrayList substituteCycList = new CycArrayList();
      substituteCycList.add(CycObjectFactory.makeCycSymbol("read-from-string"));
      substituteCycList.add(messageCycList.cyclify());
      final Object[] response = converseBinary(substituteCycList, timeout);
      if ((response[0].equals(Boolean.TRUE))
              && (response[1] instanceof CycArrayList)) {
        CycArrayList backquoteExpression = (CycArrayList) response[1];
        return backquoteExpression.subst(CycObjectFactory.makeCycSymbol("api-bq-list"),
                CycObjectFactory.makeCycSymbol("bq-list"));
      }
      throw new CycApiException("Invalid backquote substitution in " + messageCycList
              + "\nstatus" + response[0] + "\nmessage " + response[1]);

    }
    return messageCycList;
  }

  /** Sends a message to Cyc and return the response code as the first
   * element of an object array, and the cyc response Symbolic Expression as
   * the second element, spending no less time than the specified timer allows
   * but throwing a <code>CycTimeOutException</code> at the first opportunity
   * where that time limit is exceeded.
   * If an error occurs the second element is the error message string.
   * The concurrent mode of Cyc server communication is supported by
   * Cyc's pool of transaction processor threads, each of which can
   * concurrently process an api request.
   *
   * The CFASL input and output streams are encoded in Base64 format.
   *
   * @param message the api command
   * @param timeout a <tt>Timer</tt> object giving the time limit for the api call
   * @return an array of two objects, the first is an Integer response code, and the second is the
   * response object or error string.
   */
  public Object[] converseBinary(final CycList message, final TimerI timeout)
          throws CycConnectionException, CycTimeOutException, CycApiException {
    DefaultSubLWorkerSynch worker = new DefaultSubLWorkerSynch(message, cycAccess);
    Object[] result = new Object[2];
    try {
      result[1] = worker.getWork();
    } catch (CycConnectionException xcpt) {
      throw xcpt;
    } catch (CycTimeOutException xcpt) {
      throw xcpt;
    } catch (CycApiServerSideException xcpt) {
      // @note: this implements a legacy API of converseBinary()
      result[0] = Boolean.FALSE;
      result[1] = xcpt.getMessage();
      return result;
    } catch (CycApiException xcpt) {
      throw xcpt;
    } catch (Exception xcpt) {
      throw new RuntimeException(xcpt);
    }
    result[0] = worker.getStatus() == WorkerStatus.FINISHED_STATUS ? Boolean.TRUE : Boolean.FALSE;
    return result;
  }

  //// Private Area

  /** Provides a remote SubL Interactor using Base64 encoding of the binary (CFASL) request and
   * response.
   *
   * @param base64SubLRequest the given binary (CFASL) SubL request encoded as a Base64 string
   * @param hostname the computer hosting the Cyc server
   * @param port the listening port of the Cyc server
   * which will be submitted to the Cyc server for evaluation
   * @return the Base64 encoded result of evaluating the given SubL request
   */
  private String remoteBinarySubLInteractorAtHostPort(final String base64SubLRequest, final String hostname, final String port)
          throws ServiceException, MalformedURLException, RemoteException {
    final String methodName = "binarySubLInteractorAtHostPort";
    final Service service = new Service();
    final Call call = (Call) service.createCall();
    call.setTargetEndpointAddress(endpointURL);
    call.setOperationName(methodName);
    call.addParameter("base64SubLRequest",
            XMLType.XSD_STRING,
            ParameterMode.IN);
    call.addParameter("hostname",
            XMLType.XSD_STRING,
            ParameterMode.IN);
    call.addParameter("port",
            XMLType.XSD_STRING,
            ParameterMode.IN);
    call.setReturnType(XMLType.XSD_STRING);
    return (String) call.invoke(new Object[]{base64SubLRequest, hostname, port});
  }

  /**
   * Provides a simple test of the SOAP service without Cyc access.
   */
  private void helloWorld()
          throws ServiceException, MalformedURLException, RemoteException {
    final String methodName = "getHelloWorldMessage";
    final Service service = new Service();
    final Call call = (Call) service.createCall();
    call.setTargetEndpointAddress(endpointURL);
    call.setOperationName(methodName);
    call.addParameter("name",
            XMLType.XSD_STRING,
            ParameterMode.IN);
    call.setReturnType(XMLType.XSD_STRING);
    String result = (String) call.invoke(new Object[]{"SOAP Client"});
    Log.current.println(result);
  }

  @Override
  public void setupNewCommConnection(InputStream is) throws CycConnectionException, CycApiException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Map<String, LeaseManager> getCycLeaseManagerMap() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void setCycLeaseManagerMap(Map<String, LeaseManager> cycLeaseManagerMap) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Map<InputStream, LeaseManager> getCycLeaseManagerCommMap() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void setCycLeaseManagerCommMap(Map<InputStream, LeaseManager> cycLeaseManagerCommMap) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

    @Override
    public boolean connectedToStaticCyc() {
        return true;
    }

  protected class SubLWorkerProcessor extends Thread {

    /** Creates a new WorkerProcessor instance.
     *
     * @param message the api command
     * @param timeout the timer object giving the time limit for the api call
     * @param worker a <tt>Worker</tt> object that notifies the caller when work is done
     */
    public SubLWorkerProcessor(final Worker worker) {
      //// Preconditions
      assert worker != null : "worker must not be null";
      this.worker = worker;
    }

    /** Runs this process. */
    public void run() {
      final CycSymbol taskProcessorRequestSymbol = CycObjectFactory.makeCycSymbol("task-processor-request");
      Integer id = null;
      Base64 base64 = new Base64();
      CycList taskProcessorRequest = null;
      if (worker.getSubLCommand().first().equals(taskProcessorRequestSymbol)) {
        // client has supplied the task-processor-request form
        taskProcessorRequest = worker.getSubLCommand();
        id = (Integer)worker.getSubLCommand().third();
      } else {
        id = nextApiRequestId();
        taskProcessorRequest = new CycArrayList();
        taskProcessorRequest.add(taskProcessorRequestSymbol); // function
        taskProcessorRequest.add(worker.getSubLCommand()); // request
        taskProcessorRequest.add(id); // id
        taskProcessorRequest.add(new Integer(CycConnection.DEFAULT_PRIORITY)); // priority
        taskProcessorRequest.add(myClientName); // requestor
        taskProcessorRequest.add(CycObjectFactory.nil); // client-bindings
        taskProcessorRequest.add(uuid.toString()); // uuid to identify this client
      }
      // tell everyone this is getting started
      SubLWorkerEvent event = new SubLWorkerEvent(worker, id);
      worker.fireSubLWorkerStartedEvent(event);
      final CycArrayList soapApiRequest = new CycArrayList();
      // return-whole-task-processor-response indicates that the CycConnection at the server is to return the whole task-processor-response
      soapApiRequest.add(CycObjectFactory.makeCycSymbol("return-whole-task-processor-response"));
      soapApiRequest.add(taskProcessorRequest);
      String base64Response = null;
      try {
        final String base64SubLRequest = base64.encodeCycObject(soapApiRequest, trace);
        base64Response = remoteBinarySubLInteractorAtHostPort(base64SubLRequest,
                cycAccess.getHostName(),
                Integer.toString(cycAccess.getBasePort()));
        final Object response = base64.decodeCycObject(base64Response, trace);
        final Object[] answer = {
          null, null
        };
        if (response instanceof CycArrayList
                && ((CycArrayList) response).size() > 0
                && ((CycArrayList) response).first() instanceof CycSymbol
                && ((CycArrayList) response).first().toString().equals("CYCAPIEXCEPTION")) {
          answer[0] = Boolean.FALSE;
          answer[1] = response;
          worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker,
                  WorkerStatus.EXCEPTION_STATUS,
                  new CycApiServerSideException(((CycArrayList) response).second().toString())));
          return;
        }
        answer[0] = Boolean.TRUE;
        answer[1] = response;
        final Object status = answer[0];
        final CycArrayList taskProcessorResponse = (CycArrayList) answer[1];
        //System.out.println("taskProcessorResponse: " + taskProcessorResponse.toString());
        assert id.equals(taskProcessorResponse.get(2)) : "returned id " + taskProcessorResponse.get(2).toString() + " must equal sent id " + id.toString();
        final Object actualResponse = taskProcessorResponse.get(5);
        final Object taskStatus = taskProcessorResponse.get(6);
        boolean finished = (taskProcessorResponse.get(7) != CycObjectFactory.nil);

        if (taskStatus == CycObjectFactory.nil) {
          // no error occurred, no exceptions
          worker.fireSubLWorkerDataAvailableEvent(new SubLWorkerEvent(worker, actualResponse, -1.0f));
          if (finished) {
            worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker, WorkerStatus.FINISHED_STATUS, null));
          }
        } else {
          // Error, status contains the error message

          //@ToDo need to diferrentiate between exceptions and cancel messages!!!!!!!!!
          finished = true;
          if (taskStatus instanceof String) {
            worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker,
                    WorkerStatus.EXCEPTION_STATUS,
                    new CycApiServerSideException(taskStatus.toString())));
          } else if (taskStatus instanceof CycSymbol) {
            worker.fireSubLWorkerTerminatedEvent(new SubLWorkerEvent(worker,
                    WorkerStatus.CANCELED_STATUS, null));
          }
        }
      } catch (Exception xcpt) {
        Log.current.errorPrintln(xcpt.getMessage());
        Log.current.printStackTrace(xcpt);
      }
    }
    /** the Worker object that notifies the caller when work is done */
    final Worker worker;
  }
  //// Internal Rep
  /** the Universally Unique ID that identifies this CycConnection to the Cyc server. It is used when
   * establishing the (second) asychronous socket connection.
   */
  private UUID uuid;
  /** parameter that, when true, causes a trace of the messages to and from the server */
  private int trace = API_TRACE_NONE;
  //protected int trace = API_TRACE_MESSAGES;
  /** the timer which optionally monitors the duration of requests to the OpenCyc server */
  private static final Timer notimeout = new Timer();
  /** the reference to the parent CycAccess object for dereferencing constants in ascii symbolic expressions */
  private CycAccess cycAccess;
  /** the indicator for ascii communications mode that strings should retain their quote delimiters */
  private boolean quotedStrings;
  /** the SOAP XML endpoint URL which indicates the Cyc API web services host */
  private URL endpointURL;
  /** outbound request serial id */
  static private int apiRequestId = 0;
  /** name of my api client */
  private String myClientName = "api client";
  /** the name of the computer hosting the Cyc server */
  private String hostName;
  /** the tcp base listening port */
  private int basePort;

  //// Main
  /** Provides the main method for the testing the SOAPBinaryCycConnection.
   *
   * @param args the command line arguments
   */
  public static void main(final String[] args) {
    Log.makeLog("SOAPBinaryCycConnection.log");
    try {
      SOAPBinaryCycConnection soapBinaryCycConnection = new SOAPBinaryCycConnection();
      soapBinaryCycConnection.setTrace(soapBinaryCycConnection.API_TRACE_MESSAGES);
      Base64 base64 = new Base64();
      Log.current.println("Trying helloWorld");
      soapBinaryCycConnection.helloWorld();
      final CycArrayList query = new CycArrayList();
      query.add(CycObjectFactory.makeCycSymbol("+"));
      query.add(new Integer(1));
      query.add(new Integer(1));
      Log.current.println("binary query=" + query.toString());
      String base64Query = base64.encodeCycObject(query, soapBinaryCycConnection.trace);
      final String hostname = "localhost";
      final String port = "3600";
      String base64Response =
              soapBinaryCycConnection.remoteBinarySubLInteractorAtHostPort(base64Query, hostname, port);
      Object cycObject = base64.decodeCycObject(base64Response, soapBinaryCycConnection.trace);
      Log.current.println("result=" + cycObject);

      query.add(new Integer(1));
      Log.current.println("binary query=" + query.toString());
      base64Query = base64.encodeCycObject(query, soapBinaryCycConnection.trace);
      base64Response =
              soapBinaryCycConnection.remoteBinarySubLInteractorAtHostPort(base64Query, hostname, port);
      cycObject = base64.decodeCycObject(base64Response, soapBinaryCycConnection.trace);
      Log.current.println("result=" + cycObject);

      final CycArrayList errorQuery = new CycArrayList();
      errorQuery.add(CycObjectFactory.makeCycSymbol("an-error"));
      base64Query = base64.encodeCycObject(errorQuery, soapBinaryCycConnection.trace);
      base64Response =
              soapBinaryCycConnection.remoteBinarySubLInteractorAtHostPort(base64Query, hostname, port);
      Log.current.println("error=" + base64.decodeCycObject(base64Response, soapBinaryCycConnection.trace));

      final CycAccess cycAccess = CycClientManager.get().getAccess(new URL("http://localhost:8080/axis/services/CycSOAPService"), "localhost", 3600);
      cycAccess.traceOn();
      Log.current.println("CycAccess created");
      soapBinaryCycConnection = (SOAPBinaryCycConnection) cycAccess.getCycConnection();
      Log.current.println("Trying helloWorld");
      soapBinaryCycConnection.helloWorld();
      Log.current.println("cycAccess result=" + cycAccess.converse().converseObject(query));
      Object[] response = soapBinaryCycConnection.converse(query);
      Log.current.println("response[0]=" + response[0].toString());
      Log.current.println("response[1]=" + response[1].toString());
      CycArrayList request = new CycArrayList();
      request.add(CycObjectFactory.makeCycSymbol("list"));
      request.add(":none");
      request.add(CycObjectFactory.makeCycSymbol(":none"));
      Log.current.println("cycAccess request=" + request.toString());
      Log.current.println("cycAccess result=" + cycAccess.converse().converseObject(request));
      request = new CycArrayList();
      request.add(CycObjectFactory.makeCycSymbol("find-constant"));
      request.add("Brazil");
      Log.current.println("cycAccess request=" + request.toString());
      Log.current.println("cycAccess result=" + cycAccess.converse().converseObject(request));
    } catch (Exception e) {
      Log.current.errorPrintln(e.getMessage());
      Log.current.printStackTrace(e);
    }
  }
}
