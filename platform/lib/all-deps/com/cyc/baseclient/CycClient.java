package com.cyc.baseclient;

//// External Imports
import com.cyc.baseclient.kbtool.CycObjectTool;
import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import com.cyc.base.conn.Worker;
import com.cyc.base.conn.CycConnectionInterface;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.text.CharacterIterator;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.cyc.baseclient.api.CfaslInputStream;
import com.cyc.baseclient.api.CfaslOutputStream;
import com.cyc.baseclient.api.CycApiClosedConnectionException;
import com.cyc.baseclient.api.CycConnection;
import static com.cyc.baseclient.CommonConstants.*;
import static com.cyc.baseclient.api.SubLAPIHelper.makeSubLStmt;
import com.cyc.baseclient.comm.Comm;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.baseclient.cycobject.CycFort;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycNaut;
import com.cyc.base.cycobject.CycObject;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.inference.params.DefaultInferenceParameterDescriptions;
import com.cyc.baseclient.soap.SOAPBinaryCycConnection;
import com.cyc.baseclient.datatype.DateConverter;
import com.cyc.baseclient.util.Log;
import com.cyc.baseclient.util.PasswordManager;
import com.cyc.base.conn.LeaseManager;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.kbtool.InferenceTool;
import com.cyc.base.CycApiException;

import com.cyc.baseclient.kbtool.CycAssertTool;
import com.cyc.baseclient.kbtool.CycComparisonTool;
import com.cyc.baseclient.kbtool.CycInspectorTool;
import com.cyc.baseclient.kbtool.CycLookupTool;
import com.cyc.baseclient.kbtool.CycOwlTool;
import com.cyc.baseclient.kbtool.CycInferenceTool;
import com.cyc.baseclient.kbtool.CycRKFTool;
import com.cyc.baseclient.kbtool.CycUnassertTool;

/**
 * Provides wrappers for the OpenCyc API.
 *
 * <p>
 * Collaborates with the <tt>CycConnection</tt> class which manages the api connections.
 * </p>
 *
 * @version $Id: CycClient.java 151214 2014-05-14 00:13:48Z nwinant $
 * @author Stephen L. reed <p><p><p><p><p>
 */
public class CycClient implements CycAccess {

  // Constructors
  
  /**
   * Constructs a new CycAccess object.
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  public CycClient()
          throws CycConnectionException, CycApiException {
    this(CycConnection.DEFAULT_HOSTNAME,
            CycConnection.DEFAULT_BASE_PORT);
    System.out.println("Using Cyc " + this);
  }

  /**
   * Constructs a new CycAccess object.
   *
   * @param conn the Cyc connection object (in persistent, binary mode)
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  public CycClient(CycConnectionInterface conn)
          throws CycConnectionException, CycApiException {
    hostName = conn.getHostName();
    port = conn.getBasePort();
    persistentConnection = PERSISTENT_CONNECTION;
    cycConnection = conn;
    commonInitialization();
  }

  /**
   * Constructs a new CycAccess object for a SOAP connection.
   *
   * @param endpointURL the SOAP XML endpoint URL which indicates the Cyc API web services host
   * @param hostName the name of the computer hosting the Cyc server
   * @param basePort the Cyc server base listening port
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  public CycClient(URL endpointURL,
          String hostName,
          int basePort)
          throws CycConnectionException, CycApiException {
    this.hostName = hostName;
    this.port = basePort;
    isSOAPConnection = true;
    this.persistentConnection = PERSISTENT_CONNECTION;
    cycConnection = new SOAPBinaryCycConnection(endpointURL, hostName, basePort,
            this);
    commonInitialization();
  }

  /**
   * Constructs a new CycAccess object given a host name, port, communication mode, and messaging mode
   *
   * @param hostName the host name
   * @param basePort the base (HTML serving) TCP socket port number
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  public CycClient(String hostName,
          int basePort)
          throws CycConnectionException, CycApiException {
    this.hostName = hostName;  
    this.port = basePort;
      this.persistentConnection = PERSISTENT_CONNECTION;
      cycConnection = new CycConnection(hostName, port, this);
      commonInitialization();
    //}
  }
  
  public CycClient(Comm c)
          throws CycConnectionException, CycApiException {
    System.out.println("Cyc Access with Comm object: " + c.toString());
    System.out.flush();
    setupComm(c);
    commonInitialization();
  }

  /**
   * Dictionary of CycClient instances, indexed by thread so that the application does not have to
 keep passing around a CycClient object reference.
   */
  public static final Map<Thread, CycClient> cycAccessInstances = new HashMap<Thread, CycClient>();
  /**
   * Shared CycClient instance when thread synchronization is entirely handled by the application.
   * Use of the CycClient.current() method returns this reference if the lookup by process thread
 fails.
   */
  public static CycClient sharedCycAccessInstance = null;
  /** Value indicating that the OpenCyc api should use one TCP socket for the entire session. */
  public static final int PERSISTENT_CONNECTION = 2;
  /** Value indicating that the OpenCyc api should use one TCP socket for the entire session. */
  public static final int XML_SOAP_CONNECTION = 3;
  /**
   * Parameter indicating whether the OpenCyc api should use one TCP socket for the entire session,
   * or if the socket is created and then closed for each api call, or if an XML SOAP service
   * provides the message transport.
   */
  public int persistentConnection = PERSISTENT_CONNECTION;
  /** Default value for isLegacyMode is no compatibility with older versions of the OpenCyc api. */
  public static final boolean DEFAULT_IS_LEGACY_MODE = false;
  /** the indicator that API request forms should be logged to a file api-requests.lisp in the working directory */
  public boolean areAPIRequestsLoggedToFile = false;
  public FileWriter apiRequestLog = null;
  /** Convenient reference to #$BaseKb. */


