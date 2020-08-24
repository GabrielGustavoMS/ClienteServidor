package meusBeans;
 
public class SerieTag implements java.io.Serializable {
   private static float E=0.0001f;
   private float x;
   public SerieTag()  {  //construtor sem parâmetros obrigatório
   }

   public void setCoeficiente(float inValor) { //método set para uma propriedade do tipo write
	  x=inValor;
   }

   public float getSerie()  {     //método get para uma propriedade do tipo “read”
   	 float s=0; int i=1;
   	 while (1/(i*x) > E)
   	 {
   	 	s += 1/(i*x);
   	 	i++;
   	 }
     return s;
   }
}//fim da classe
