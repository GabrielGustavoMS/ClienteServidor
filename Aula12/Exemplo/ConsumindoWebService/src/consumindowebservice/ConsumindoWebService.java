package consumindowebservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConsumindoWebService {

    public static void main(String[] args) {
        try {
 
            URL url = new URL("http://localhost:8084/TesteWebService/ws/previsao-tempo/mensagem");
            //http://localhost:8080/TesteWebService/ws/previsao-tempo/mensagem
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
 
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Falhou : HTTP código de erro: "
                        + conn.getResponseCode());
            }
 
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
 
            String output;
            System.out.println("Recebeu do servidor:");
 
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
 
            conn.disconnect();
 
        } catch (MalformedURLException e) {
            e.printStackTrace();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
