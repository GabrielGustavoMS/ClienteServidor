<html>
<head>
   <title>Exemplo de utiliza��o de Bean - Especifica��o JavaBeans</title>
</head>
<body>
<br>
<h3>Exemplo de utiliza��o de Bean - Especifica��o JavaBeans</h3>

  <jsp:useBean id="meuteste" class="meusBeans.SerieTag"  />
  <jsp:setProperty name="meuteste" property="coeficiente" value="2.35" />

  Resultado da s�rie:
  <jsp:getProperty name="meuteste" property="serie" />

</body>
</html>
