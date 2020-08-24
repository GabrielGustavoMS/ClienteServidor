package br.com.codigosfontes.ws;
 
import br.com.codigosfontes.domain.Tempo;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@WebService(endpointInterface = "br.com.codigosfontes.ws.ITempoSEI")
@Path("previsao-tempo")
public class ServicoTempoSIB implements ITempoSEI{
 
    @Override
    @GET
    @Path("{cidade}/{data}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON }) 
    public Tempo tempoDia(@PathParam("cidade")String cidade, @PathParam("data") String data) {
 
        Tempo tempo = new Tempo();
 
        tempo.setCidade(cidade);
        tempo.setData(data);
        //retorna a temperatura
        tempo.setTempo(String.valueOf(1 + (Math.random()*40)).substring(0, 4) +"C");
 
        return tempo;
    }
    
    @GET
    @Path("/mensagem")
    @Produces(MediaType.APPLICATION_JSON )
    @Consumes(MediaType.APPLICATION_JSON ) 
    public Tempo msg() {
 
        Tempo tempo = new Tempo();
 
        tempo.setCidade("Caraguatatuba");
        tempo.setData("11/05/2020");
        //retorna a temperatura
        tempo.setTempo(String.valueOf(1 + (Math.random()*40)).substring(0, 4) +"C");
 
        return tempo;
    }
}