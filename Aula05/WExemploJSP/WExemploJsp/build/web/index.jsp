<%-- 
    Document   : index
    Created on : 21/08/2018, 14:26:14
    Author     : Alexander
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css"/>
        
    </head>
    <body>
        <h1>Contatos</h1>
        <%
            ArrayList<String> agendaNome = new ArrayList();
            agendaNome.add("Contato 1");
            agendaNome.add("Contato 2");
            agendaNome.add("Contato 3");
            agendaNome.add("Contato 4");
            
            ArrayList<String> agendaTel = new ArrayList();
            agendaTel.add("1111-1111");
            agendaTel.add("2222-2222");
            agendaTel.add("3333-3333");
            agendaTel.add("4444-4444");
        %>
        <table>
            <tr>
                <td>Nome</td>
                <td>Telefone</td>
            </tr>
            <%
            for(int ind=0;ind<agendaNome.size();ind++){
                
                out.print("<tr><td>" + agendaNome.get(ind) + "</td><td>" + agendaTel.get(ind) + "</td></tr>" );
            }
            %>
        </table>
        <script src="bootstrap/js/bootstrap.js"></script>
        <script src="jquery/jquery.js"></script>
    </body>
</html>