  /**
   * Returns a string representation of this object.
   *
   * @return a string representation of this object
   */
  @Override
  public String toString() {
    if (cycConnection == null) {
      return "CycAccess: no valid connection";
    }
    return cycConnection.connectionInfo();
  }

  /**
   * Returns the CycClient that is to be used for this thread.
   *
   * @return the CycClient that is to be used for this thread.
   * @throws RuntimeException when there is no CycClient for this thread.
   */
  protected static CycClient getCurrent() {
    CycClient cyc = currentCyc.get();
    if (!(cyc instanceof CycClient)) {
      throw new RuntimeException(
              "The current CycAccess hasn't been set yet.  CycAccess.setCurrent() must be called before CycAccess.getCurrent() is called.");
    }
    return cyc;
  }

  /**
   *
   * @param access set the CycClient object that will be used as the default CycClient object for this thread.
   * @return 
   */
  protected static CycClient setCurrent(CycClient access) {
    currentCyc.set(access);
    //System.out.println("Set current CycClient to " + access);
    return access;
  }

  /**
   * Specify that this thread should use a CycClient object pointing to
 <code>hostname</code> and
   * <code>port</code>.
   * This may use an existing CycClient object, or if one can't be found, it will create a new CycClient object
 and make that new CycClient object the default one for this thread.
   *
   * @param hostName the name of the machine where the desired Cyc Server resides.
   * @param port the port number where the desired Cyc Server resides.
   * @return 
   * @throws com.cyc.base.CycConnectionException 
   */
  protected static CycClient setCurrent(String hostName, int port) throws CycConnectionException {
    String key = hostName + ":" + port;
    if (currentCycAccesses.containsKey(key)) {
      setCurrent(currentCycAccesses.get(key));
    } else {
      CycClient cyc = new CycClient(hostName, port);
      setCurrent(cyc);
      currentCycAccesses.put(key, cyc);
    }
    return getCurrent();
  }

  /**
   * Returns the <tt>CycClient</tt> object for this thread.
   *
   * @return the <tt>CycClient</tt> object for this thread
   * @throws RuntimeException when there is no CycAcess object for this thread
   * @deprecated Replaced by {@link #getCurrent()}
   */
  @Deprecated
  protected static CycClient current() {
    CycClient cycAccess = cycAccessInstances.get(Thread.currentThread());

    if (cycAccess == null) {
      if (sharedCycAccessInstance != null) {
        return sharedCycAccessInstance;
      } else {
        throw new RuntimeException("No CycAccess object for this thread");
      }
    }

    return cycAccess;
  }

  /**
   * Returns true if there is a CycClient object for this thread.
   *
   * @return true if there is a CycClient object for this thread.
   */
  protected static boolean hasCurrent() {
    return currentCyc.get() instanceof CycClient;
  }

  /**
   * Sets the shared <tt>CycClient</tt> instance.
   *
   * @param sharedCycAccessInstance shared<tt>CycClient</tt> instance
   * @deprecated Use {@link #setCurrent(CycAccess)} instead.
   */
  @Deprecated
  protected static void setSharedCycAccessInstance(
          CycClient sharedCycAccessInstance) {
    CycClient.sharedCycAccessInstance = sharedCycAccessInstance;
  }

  /** Returns the Cyc api services lease manager.
   *
   * @return the Cyc api services lease manager
   */

  @Deprecated
  @Override
  public LeaseManager getCycLeaseManager() {
    if (this.c == null) {
      return this.getCycConnection().getCycLeaseManagerMap().get(this.hostName + Integer.toString(this.port + CycConnection.CFASL_PORT_OFFSET));
    } else {
      throw new CycApiException("Please access CycLeaseManager via CycConnection when Comm object is specified");
    }
  }

  
  /**
   * Turns on the diagnostic trace of socket messages.
   */
  @Override
  public void traceOn() {
    cycConnection.traceOn();
    trace = CycConnection.API_TRACE_MESSAGES;
  }

  /**
   * Turns on the detailed diagnostic trace of socket messages.
   */
  @Override
  public void traceOnDetailed() {
    if (cycConnection != null) {
      cycConnection.traceOnDetailed();
    }

    trace = CycConnection.API_TRACE_DETAILED;
  }

  /**
   * Turns off the diagnostic trace of socket messages.
   */
  @Override
  public void traceOff() {
    cycConnection.traceOff();
    trace = CycConnection.API_TRACE_NONE;
  }

  /**
   * gets the hostname of the connection
   *
   * @return the hostname of the connection
   */
  @Override
  public String getHostName() {
    return cycConnection.getHostName();
  }

  /**
   * gets the baseport of the connection
   *
   * @return the baseport of the connection
   */
  @Override
  public int getBasePort() {
    return cycConnection.getBasePort();
  }

