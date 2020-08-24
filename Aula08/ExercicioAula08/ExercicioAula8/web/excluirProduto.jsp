<%-- 
    Document   : excluirProduto
    Created on : 14/04/2020, 13:08:22
    Author     : hight
--%>

<%@page import="classes.ProdutoDAO"%>

<jsp:useBean id="produto" class="classes.Produto"/>
<jsp:setProperty property="id" name="produto"/>
<%
    String resp = new ProdutoDAO().excluirProduto(produto);
    response.sendRedirect("index.jsp?status="+resp);
%>