package br.com.codigosfontes.domain;
 
import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement
public class Tempo implements Serializable {
 
    private String cidade;
    private String data;
    private String tempo;
 
    public String getCidade() {
        return cidade;
    }
 
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
 
    public String getData() {
        return data;
    }
 
    public void setData(String data) {
        this.data = data;
    }
 
    public String getTempo() {
        return tempo;
    }
 
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }   
 
    @Override
    public String toString() {
        return "Cidade=" + cidade + ", data=" + data + ", tempo=" + tempo;
    }
}