  /**
   * @return the http of server the connection is connected to.
   */
  @Override
  public int getHttpPort() {
    return cycConnection.getHttpPort();
  }

  /**
   * Returns the CycConnection object.
   *
   * @return the CycConnection object
   */
  @Override
  public synchronized CycConnectionInterface getCycConnection() {
    try {
      maybeReEstablishCycConnection();
    } catch (CycConnectionException ex) {
      Log.current.println(
              "Couldn't re-establish Cyc connection.\n" + ex.getLocalizedMessage());
    }
    return cycConnection;
  }
  /** Indicates whether the connection is closed */
  private volatile boolean isClosed = false;

  /** Returns whether the connection is closed
   *
   * @return whether the connection is closed
   */
  @Override
  public boolean isClosed() {
    return isClosed;
  }

  /**
   * Closes the CycConnection object. Modified by APB to be able to handle multiple calls to
   * close() safely.
   */
  @Override
  public synchronized void close() {
    if (isClosed) {
      return;
    }
    isClosed = true;
  //Tag: Fix CycLeaseManager
    /*
    if (cycLeaseManager != null) {
      cycLeaseManager.interrupt();
    }
    */

    if (cycConnection != null) {
      cycConnection.close();
    }
    if (areAPIRequestsLoggedToFile) {
      try {
        apiRequestLog.close();
      } catch (IOException e) {
        System.err.println("error when closing apiRequestLog: " + e.getMessage());
      }
    }
    cycAccessInstances.remove(Thread.currentThread());
    // make sure it's not ever used again for setting as the 'current' CycClient.
    for (Map.Entry<String, CycClient> entry : currentCycAccesses.entrySet()) {
      if (entry.getValue().equals(this)) {
        currentCycAccesses.remove(entry.getKey());
      }
    }
    /* if (sharedCycAccessInstance == null || sharedCycAccessInstance.equals(this)) {
     * final Iterator iter = cycAccessInstances.values().iterator();
     * if (iter.hasNext())
     * sharedCycAccessInstance = (CycClient) iter.next();
     * else
     * sharedCycAccessInstance = null;
     * } */
  }

  /**
   * Verify that this is not an OpenCyc image.
   *
   * @throws IOException if we can't communicate with Cyc.
   * @throws UnsupportedOperationException if it is an OpenCyc image.
   */
  @Override
  public void requireNonOpenCyc() throws CycConnectionException {
    if (this.isOpenCyc()) {
      throw new UnsupportedOperationException(
              "This operation is not supported by OpenCyc.");
    }
  }

  private void setupComm(Comm c) throws CycApiException, CycConnectionException {    
    this.persistentConnection = PERSISTENT_CONNECTION;
    this.c = c;
    
    cycConnection = new CycConnection(c, this);
    c.setCycConnection(cycConnection);
    /*
    if (c instanceof SocketComm) {
      commonInitialization();
    }*/
    
  }
  
  /**
   * Does this CycClient access a single Cyc?  
   * @return true if this CycClient will always access the same Cyc server,
 and returns false if the CycClient was constructed with 
 a {@link com.cyc.baseclient.comm.Comm} object that may result in different calls
   * being sent to different Cyc servers.
   */
  @Override
  public boolean hasStaticCycServer() {
      return (cycConnection.connectedToStaticCyc());
  }

  /** 
   * Try to enhance
   * <code>urlString</code> to log
   * <code>cyclist</code> in and redirect to
   * the page it would otherwise go to directly.
   */
  @Override
  public String maybeAddLoginRedirect(final String urlString,
          final Fort cyclist,
          final DenotationalTerm applicationTerm) {
    // sample urlString: cg?CB-CF&236134
    final int questionMarkPos = urlString.indexOf('?');
    if ((cyclist instanceof CycConstant) && (questionMarkPos >= 0)) {
      final String cgiProgram = urlString.substring(0, questionMarkPos);
      final String originalQueryString = urlString.substring(questionMarkPos + 1);
      final StringBuilder stringBuilder = new StringBuilder(cgiProgram);
      stringBuilder.append("?cb-login-handler");
      stringBuilder.append("&new_login_name=").append(
              ((CycConstant) cyclist).getName());
      maybeAddPassword(cyclist, applicationTerm, stringBuilder);
      stringBuilder.append("&redirect-handler=").append(originalQueryString);
      return stringBuilder.toString();
    } else {
      return urlString;
    }
  }

  private String doubleURLEncode(final String password) throws UnsupportedEncodingException {
    return urlEncode(urlEncode(password));
  }

  private String urlEncode(final String password) throws UnsupportedEncodingException {
    return URLEncoder.encode(password, UTF8);
  }

  /** Add a piece to the URL being string-built to specify cyclist's (encrypted) password */
  private void maybeAddPassword(final Fort cyclist,
          final DenotationalTerm applicationTerm,
          final StringBuilder stringBuilder) {
    if (cyclist instanceof CycConstant) {
      final PasswordManager passwordManager = new PasswordManager(this);
      try {
        if (passwordManager.isPasswordRequired()) {
          final String password = passwordManager.lookupPassword(
                  (CycConstant) cyclist, applicationTerm);
          if (password != null) {
            // @hack -- Cyc decodes '+' characters twice, so we encode twice:
            final String urlEncodedPassword = doubleURLEncode(password);
            stringBuilder.append("&new_login_hashed_password=").append(
                    urlEncodedPassword);
          }
        }
      } catch (IOException ex) {
        // Ignore: User may have to supply password to browser.
      } catch (CycConnectionException ex) {
        // Ignore: User may have to supply password to browser.
      }
    }
  }

