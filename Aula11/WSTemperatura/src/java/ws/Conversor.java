/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hight
 */
@WebService(serviceName = "Conversor")
public class Conversor {


    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "fahrenheitToCelsius")
    public float fahrenheitToCelsius(@WebParam(name = "f") float f) {
        //TODO write your implementation code here:
        float c;
        c = (f-32)/1.8f;
        return c;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "celsiusToFahrenheit")
    public float celsiusToFahrenheit(@WebParam(name = "c") float c) {
        //TODO write your implementation code here:
        float f;
        f = (c * 9/5) + 32f; 
        return f;
    }
}
