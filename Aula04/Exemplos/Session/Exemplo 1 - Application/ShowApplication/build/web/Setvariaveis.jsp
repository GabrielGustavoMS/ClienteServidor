<%-- 
    Document   : Setvariaveis
    Created on : 07/10/2014, 10:53:44
    Author     : 149317
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           session.setAttribute("gLogin", "prof");
           session.setAttribute("gSenha", "123");
           session.setAttribute("contador1", "0");
           application.setAttribute("contador2", "0");
        %>
    </body>
</html>
