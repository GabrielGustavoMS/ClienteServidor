<jsp:useBean id="user" class="meusBeans.UserData" scope="session"/>
<HTML>
<BODY> 
    Voc� entrou<BR>
    Nome: <jsp:getProperty name="user" property="username" /><BR>
    Email: <jsp:getProperty name="user" property="email" /><BR>
    Idade: <jsp:getProperty name="user" property="age" /><BR>
</BODY>
</HTML> 