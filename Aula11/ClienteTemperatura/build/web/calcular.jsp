<%-- 
    Document   : calcular.jsp
    Created on : 28/04/2020, 16:23:31
    Author     : hight
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="recursos.Processar"%>
<%
    String valorF = request.getParameter("f");
    String valorC = request.getParameter("c");
    String acao = request.getParameter("acao");
    System.out.println(" "+valorF+" "+valorC+ " "+ acao);
    if(acao.equals("Celsius Para Fahrenheit")){
        valorF = Processar.celsiusToFahrenheit(Float.parseFloat(valorC))+"";
    }else{
        valorC = Processar.fahrenheitToCelsius(Float.parseFloat(valorF))+"";    
    }
    
    
    response.sendRedirect("index.jsp?valorF="+valorF+"&valorC="+valorC);
            
%>