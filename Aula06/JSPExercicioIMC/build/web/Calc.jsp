<%-- 
    Document   : Calc
    Created on : 31/03/2020, 13:51:07
    Author     : hight
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> 
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
        <style>
            td{
                font-size: 2em;
                text-align: center;
            }
        </style>
    </head>
    <body>

        <jsp:useBean id="imcBean" class="meusbeans.IMC"/><br>
        <%--
        <jsp:setProperty property="*" name="imcBean"/>  <br>
        --%>
        <jsp:setProperty property="altura" name="imcBean"/>
        <jsp:setProperty property="peso" name="imcBean"/>

        <section class="container">
            <table class="table table-bordered table-dark table-striped">
                <tbody>
                    <tr class="">
                        <td>
                            <h2 class="text-center">Seu imc:</h2> 
                        </td>
                        <td>
                            <jsp:getProperty name="imcBean" property="imc"/><br>
                        </td>
                    </tr>
                    <tr>
                        <td><h2 class="text-center">Comentário:</h2>  </td>
                        <td><jsp:getProperty name="imcBean" property="comentario"/><br></td>
                    </tr>
                    <tr>
                        <td><h2 class="text-center">Altura em metros:</h2>    </td>
                        <td><jsp:getProperty name="imcBean" property="altura"/><br></td>
                    </tr>
                    <tr>
                        <td> <h2 class="text-center">Peso em kg:</h2>  </td>
                        <td>
                            <jsp:getProperty name="imcBean" property="peso"/><br></td>
                    </tr>
                </tbody>                
            </table>
<a href="index.jsp" class=" btn btn-success">Voltar à página inicial</a>












        </section>



    </body>
</html>
