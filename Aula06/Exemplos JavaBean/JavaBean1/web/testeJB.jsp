<html>
<head>
   <title>Exemplo de utilização de Bean - Especificação JavaBeans</title>
</head>
<body>
<br>
<h3>Exemplo de utilização de Bean - Especificação JavaBeans</h3>

  <jsp:useBean id="meuteste" class="meusBeans.SerieTag"  />
  <jsp:setProperty name="meuteste" property="coeficiente" value="2.35" />

  Resultado da série:
  <jsp:getProperty name="meuteste" property="serie" />

</body>
</html>
