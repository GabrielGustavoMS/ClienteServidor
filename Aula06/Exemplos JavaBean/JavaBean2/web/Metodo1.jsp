<html>
  <head>
    <title>Exemplo de utiliza��o de Bean</title>
  </head>
<body>
<h3>Exemplo de utiliza��o de Bean</h3>
<jsp:useBean id="teste" class="meusBeans.Quadrado" />
<jsp:setProperty name="teste" property="lado" value="2.5" />
�rea:
<jsp:getProperty name="teste" property="area" />
Per�metro:
<jsp:getProperty name="teste" property="perimetro" />

</body>
</html>

