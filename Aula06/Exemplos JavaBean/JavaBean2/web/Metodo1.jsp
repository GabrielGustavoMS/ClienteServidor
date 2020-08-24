<html>
  <head>
    <title>Exemplo de utilização de Bean</title>
  </head>
<body>
<h3>Exemplo de utilização de Bean</h3>
<jsp:useBean id="teste" class="meusBeans.Quadrado" />
<jsp:setProperty name="teste" property="lado" value="2.5" />
Área:
<jsp:getProperty name="teste" property="area" />
Perímetro:
<jsp:getProperty name="teste" property="perimetro" />

</body>
</html>

