
package ch_15_web_programmin_server_side.webService.client;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OrderProcess", targetNamespace = "http://jawxs.ibm.tutorial/jaxws/orderprocess", wsdlLocation = "http://localhost:8080/OrderProcessWeb/orderprocess?wsdl")
public class OrderProcess
    extends Service
{

    private final static URL ORDERPROCESS_WSDL_LOCATION;
    private final static WebServiceException ORDERPROCESS_EXCEPTION;
    private final static QName ORDERPROCESS_QNAME = new QName("http://jawxs.ibm.tutorial/jaxws/orderprocess", "OrderProcess");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/OrderProcessWeb/orderprocess?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ORDERPROCESS_WSDL_LOCATION = url;
        ORDERPROCESS_EXCEPTION = e;
    }

    public OrderProcess() {
        super(__getWsdlLocation(), ORDERPROCESS_QNAME);
    }

    public OrderProcess(WebServiceFeature... features) {
        super(__getWsdlLocation(), ORDERPROCESS_QNAME, features);
    }

    public OrderProcess(URL wsdlLocation) {
        super(wsdlLocation, ORDERPROCESS_QNAME);
    }

    public OrderProcess(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ORDERPROCESS_QNAME, features);
    }

    public OrderProcess(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderProcess(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OrderProcessService
     */
    @WebEndpoint(name = "OrderProcessPort")
    public OrderProcessService getOrderProcessPort() {
        return super.getPort(new QName("http://jawxs.ibm.tutorial/jaxws/orderprocess", "OrderProcessPort"), OrderProcessService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderProcessService
     */
    @WebEndpoint(name = "OrderProcessPort")
    public OrderProcessService getOrderProcessPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jawxs.ibm.tutorial/jaxws/orderprocess", "OrderProcessPort"), OrderProcessService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ORDERPROCESS_EXCEPTION!= null) {
            throw ORDERPROCESS_EXCEPTION;
        }
        return ORDERPROCESS_WSDL_LOCATION;
    }

}
