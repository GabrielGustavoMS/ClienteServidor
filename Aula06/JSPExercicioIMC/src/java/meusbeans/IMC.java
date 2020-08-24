/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meusbeans;

import java.math.BigDecimal;


/**
 *
 * @author hight
 */
public class IMC {
    private float peso, altura, imc;
    String comentario;

    public IMC() {
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
    
    

    public float getImc() {
        this.imc = (float) (this.peso/(Math.pow(this.altura, 2)));
        BigDecimal numberBigDecimal = new BigDecimal(imc);
        this.imc  = Float.parseFloat(numberBigDecimal .setScale(2, BigDecimal.ROUND_HALF_UP)+"");
        this.imc = this.imc;
        return imc;
    }

    public String getComentario() {
        if(this.imc<=18.5){
            this.comentario = "Abaixo do peso";
        }else if(this.imc>18.5 && this.imc<=25){
            this.comentario = "No peso ideal";
        }else if(this.imc>25 && this.imc<=30){           
            this.comentario = "Acima do peso ideal";
        }else{         
            this.comentario = "Obeso";
        }
        return comentario;
    }
    
}
