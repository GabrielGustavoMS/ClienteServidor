<%-- 
    Document   : listarProdutos
    Created on : 14/04/2020, 13:33:03
    Author     : hight
--%>


<%@page import="java.io.IOException"%>
<%@page import="java.io.FileWriter"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="classes.Produto"%>
<%@page import="classes.ProdutoDAO"%>
<%
    //Devolve um Json como resposta a uma consulta na lista de produtos do banco
    ArrayList<Produto> produtos = new ProdutoDAO().listarProdutos();
 
    Gson gson = new Gson();
    String json = gson.toJson(produtos);
  
   response.setContentType("application/json");
   response.setCharacterEncoding("UTF-8");
   out.print(json);
   out.flush();
   
    
%>
