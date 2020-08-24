<%-- 
    Document   : index
    Created on : 13/04/2020, 22:18:28
    Author     : hight
--%>
<%@page import="classes.ProdutoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="classes.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css"/>
        <title>JSP Page</title>
        <script src="js/scriptsJs.js"></script>
    </head>
    <body>
        <section class="container">
            <h1 class="text-center"> Produtos</h1>
        </section >
        <section class="container mt">
            <h2>Cadastrar produto:</h2>
            <%
                String status = request.getParameter("status");

                if (status != null) {
                    if (status.equals("OK")) {

            %>
            <script>
                chamarPopup("Ação realizada com sucesso!!!");
            </script>
            <%            } else {

            %>
            <script>
                chamarPopup("Não foi possível realizar a ação :( "+status);
            </script>
            <%
                    }
                }
            %>

            <form id="formCadastrar" action="cadastrarProduto.jsp" method="post">
                <table class="table table-bordered table-striped">
                    <tr>
                        <td>
                            Nome do produto:
                            <span id="nome-produto-msg"></span>
                        </td>

                        <td><input id="nome-produto" name="nome" type="text" placeholder="Digite o nome do produto" class="form-control"</td>

                    </tr>
                    <tr>
                        <td>
                            Descrição:
                            <span id="descricao-produto-msg"></span>
                        </td>
                        <td><textarea id="descricao-produto" name="descricao"  placeholder="Digite a descrição do produto" class="form-text" rows="5" cols="50"></textarea></td>
                    </tr>
                    <tr>
                        <td>
                            Quantidade do produto em estoque:
                            <span id="qtde-produto-em-estoque-msg"></span>
                        </td>
                        <td><input id="qtde-produto-em-estoque" name="qtde_estoque" type="number" placeholder="Digite a quantidade desse produto em estoque" min="0" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td>
                            Valor do produto em R$:
                            <span id="valor-produto-msg"></span>
                        </td>
                        <td>
                            <input id="valor-produto" name="valor" type="text" placeholder="Digite o valor do produto" class="form-control"/> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Fabricante:
                            <span id="fabricante-produto-msg"></span>
                        </td>
                        <td><input id="fabricante-produto" name="fabricante" type="text" placeholder="Digite o nome do fabricante do produto" class="form-control"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="button" onclick="enviarCadastro()" value="Cadastrar Produto" class="btn btn-success"/></td>
                    </tr>
                </table>
            </form>
        </section>
        <br><br><br>
        <section class="container">
            <h2>Deletar produto por código:</h2>
            <form id="formDeletar" action="excluirProduto.jsp" method="post">
                <table class="table table-striped">
                    <tr>
                        <td>
                            Digite o código do produto que deseja excluir:
                            <span id="deletar-msg"></span>
                        </td>
                        <td>
                            <input id="id-produto-deletar" name="id" type="number" placeholder="Código do produto" min="1" class="form-control"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="button" onclick="deletarProduto()" value="Deletar Produto" class="btn btn-danger"/></td>
                    </tr>
                </table>
            </form>
        </section>
        <section class="container">
            <h2>Listar todos os produtos, ordenando por nome:</h2>
            <form action="" method="get">
                <table id="tabela-produtos" class="table table-bordered">
                    <tr>
                        <td colspan="2" align="center">
                            <input  id="listar-produtos-btn" type="button" onclick="carregarProdutos()"   value="Listar produtos" class="btn btn-primary"/> 
                        </td>
                    </tr>
                </table>
            </form>
            <article id="lista-produtos">
            </article>
        </section>    
        <script src="jquery/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
    </body>
</html>
