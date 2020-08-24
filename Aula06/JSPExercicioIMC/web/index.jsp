<%-- 
    Document   : index
    Created on : 13/04/2020, 22:06:34
    Author     : hight
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css"/>
            <script type="text/javascript">
                function normalizarPontoFlutuante(){
                    var peso = $("#peso-form").val();
                    peso = peso.replace(",",".");
                    var altura = $("#altura-form").val();
                    altura = altura.replace(",",".");
                    document.getElementById("frmCalcIMC").peso.value = peso;
                    document.getElementById("frmCalcIMC").altura.value = altura;
                             
                    
                    
                }
                function validaCampos(){
                    normalizarPontoFlutuante();
                    $("#peso-msg,#altura-msg").empty();
                                        
                    if($("#peso-form").val() === "" || $("#peso-form").val() === null || isNaN($("#peso-form").val())){
                        $("#peso-msg").html("Favor preecher o campo corretamente");
                        $("#peso-msg").addClass("text-danger");
                        return false;
                    }else if($("#altura-form").val() === "" || $("#altura-form").val() == null || isNaN($("#altura-form").val())){
                        console.log("Entroui")
                         $("#altura-msg").html("Favor informar sua altura em metros corretamente");
                         $("#altura-msg").addClass("text-danger");
                         return false;
                    }
                   
                    return true;
                   
                }
                function enviarForm(){
                    if(validaCampos()){
                        $("#frmCalcIMC").submit();
                    }
                }
            </script>
       
    </head>
    <body>
        <section class="container container-fluid">
            <h1 class="text-center">Calcule seu IMC</h1>
        <article class="container">
        <form id="frmCalcIMC" action="Calc.jsp" method="post" class="">
          
                    <span id="peso-msg"></span>
                    <input id="peso-form" type="text" name="peso" placeholder="Digite seu peso kg" class="form-control mt-4" >
                     <span id="altura-msg"></span>
                    <input id="altura-form" type="text" name="altura" placeholder="Digite sua altura em m" class="form-control mt-4" >
            
               
                   
                   
              
                
          
            
            
            
                    <button type="button" class="btn btn-success mt-4" onclick="enviarForm()">Calcular</button>
        </form>
            </article>
        </section>
        <script src="jquery/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
        
    </body>
    
</html>
