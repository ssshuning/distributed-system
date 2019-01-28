
package cmu.edu.andrew.shuningc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Project3Task2Service", targetNamespace = "http://shuningc.andrew.edu.cmu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Project3Task2Service {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws NoSuchAlgorithmException_Exception
     * @throws ParserConfigurationException_Exception
     * @throws SAXException_Exception
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dealMessage", targetNamespace = "http://shuningc.andrew.edu.cmu/", className = "cmu.edu.andrew.shuningc.DealMessage")
    @ResponseWrapper(localName = "dealMessageResponse", targetNamespace = "http://shuningc.andrew.edu.cmu/", className = "cmu.edu.andrew.shuningc.DealMessageResponse")
    @Action(input = "http://shuningc.andrew.edu.cmu/Project3Task2Service/dealMessageRequest", output = "http://shuningc.andrew.edu.cmu/Project3Task2Service/dealMessageResponse", fault = {
        @FaultAction(className = ParserConfigurationException_Exception.class, value = "http://shuningc.andrew.edu.cmu/Project3Task2Service/dealMessage/Fault/ParserConfigurationException"),
        @FaultAction(className = SAXException_Exception.class, value = "http://shuningc.andrew.edu.cmu/Project3Task2Service/dealMessage/Fault/SAXException"),
        @FaultAction(className = IOException_Exception.class, value = "http://shuningc.andrew.edu.cmu/Project3Task2Service/dealMessage/Fault/IOException"),
        @FaultAction(className = NoSuchAlgorithmException_Exception.class, value = "http://shuningc.andrew.edu.cmu/Project3Task2Service/dealMessage/Fault/NoSuchAlgorithmException")
    })
    public String dealMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws IOException_Exception, NoSuchAlgorithmException_Exception, ParserConfigurationException_Exception, SAXException_Exception
    ;

}