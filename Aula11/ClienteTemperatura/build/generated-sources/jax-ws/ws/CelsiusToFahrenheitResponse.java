
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de celsiusToFahrenheitResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="celsiusToFahrenheitResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "celsiusToFahrenheitResponse", propOrder = {
    "_return"
})
public class CelsiusToFahrenheitResponse {

    @XmlElement(name = "return")
    protected float _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     */
    public float getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     */
    public void setReturn(float value) {
        this._return = value;
    }

}
