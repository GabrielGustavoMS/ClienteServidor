package br.com.codigosfontes.ws;
 
import br.com.codigosfontes.domain.Tempo;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.PathParam;
 
@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public interface ITempoSEI { 
 
    @WebMethod Tempo tempoDia(@PathParam("cidade") String cidade, @PathParam("data") String data);
 
}