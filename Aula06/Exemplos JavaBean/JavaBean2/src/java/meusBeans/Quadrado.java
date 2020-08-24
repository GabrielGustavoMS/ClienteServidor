package meusBeans;
import java.io.Serializable;
public class Quadrado implements Serializable {
	private float lado;
	public Quadrado() {
		lado=0;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getArea () {
		return lado*lado;
	}

	public float getPerimetro () {
		return 4*lado;
	}
}//fim da classe

