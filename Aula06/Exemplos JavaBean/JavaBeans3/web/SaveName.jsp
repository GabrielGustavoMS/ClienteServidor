<jsp:useBean id="user" class="meusBeans.UserData" scope="session"/>

<jsp:setProperty name="user" property="username"/>
<jsp:setProperty name="user" property="email"/>
<jsp:setProperty name="user" property="age"/>
<HTML>
<BODY>
    <A HREF="NextPage.jsp">Continue</A>
    
    <br>Você entrou<BR>
    Nome: <jsp:getProperty name="user" property="username" /><BR>
    Email: <jsp:getProperty name="user" property="email" /><BR>
    Idade: <jsp:getProperty name="user" property="age" /><BR>
    
    <jsp:setProperty name="user" property="username" value="Luiz Reis"/>
    <jsp:setProperty name="user" property="email" value="luiz.carlos.reis@gmail.com"/>
    <jsp:setProperty name="user" property="age" value="47"/>
    
</BODY>
</HTML> 