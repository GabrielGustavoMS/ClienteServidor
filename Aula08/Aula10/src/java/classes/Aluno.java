package classes;

public class Aluno {
    
    private String rgm;
    private String nome;
    private float nota1;
    private float nota2;
    
    public Aluno() {
        this.rgm = "";
        this.nome = "";
        this.nota1 = 0;
        this.nota2 = 0;
    }

    /**
     * @return the rgm
     */
    public String getRgm() {
        return rgm;
    }

    /**
     * @param rgm the rgm to set
     */
    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nota1
     */
    public float getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public float getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
}
