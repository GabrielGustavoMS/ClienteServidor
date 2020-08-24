<%-- 
    Document   : cadastrarProduto
    Created on : 14/04/2020, 12:30:23
    Author     : hight
--%>

<%@page import="classes.ProdutoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:useBean id="produto" class="classes.Produto"/>
<jsp:setProperty property="*" name="produto" />
<%
    String resp = new ProdutoDAO().cadastrarProduto(produto);
    response.sendRedirect("index.jsp?status="+resp);
%>