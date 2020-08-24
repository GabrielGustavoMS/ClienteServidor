<%-- 
    Document   : Getvariaveis
    Created on : 07/10/2014, 10:55:24
    Author     : 149317
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String title = "Exemplo do objeto HttpSession";
String title2 = "Exemplo do objeto Application";

String heading = "Bem-vindo";
%>
<html>
     <head>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <%=title%>
     </head>
     <BODY BGCOLOR=#FDF5E6><H1 ALIGN=CENTER> <%=heading%> </H1><br><H2>Informações sobre sua sessão:</H2><br>
                 <TABLE BORDER=1 ALIGN=CENTER><TR BGCOLOR=#FFAD00>
                   <TH>Tipo de Informação<TH>Valor
                    <TR><TD>ID<TD> <%=session.getId()%>
                    <TR><TD>Creation Time<TD><%=new Date(session.getCreationTime())%>
                    <TR><TD>Último acesso:<TD><%=new Date(session.getLastAccessedTime())%>
                    <TR><TD>Qtde. de Acessos:<TD>
                            <%
                             Integer cont1;
                             cont1 = Integer.parseInt( (String) session.getAttribute("contador1"))+1;
                            %>
                            <%=cont1%>
                            <%session.setAttribute("contador1", cont1.toString());%>
                  </TABLE>
    </body>
    <br><br><br><br>
    <BODY BGCOLOR=#FDF5E6><H1 ALIGN=CENTER> <%=heading%> </H1><br><H2>Informações sobre sua sessão (Application):</H2><br>
                 <TABLE BORDER=1 ALIGN=CENTER><TR BGCOLOR=#FFAD00>
                    <TR><TD>Qtde. de Acessos:<TD>
                            <%
                             Integer cont2;
                             cont2 = Integer.parseInt( String.valueOf(application.getAttribute("contador2")))+1;
                            %>
                            <%=cont2%>
                            <%application.setAttribute("contador2", cont2.toString());%>
                            
                  </TABLE>
    </body>
</html>
