
package stackexchange.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserWS", targetNamespace = "http://webservice.stackexchange/", wsdlLocation = "http://localhost:8081/StackExchange-WebService/UserWS?wsdl")
public class UserWS_Service
    extends Service
{

    private final static URL USERWS_WSDL_LOCATION;
    private final static WebServiceException USERWS_EXCEPTION;
    private final static QName USERWS_QNAME = new QName("http://webservice.stackexchange/", "UserWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/StackExchange-WebService/UserWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERWS_WSDL_LOCATION = url;
        USERWS_EXCEPTION = e;
    }

    public UserWS_Service() {
        super(__getWsdlLocation(), USERWS_QNAME);
    }

    public UserWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERWS_QNAME, features);
    }

    public UserWS_Service(URL wsdlLocation) {
        super(wsdlLocation, USERWS_QNAME);
    }

    public UserWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERWS_QNAME, features);
    }

    public UserWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserWS
     */
    @WebEndpoint(name = "UserWSPort")
    public UserWS getUserWSPort() {
        return super.getPort(new QName("http://webservice.stackexchange/", "UserWSPort"), UserWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserWS
     */
    @WebEndpoint(name = "UserWSPort")
    public UserWS getUserWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.stackexchange/", "UserWSPort"), UserWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERWS_EXCEPTION!= null) {
            throw USERWS_EXCEPTION;
        }
        return USERWS_WSDL_LOCATION;
    }

}