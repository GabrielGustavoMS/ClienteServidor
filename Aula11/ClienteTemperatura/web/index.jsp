<%-- 
    Document   : index
    Created on : 28/04/2020, 16:10:46
    Author     : hight
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String valorC = request.getParameter("valorC");
    String valorF = request.getParameter("valorF");
    if (valorC == null) {
        valorC = "0";
    }
    if (valorF == null) {
        valorF = "32";
    }
%>
<!DOCTYPE html>
<html>
    <head>
         <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor de Temperatura</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css"/>

    </head>
    <body>
        <section class="container container-fluid">
            <h1 class="text-center mt-3">Conversor de medidas</h1>
            <form id="formTemp" action="calcular.jsp" class="mt-5">
                <article class="container-fluid">
                    <div class="row mt-3">
                        <label for="f">Temperatura em  Fahrenheit:</label> 
                        <input type="number"  id="f" name="f" value="<%= valorF%>"
                               placeholder="Digite a temperatura em Fahrenheit"
                               class="form-control" >
                    </div>
                    <div class="row mt-3">
                        <label for="c">Temperatura em Celsius:</label>
                        <input type="number"  id="c" name="c" value="<%=valorC%>"
                               placeholder="Digite a temperatura em Celsius" 
                               class="form-control">
                    </div>
                </article>
                <article class="mt-5 container-fluid ">
                    <div class="row">
                        <div class="col-lg-6 col-md-auto col-sm-auto mt-2  text-center">
                            <input type="button" value="Celsius Para Fahrenheit"
                                   onclick='enviarForm("Celsius Para Fahrenheit")'
                                   class="btn btn-success "/>
                        </div>
                        <div class="col-lg-6  col-md-auto col-sm-auto mt-2 text-center">

                            <input type="button" value="Fahrenheit Para Celsius"  
                                   onclick='enviarForm("Fahrenheit Para Celsius")'
                                   class="btn btn-primary"/>
                        </div>
                    </div>
                </article>
                <article class="mt-5 container-fluid">
                    <div class="row">
                        <span id="camposMsg" class="text-center text-danger"></span>
                    </div>
                </article>
                <input type="hidden"  name="acao" id="acao">
            </form>
        </section>

        <script src="_js/clienteScripts.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
    </body>
</html>
