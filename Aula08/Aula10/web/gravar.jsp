<%@page import="classes.Aluno"%>
<%@page import="classes.AlunoDAO"%>
<%
    //Captura os dados do formul�rio do index
    String rgm = request.getParameter("rgm");
    String nome = request.getParameter("nome");
    String nota1 = request.getParameter("nota1");
    String nota2 = request.getParameter("nota2");
    
    //Monta objeto Aluno
    Aluno aluno = new Aluno();
    aluno.setRgm(rgm);
    aluno.setNome(nome);
    aluno.setNota1(Float.parseFloat(nota1));
    aluno.setNota2(Float.parseFloat(nota2));
    
    //Grava o dado
    String resp = new AlunoDAO().inserirAluno(aluno);
        
    //Manda de volta para o index com uma mensagem (sucesso)
    response.sendRedirect("index.jsp?status=" + resp);
%>

