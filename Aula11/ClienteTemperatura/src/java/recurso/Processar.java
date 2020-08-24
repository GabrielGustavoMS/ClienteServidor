package recurso;

public class Processar {
    public static float fahrenheitToCelsius(float f){
        ws.Conversor_Service service = new ws.Conversor_Service();
        ws.Conversor port = service.getConversorPort();
        return port.fahrenheitToCelsius(f);
    }
}
