/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author hight
 */
public class Processar {
    public static float fahrenheitToCelsius(float f){
        ws.Conversor_Service service = new ws.Conversor_Service();
        ws.Conversor port    = service.getConversorPort();
        return port.fahrenheitToCelsius(f);
    }
    public static float celsiusToFahrenheit(float c){
        ws.Conversor_Service service = new ws.Conversor_Service();
        ws.Conversor port = service.getConversorPort();
        return port.celsiusToFahrenheit(c);
                
    }
}