  /**
   * Sets the print-readable-narts feature on.
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void setReadableNarts()
          throws CycConnectionException, CycApiException {
    converse().converseVoid("(csetq *print-readable-narts t)");
  }

  /**
   * Adds #$ to string for all CycConstants mentioned in the string that don't already have them
   *
   * @param str the String that will have #$'s added to it.
   *
   * @return a copy of str with #$'s added where appropriate.
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public String cyclifyString(String str)
          throws CycConnectionException, CycApiException {
    final String command =
            makeSubLStmt("cyclify-string", str);
    final String answer = converse().converseString(command);
    return answer;
  }

  /**
   * Gets the default generated phrase for a CycFort (intended for predicates),
   * with precise paraphrasing off.
   *
   * @param cycObject the predicate term for paraphrasing
   *
   * @return the default generated phrase for a CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  /*
   * public String getImpreciseGeneratedPhrase(CycObject cycObject)
   * throws CycConnectionException, CycApiException {
   * //// Preconditions
   * if (cycObject == null) {
   * throw new NullPointerException("cycObject must not be null");
   * }
   * if (!(cycObject instanceof CycConstant
   * || cycObject instanceof CycNart
   * || cycObject instanceof CycArrayList)) {
   * throw new IllegalArgumentException("cycObject must be a CycConstant, CycNart or CycArrayList " + cycObject.cyclify());
   * }
   * String command = "(with-precise-paraphrase-off (generate-phrase "
   * + cycObject.stringApiValue() + "))";
   * return converseString(command);
   * }
   */
  /* *
   * Gets the default generated phrase for a CycFort (intended for predicates)
   * from a particular MT with precise paraphrasing off.
   *
   * @param cycObject the predicate term for paraphrasing
   *
   * @return the default generated phrase for a CycFort
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  /*
   * public String getImpreciseGeneratedPhrase(CycObject cycObject, CycObject mt)
   * throws CycConnectionException, CycApiException {
   * //// Preconditions
   * if (cycObject == null) {
   * throw new NullPointerException("cycObject must not be null");
   * }
   * if (!(cycObject instanceof CycConstant
   * || cycObject instanceof CycNart
   * || cycObject instanceof CycArrayList)) {
   * throw new IllegalArgumentException("cycObject must be a CycConstant, CycNart or CycArrayList " + cycObject.cyclify());
   * }
   * String command = "(with-precise-paraphrase-off (generate-phrase "
   * + cycObject.stringApiValue() + " :DEFAULT nil " + mt.stringApiValue() + "))";
   * return converseString(command);
   * }
   */
  
  protected void verifyPossibleDenotationalTerm(CycObject cycObject) throws IllegalArgumentException {
    if (!(cycObject instanceof DenotationalTerm || cycObject instanceof CycArrayList)) {
      throw new IllegalArgumentException(
              "cycObject must be a Cyc denotational term " + cycObject.cyclify());
    }
  }
  
  /**
   * Clear the cyclist value for the current thread.  If the current CycClient has a default
 Cyclist, that cyclist will now become the current cyclist.
   */
  public static void clearCurrentCyclist() {
    currentCyclist.set(null);
  }
  
  /**
   *
   * Specify that this thread should use a particular Cyclist.  This value will override (for the current thread only) any
   * value that might have been set via {@link #setCyclist}.
   * @param cyclist the cyclist for the current thread
   */
  public static Fort setCurrentCyclist(Fort cyclist) {
    currentCyclist.set(cyclist);
    return cyclist;
  }

  /**
   * Specify that this thread should use a particular Cyclist. This value will override (for the
   * current thread only) any value that might have been set via {@link #setCyclist}.

 Will throw an exception if there is no CycClient set for the current thread.
   *
   * @param cyclist String representation of the cyclist for the current thread (with or without
   * '#$' prefixes)
   */
  public static Fort setCurrentCyclist(String cyclist) throws CycApiException, CycConnectionException {
    Object term = CycClient.getCurrent().getObjectTool().getHLCycTerm(cyclist);
    Fort newCyclist = null;
    if (term instanceof CycFort) {
      newCyclist = (CycFort) term;
    } else {
      // see if it is a blank name
      newCyclist = CycClient.getCurrent().getLookupTool().find(cyclist);
    }
    if (newCyclist == null) {
      throw new CycApiException(
              "Cannot interpret " + cyclist + " as a cyclist.");
    }
    return setCurrentCyclist(newCyclist);
  }
  

  /**
   * Returns the value of the Cyclist.  Returns the value from {@link #setCurrentCyclist} if one has been set.
   * Otherwise, returns the default as set with {@link @setCyclist}.  If that also has not been set,
   * return null.
   *
   * @return the value of the default Cyclist
   */
  @Override
  public Fort getCyclist() {    
    return (currentCyclist.get() != null) ? currentCyclist.get() : cyclist;
  }
  
