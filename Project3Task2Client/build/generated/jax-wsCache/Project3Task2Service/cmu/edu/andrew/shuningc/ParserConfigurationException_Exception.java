
package cmu.edu.andrew.shuningc;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ParserConfigurationException", targetNamespace = "http://shuningc.andrew.edu.cmu/")
public class ParserConfigurationException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ParserConfigurationException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ParserConfigurationException_Exception(String message, ParserConfigurationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ParserConfigurationException_Exception(String message, ParserConfigurationException faultInfo, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: cmu.edu.andrew.shuningc.ParserConfigurationException
     */
    public ParserConfigurationException getFaultInfo() {
        return faultInfo;
    }

}
