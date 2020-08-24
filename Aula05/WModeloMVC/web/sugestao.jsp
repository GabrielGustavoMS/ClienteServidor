<%-- 
    Document   : sugestao
    Created on : 01/09/2019, 16:05:12
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<html>
    <body>
        <h1 align =center="center"> Recomendação Musical: JSP</h1>
        <% ArrayList<String> estilo = (ArrayList) request.getAttribute("listaRecomendada");
            for (String musica : estilo) {
                out.print("<br>" + musica);
            }
        %>
    </body>
</html>