  /**
   * Sets the value of the default Cyclist for this CycClient, whose identity will be attached via #$myCreator bookkeeping
 assertions to new KB entities created in this session.  Setting the current Cyclist (via {@link #setCurrentCyclist} will
   * override this default Cyclist within that thread.
   *
   * @param cyclistName the name of the default cyclist term
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void setCyclist(String cyclistName)
          throws CycConnectionException, CycApiException {
    if (cyclistName == null || "".equals(cyclistName)) {
      throw new CycApiException("Invalid cyclist name specified.");
    }
    Object term = getObjectTool().getHLCycTerm(cyclistName);
    Fort newCyclist = null;
    if (term instanceof CycFort) {
      newCyclist = (CycFort) term;
    } else {
      // see if it is a blank name
      newCyclist = getLookupTool().find(cyclistName);
    }
    if (newCyclist == null) {
      throw new CycApiException(
              "Cannot interpret " + cyclistName + " as a cyclist.");
    }
    setCyclist(newCyclist);
  }

  /**
   * Sets the value of the default Cyclist, whose identity will be attached via #$myCreator bookkeeping
   * assertions to new KB entities created in this session.  Setting the current Cyclist (via {@link #setCurrentCyclist})
   * will override the default cyclist within that thread.
   *
   * @param cyclist the cyclist term
   */
  @Override
  public void setCyclist(Fort cyclist) {
    this.cyclist = cyclist;
  }

  /**
   * Returns the value of the project (KE purpose).
   *
   * @return he value of the project (KE purpose)
   */
  @Override
  public Fort getKePurpose() {
    return project;
  }

  /**
   * Sets the value of the KE purpose, whose project name will be attached via #$myCreationPurpose
   * bookkeeping assertions to new KB entities created in this session.
   *
   * @param projectName the string name of the KE Purpose term
   *
   * @throws UnknownHostException if cyc server host not found on the network
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void setKePurpose(String projectName)
          throws CycConnectionException, CycApiException {
    setKePurpose((CycFort) getObjectTool().getHLCycTerm(projectName));
  }

  /**
   * Sets the value of the KE purpose, whose project name will be attached via #$myCreationPurpose
   * bookkeeping assertions to new KB entities created in this session.
   *
   * @param project the KE Purpose term
   */
  @Override
  public void setKePurpose(Fort project) {
    this.project = project;
  }
  
  /**
   * Imports a MUC (Message Understanding Conference) formatted symbolic expression into cyc via
   * the function which parses the expression and creates assertions for the contained concepts
   * and relations between them.
   *
   * @param mucExpression the MUC (Message Understanding Conference) formatted symbolic expression
   * @param mtName the name of the microtheory in which the imported assertions will be made
   *
   * @return the number of assertions imported from the input MUC expression
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Deprecated
  public int importMucExpression(CycList mucExpression,
          String mtName)
          throws CycConnectionException, CycApiException {
    String command = makeSubLStmt("convert-netowl-sexpr-to-cycl-assertions",
            mucExpression, mtName);
    return converse().converseInt(command);
  }

  /**
   * Returns true if this KB is OpenCyc.
   *
   * @return true if this KB is OpenCyc, otherwise false
   *
   * @throws IOException if a data communication error occurs
   * @throws UnknownHostException if cyc server host not found on the network
   */
  @Override
  public synchronized boolean isOpenCyc() throws CycConnectionException {
    if (isOpenCyc == null) {
      try {
        isOpenCyc = converse().converseBoolean("(cyc-opencyc-feature)");
      } catch (CycApiException e) {
        isOpenCyc = false;
      }
    }

    return isOpenCyc;
  }

