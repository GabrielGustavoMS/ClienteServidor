package pacotesjava;

import java.io.Serializable;

public class Aluno implements Serializable 
{ 
   private String rgm_aluno; 
   private String nome_aluno;  

   public Aluno()
   { 
   
   } 

   public Aluno(String rgm, String nome)
   { 
     nome_aluno  = nome;
     rgm_aluno   = rgm; 
   } 
   
   public void setnome_aluno(String nome)
   { 
     nome_aluno = nome; 
   } 

   public String getnome_aluno()
   { 
     return nome_aluno; 
   }
   
   public void setrgm_aluno(String rgm)
   { 
     rgm_aluno = rgm; 
   } 

   public String getrgm_aluno()
   { 
    return rgm_aluno; 
   } 

}