package com.cyc.base;

import com.cyc.base.conn.CycConnectionInterface;
import com.cyc.baseclient.CycClientManager;
import java.net.URL;
import java.util.ServiceLoader;

/**
 *
 * FIXME: resolve interactive stuff
 * 
 * @author nwinant
 */
abstract public class CycAccessManager {
  
  private static CycAccessManager manager;

  /**
   * Returns an implementation of {@link CycAccessManager}. It will return the first
   * implementation it finds which has been registered per {@link java.util.ServiceLoader}.
   * If one has not been specified, it will fall back on the default implementation.
   * 
   * @return an object which implements CycAccessManager.
   */
  public static synchronized CycAccessManager get() {
    // Note: The relevant service provider file in META-INF/services
    //       is generated by the serviceloader-maven-plugin, specified
    //       in the pom.xml file. You're welcome, Dave! - nwinant, 2014-04-30
    if (manager == null) {
       ServiceLoader<CycAccessManager> loader = 
            ServiceLoader.load(CycAccessManager.class);
       for (CycAccessManager mgr : loader) {
         // CycClientManager is the default provider,  
         //   but any other implementation will override it. - nwinant, 2014-04-28
         if ((manager == null) || CycClientManager.class.isInstance(mgr)) {
           manager = mgr;
         }
       }
    }
    return manager;
  }
  
  
  // Public
  
  /**
   * Constructs a new CycAccess object.
   *
   * @return 
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  abstract public CycAccess getAccess() throws CycConnectionException, CycApiException;

  /**
   * Constructs a new CycAccess object.
   *
   * @param conn the Cyc connection object (in persistent, binary mode)
   * @return 
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  abstract public CycAccess getAccess(CycConnectionInterface conn) throws CycConnectionException, CycApiException;

  /**
   * Constructs a new CycAccess object for a SOAP connection.
   *
   * @param endpointURL the SOAP XML endpoint URL which indicates the Cyc API web services host
   * @param hostName the name of the computer hosting the Cyc server
   * @param basePort the Cyc server base listening port
   * @return 
   *
   * @throws CycConnectionException if a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  abstract public CycAccess getAccess(URL endpointURL, String hostName, int basePort) throws CycConnectionException, CycApiException;

  /**
   * Constructs a new CycAccess object given a host name, port, communication mode, and messaging mode
   *
   * @param hostName the host name
   * @param basePort the base (HTML serving) TCP socket port number
   * @return 
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  abstract public CycAccess getAccess(String hostName, int basePort) throws CycConnectionException, CycApiException;
  
  /*
  public CycAccess getCycAccess(Comm c) 
          throws CycApiException;
  */
  
  /**
   * Attempt to create a new CycAccess object from defaultHost and defaultPort;
   * prompting the user if no Cyc server is accessible at that address. 
   *
   * @param defaultHost
   * @param defaultPort
   * @return
   */
//  public CycAccess getNewAccessInteractively(String defaultHost, int defaultPort);
  
  /**
   * Prompts the user (via a JOptionPane), for a Cyc host & port, and returns a 
   * new CycAccess object. If no Cyc server is accessible at that address, it will
   * prompt the user again.
   * 
   * @return Returns a CycAccess object, or null if the user cancels out.
   */
//  public CycAccess getNewAccessInteractively();
  
  /**
   * Returns the CycAccess that is to be used for this thread.
   *
   * @return the CycAccess that is to be used for this thread.
   * @throws RuntimeException when there is no CycAccess for this thread.
   */
  abstract public CycAccess getCurrentAccess();

  /**
   *
   * @param access set the CycAccess object that will be used as the default CycAccess object for this thread.
   * @return 
   */
  abstract public CycAccess setCurrentAccess(CycAccess access);

  /**
   * Specify that this thread should use a CycAccess object pointing to
 <code>hostname</code> and
   * <code>port</code>.
   * This may use an existing CycAccess object, or if one can't be found, it will create a new CycAccess object
 and make that new CycAccess object the default one for this thread.
   *
   * @param hostName the name of the machine where the desired Cyc Server resides.
   * @param port the port number where the desired Cyc Server resides.
   * @return 
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   */
  abstract public CycAccess setCurrentAccess(String hostName, int port) throws CycConnectionException;

  /**
   * Returns true if there is a CycAccess object for this thread.
   *
   * @return true if there is a CycAccess object for this thread.
   */
  abstract public boolean hasCurrentAccess();

  /**
   * Sets the shared <tt>CycAccess</tt> instance.
   *
   * @param sharedCycAccessInstance shared<tt>CycAccess</tt> instance
   * @deprecated Use {@link #setCurrent(CycAccess)} instead.
   */
  @Deprecated
  abstract public void setSharedAccessInstance(CycAccess sharedCycAccessInstance);
}