  /**
   * Returns the Cyc image ID.
   *
   * @return the Cyc image ID string
   *
   * @throws IOException if a communications error occurs
   * @throws UnknownHostException if the Cyc server cannot be found
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public String getCycImageID()
          throws CycConnectionException, CycApiException {
    return converse().converseString(CYC_IMAGE_ID_EXPRESSION);
  }
  static private final String CYC_IMAGE_ID_EXPRESSION = makeSubLStmt(
          "cyc-image-id");
  
  public static boolean isPossibleExternalIDString(final Object obj) {
    return is64BitString(obj);
  }

  private static boolean is64BitString(final Object obj) {
    if (obj instanceof String) {
      return is64Bit((String) obj);
    } else {
      return false;
    }
  }

  private static boolean is64Bit(final String string) {
    final StringCharacterIterator i = new StringCharacterIterator(string);
    for (char c = i.first(); c != CharacterIterator.DONE; c = i.next()) {
      if (!is64Bit(c)) {
        return false;
      }
    }
    return true;
  }

  private static boolean is64Bit(final char c) {
    return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || //0-51
            (c >= '0' && c <= '9') || //52-61
            (c == '+') || (c == '/') || //62-63 original Base64 standard
            (c == '-') || (c == '_'); //62-63 modified Base64 for URL
  }

  /** Returns the XML datetime string corresponding to the given CycL date
   *
   * @param date the date naut
   * @return the XML datetime string corresponding to the given CycL date
   * @deprecated use DateConverter.
   */
  static public String xmlDatetimeString(final CycArrayList date) throws IOException, CycApiException {
    try {
      final CycNaut dateNaut = (CycNaut) CycNaut.convertIfPromising(date);
      final Date javadate = DateConverter.parseCycDate(dateNaut,
              TimeZone.getDefault(), false);
      int cycDatePrecision = DateConverter.getCycDatePrecision(dateNaut);
      if (cycDatePrecision > DateConverter.DAY_GRANULARITY) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(javadate);
      } else {
        return new SimpleDateFormat("yyyy-MM-dd").format(javadate);
      }
    } catch (Exception e) {
      return null;
    }
  }

  /**
   * Returns whether or not we have a valid lease with the Cyc server.
   *
   * @return whether or not we have a valid lease with the Cyc server
   */
  //Tag: Fix CycLeaseManager
  @Override
  public boolean hasValidLease() {
    boolean valid = false;
    for (Entry<String, LeaseManager> kv : cycConnection.getCycLeaseManagerMap().entrySet()){
      if (kv.getValue().hasValidLease()){
        valid = true;
      }
    }
    if (c != null) {
      for (Entry<InputStream, LeaseManager> kv : cycConnection.getCycLeaseManagerCommMap().entrySet()) {
        if (kv.getValue().hasValidLease()) {
          valid = true;
        }
      }  
    }
    return valid;
  }

  // Protected Area
  
  static KBTransaction getCurrentTransaction() {
    return currentTransaction.get();
  }

  static void setCurrentTransaction(KBTransaction transaction) {
    currentTransaction.set(transaction);
  }

  /**
   * Provides common local and remote CycClient object initialization.
   *
   * @throws IOException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  private final void commonInitialization()
          throws CycConnectionException, CycApiException {
    if (Log.current == null) {
      Log.makeLog("cyc-api.log");
    }
    
    final String apiRequestLogFile = "api-requests.lisp";
    if (areAPIRequestsLoggedToFile) {
      try {
        apiRequestLog = new FileWriter(apiRequestLogFile);
      } catch (IOException ioe) {
        throw new CycConnectionException("Could not write file " + apiRequestLogFile, ioe);
      }
    }
    cycAccessInstances.put(Thread.currentThread(), this);

    /* if (sharedCycAccessInstance == null) {
     * sharedCycAccessInstance = this;
     * } 
     */
    cycImageID = getCycImageID();
    try {
      DefaultInferenceParameterDescriptions.loadInferenceParameterDescriptions(
              this, 0);
    } catch (Exception e) {
      Logger logger = Logger.getLogger(com.cyc.baseclient.CycClient.class.getName());
      logger.log(Level.WARNING, "Could not load inference parameter descriptions.", e);
      Throwable curr = e;
      while (curr != null) {
        logger.warning(curr.getLocalizedMessage());
        curr = curr.getCause();
      }
    }

  }

  /** Re-establishes a stale binary CycConnection. */
  protected synchronized void reEstablishCycConnection() 
          throws CycConnectionException, CycApiException {
    Log.current.println(
            "Trying to re-establish a closed Cyc connection to " + this);
    previousAccessedMilliseconds = System.currentTimeMillis();
    cycConnection.close();
    
    if (this.c == null) {
      Log.current.println ("Connect using host: " + hostName + " and port: " + port);
      cycConnection = new CycConnection(hostName, port, this);
    } else {
      Log.current.println ("Connect using comm object: " + c.toString());
      cycConnection = new CycConnection(c, this);
      c.setCycConnection(cycConnection);
      
      // TODO: Vijay: There is a timing issue here.
      // If we do not sleep here, the next call to Cyc, which is getCycImageID()
      // enters a recursive loop of reEstablishCycConnection() and throws a 
      // stack-overflow exception.
      /*
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // Even having this makes the code throw stack-overflow
        //Thread.currentThread().interrupt();
      }
      */ 
    }

    if (!(cycImageID.equals(getCycImageID()))) {
      Log.current.println("New Cyc image detected, resetting caches.");
      CycObjectFactory.resetCaches();
    }
  }

  /*
   * Should the connection to the Cyc server be re-established if it for some reason becomes unreachable?
   * If true, a reconnect will be attempted, and a connection will be established with whatever Cyc
   * server is reachable to the original address, even if it is a different server process."
   */
  @Override
  public boolean getReestablishClosedConnections() {
    return reestablishClosedConnections;
  }

  /*
   * If true, the CycClient will try to re-establish a connection with a Cyc server at the
   * provided address. Note that this may end up connecting to a different Cyc server than
   * it was originally connected to. If it is important for your application that the CycClient only
   * ever connect to a single server, and not connect to a different server if the original one
   * becomes inaccessible, be sure to set this to false.
   * Default value is true.
   */
  @Override
  public void setReestablishClosedConnections(boolean value) {
    reestablishClosedConnections = value;
  }
  
  @Override
  public CycCommandTool converse() {
    if (converseTool == null) {
      converseTool = new CycCommandTool(this);
    }
    return converseTool;
  }
  
  @Override
  public CycAssertTool getAssertTool() {
    if (assertTool == null) {
      assertTool = new CycAssertTool(this);
    }
    return assertTool;
  }

  @Override
  public CycComparisonTool getComparisonTool() {
    if (comparisonTool == null) {
      comparisonTool = new CycComparisonTool(this);
    }
    return comparisonTool;
  }
  
  @Override
  public InferenceTool getInferenceTool() {
    if (inferenceTool == null) {
      inferenceTool = new CycInferenceTool(this);
    }
    return inferenceTool;
  }

  @Override
  public CycInspectorTool getInspectorTool() {
    if (inspectorTool == null) {
      inspectorTool = new CycInspectorTool(this);
    }
    return inspectorTool;
  }

  @Override
  public CycLookupTool getLookupTool() {
    if (lookupTool == null) {
     lookupTool  = new CycLookupTool(this);
    }
    return lookupTool;
  }

  @Override
  public CycObjectTool getObjectTool() {
    if (objectTool == null) {
      objectTool = new CycObjectTool(this);
    }
    return objectTool;
  }

  @Override
  public CycUnassertTool getUnassertTool() {
    if (unassertTool == null) {
      unassertTool = new CycUnassertTool(this);
    }
    return unassertTool;
  }
  /* 
  @Override
  public ServerProfile getServerProfile() {
    if (cycProfile == null) {
      cycProfile = new CycServerProfile(this);
    }
    return cycProfile;
  }
  */
  /**
   * @deprecated Will either by moved to the KnowledgeManagement API, or deleted.
   * @return 
   */
  public CycOwlTool getOwlTool() {
    if (owlTool == null) {
      owlTool = new CycOwlTool(this);
    }
    return owlTool;
  }

  /**
   * @deprecated Will either by moved to the KnowledgeManagement API, or deleted.
   * @return 
   */
  public CycRKFTool getRKFTool() {
    if (rkfTool == null) {
      rkfTool = new CycRKFTool(this);
    }
    return rkfTool;
  }
    
  @Override
  public CycServerInfo getServerInfo() {
    if (serverInfo == null) {
      serverInfo = new CycServerInfo(this);
    }
    return serverInfo;
  }
  
  
  // Protected
  
  /**
   * Returns a with-bookkeeping-info macro expression.
   *
   * @return a with-bookkeeping-info macro expression
   */
  protected String withBookkeepingInfo() {
    String projectName = "nil";

    if (project != null) {
      projectName = project.stringApiValue();
    }

    String cyclistName = "nil";

    if (getCyclist() != null) {
      cyclistName = getCyclist().stringApiValue();
    }

    return "(with-bookkeeping-info (new-bookkeeping-info " + cyclistName + " (the-date) "
            + projectName + "(the-second)) ";
  }
  
  /** 
   * Converses with Cyc to perform an API command. Creates a new connection for this command if
   * the connection is not persistent.
   *
   * @param command the command string or CycArrayList
   *
   * @return the result as an object array of two objects
   * @see CycConnectionInterface#converse(Object)
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  protected Object[] converse(Object command)
          throws CycConnectionException, CycApiException {
    Object[] response = {null, null};
    try {
      maybeLogCommand(command);
    } catch (IOException ioe) {
      throw new CycConnectionException(ioe);
    }
    response = converseWithRetrying(command);
    previousAccessedMilliseconds = System.currentTimeMillis();
    maybeLogResponse(response);
    return response;
  }

  /**
   * Send a command to Cyc, and maybe try to recover from a closed connection.
   *
   * @param command - String, CycArrayList, or Worker
   * @return the results of evaluating the command
   * @throws CycApiException
   * @throws IOException
   * @see #getReestablishClosedConnections()
   * @see CycConnection#converse(java.lang.Object)
   * @see CycConnection#converseBinary(com.cyc.baseclient.api.SubLWorker)
   */
  protected Object[] converseWithRetrying(Object command) throws CycApiException, CycConnectionException {
    Object[] response = {null, null};
    try {
      response = doConverse(getCycConnection(), command);
    } catch (CycApiClosedConnectionException ex) {
      if (getReestablishClosedConnections()) {
        reEstablishCycConnection();
        response = doConverse(cycConnection, command);
      } else {
        throw (ex);
      }
    }
    return response;
  }
  
  
  // Private Area

  private void maybeReEstablishCycConnection() throws CycConnectionException, CycApiException {
    if (!isSOAPConnection) {
//      if ((previousAccessedMilliseconds + MAX_UNACCESSED_MILLIS) < System.currentTimeMillis()) {
//        Log.current.println("Re-establishing a stale Cyc connection.");
//        reEstablishCycConnection();
//      }
//      else
      if (!((CycConnection) cycConnection).isValidBinaryConnection()) {
        Log.current.println(
                "Re-establishing an invalid Cyc connection  to " + this);
        reEstablishCycConnection();
      }
    }
  }

  private void maybeLogCommand(Object command) throws CycApiException, IOException {
    if (trace > CycConnection.API_TRACE_NONE || areAPIRequestsLoggedToFile) {
      final CycList commandCycList = (command instanceof CycList) ? (CycList) command : getObjectTool().makeCycList(
              (String) command);
      final String prettyCommandCycList = commandCycList.toPrettyCyclifiedString(
              "");
      final String escapedCommandCycList = commandCycList.toPrettyEscapedCyclifiedString(
              "");
      if (areAPIRequestsLoggedToFile) {
        apiRequestLog.write(escapedCommandCycList);
        apiRequestLog.write('\n');
      }
      if (trace > CycConnection.API_TRACE_NONE) {
        Log.current.println(prettyCommandCycList + "\n--> cyc");
      }
    }
  }

  private void maybeLogResponse(Object[] response) {
    if (trace > CycConnection.API_TRACE_NONE) {
      String responseString;

      if (response[1] instanceof CycArrayList) {
        responseString = ((CycArrayList) response[1]).toPrettyString("");
      } else if (response[1] instanceof CycFort) {
        responseString = ((CycFort) response[1]).cyclify();
      } else {
        responseString = response[1].toString();
      }
      Log.current.println("cyc --> " + responseString);
    }
  }

  private Object[] doConverse(final CycConnectionInterface cycConnection,
          final Object command) throws CycConnectionException {
    if (command instanceof Worker) {
      //SubL workers talk directly to Cyc:
      cycConnection.converseBinary((Worker) command);
      return null;
    } else {
      //String or CycArrayList commands go through a few intermediaries:
      return cycConnection.converse(command);
    }
  }

  private CycConstant makePrefetchedConstant(String guidStr,
          HashMap constantInfoDictionary) {
    CycGuid guid = CycObjectFactory.makeGuid(guidStr);
    CycConstant prefetchedConstant = getObjectTool().makeConstantWithGuidName(guid,
            (String) constantInfoDictionary.get(guid));
    CycObjectFactory.addCycConstantCache(prefetchedConstant);
    return prefetchedConstant;
  }
  
  public static byte[] getCycInitializationRequest(UUID uuid) {
    CycArrayList request = new CycArrayList();
    request.add(new CycSymbol("INITIALIZE-JAVA-API-PASSIVE-SOCKET"));
    request.add(uuid.toString());
    ByteArrayOutputStream baos = new ByteArrayOutputStream(2048);
    CfaslOutputStream cfo = new CfaslOutputStream(baos);
    try {
      cfo.writeObject(request);
      cfo.flush();
    } catch (IOException ioe) {} // ignore, should never happen
    return baos.toByteArray();
  }
  
  public static void handleCycInitializationRequestResponse(InputStream is) throws IOException {
    CfaslInputStream inboundStream = new CfaslInputStream(is);
    // read and ignore the status
    inboundStream.resetIsInvalidObject();
    Object status = inboundStream.readObject();
    // read and ignore the response
    inboundStream.resetIsInvalidObject();
    Object response = inboundStream.readObject();
  }
  
  
  // Internal Rep
  
  private Boolean isOpenCyc = null;
  
  /** the Cyc server host name */
  protected String hostName;
  /** the Cyc server host tcp port number */
  protected int port;
  
  protected Comm c;
  
  /** the Cyc server OK response code */
  protected static final int OK_RESPONSE_CODE = 200;
  /** the parameter that, when true, causes a trace of the messages to and from the server */
  protected int trace = CycConnection.API_TRACE_NONE;
  //protected int trace = CycConnection.API_TRACE_MESSAGES;
  //protected int trace = CycConnection.API_TRACE_DETAILED;
  private static final String UTF8 = "UTF-8";
  /** the current Cyc Cyclist (user) */
  private Fort cyclist = null;
  /** the current Cyc project */
  private Fort project = null;

  /**
   * Reference to <tt>CycConnection</tt> object which manages the api connection to the OpenCyc
   * server.
   */
  protected CycConnectionInterface cycConnection;

  /** the timestamp for the previous access to Cyc, used to re-establish too-long unused connections */
  private long previousAccessedMilliseconds = System.currentTimeMillis();
  /** the maximum time that the CycClient connection is allowed to be unused before
 establishing a fresh connection (ten hours)
   */
  protected static final long MAX_UNACCESSED_MILLIS = 36000000;
  /** the Cyc image ID used for detecting new Cyc images that cause the constants cache to be reset */
  private String cycImageID;
  /** the Cyc lease manager that acquires Cyc api service leases */
  //Tag: Fix CycLeaseManager
  //private CycLeaseManager cycLeaseManager;
    
  /** The indicator that this CycClient object is using a SOAP connection to communicate with Cyc */
  private boolean isSOAPConnection = false;
  private boolean reestablishClosedConnections = true;
  private static ThreadLocal<CycClient> currentCyc = new ThreadLocal<CycClient>() {
    @Override
    protected CycClient initialValue() {
      // Commenting this out. Assuming a default Cyc server often leads to bugs. - nwinant, 2014-02-10
      /*
      try {
        return new CycClient();
      } catch (Exception ex) {
        // If we care about this exception, we shouldn't swallow it. - nwinant, 2014-02-10
        Logger.getLogger(CycClient.class.getName()).log(Level.SEVERE, null, ex);
      }
      */
      return null;
    }
  };

  private static ThreadLocal<Fort> currentCyclist = new ThreadLocal<Fort>() {
    @Override
    protected CycFort initialValue() {
        return null;
    }
  };

  private static ThreadLocal<KBTransaction> currentTransaction = new ThreadLocal<KBTransaction>() {
    @Override
    protected KBTransaction initialValue() {
      return null;
    }
  };
  private static Map<String, CycClient> currentCycAccesses = Collections.synchronizedMap(
          new HashMap<String, CycClient>());
  
  private CycCommandTool converseTool;
  private CycAssertTool assertTool;
  private CycComparisonTool comparisonTool;
  private CycInferenceTool inferenceTool;
  private CycInspectorTool inspectorTool;
  private CycLookupTool lookupTool;
  private CycObjectTool objectTool;
  private CycUnassertTool unassertTool;
  private CycOwlTool owlTool;
  private CycRKFTool rkfTool;
  private CycServerInfo serverInfo;
}
