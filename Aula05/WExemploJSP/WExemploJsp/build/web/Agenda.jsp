<%@page import="java.util.ArrayList"%>
<%@page import="Business.Global"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css"/>
        <script>
            function validaCamposCadastro() {
                $('#nome-contato-cad-msg,#tel-cad-msg').removeClass('text-danger');
                $('#nome-contato-cad-msg,#tel-cad-msg').empty();

                if ($('#nome-contato-cad').val() === "" || $('#nome-contato-cad').val() === null) {
                    $('#nome-contato-cad-msg').addClass('text-danger');
                    $('#nome-contato-cad-msg').html('O nome do contato não pode ser vazio !!!');
                    return false;
                } else if ($('#tel-cad').val() === "" || $('#tel-cad').val() === null || isNaN($('#tel-cad').val())) {
                    $('#tel-cad-msg').addClass('text-danger');
                    $('#tel-cad-msg').html('Favor preecher o número de contato corretamente!!!')
                    return false;
                }
                return true;

            }
            function validaCamposEditar(ind) {
                $('#nome-contato-ed-msg' + ind + ',#tel-ed-msg' + ind).removeClass('text-danger');
                $('#nome-contato-ed-msg' + ind + ',#tel-ed-msg' + ind).empty();


                if ($('#nome' + ind).val() === "" || $('#nome' + ind).val() === null) {
                    $('#nome-contato-ed-msg' + ind).addClass('text-danger');
                    $('#nome-contato-ed-msg' + ind).html('O nome do contato não pode ser vazio !!!');
                    return false;
                } else if ($('#telefone' + ind).val() === "" || $('#telefone' + ind).val() === null || isNaN($('#telefone' + ind).val())) {
                    $('#tel-ed-msg' + ind).addClass('text-danger');
                    $('#tel-ed-msg' + ind).html('Favor preecher o número de contato corretamente!!!')
                    return false;
                }
                return true;

            }
            
            function Cadastrar() {
                if (validaCamposCadastro()) {
                    document.frmAgenda.submit();
                }



            }
            function Remover() {
           
               document.frmRemoverContato.submit();
                
               
            }

            function editarContato(indice) {
                if (validaCamposEditar(indice)) {
                    alert("Contato editado");
                    var idNome = "nome" + indice;
                    var idTelefone = "telefone" + indice;
                    document.getElementById("editForm").nome.value = document.getElementById(idNome).value;
                    document.getElementById("editForm").telefone.value = document.getElementById(idTelefone).value;
                    document.getElementById("editForm").idContato.value = indice;
                    document.getElementById("editForm").submit();
                }
            }
        </script>

    </head>
    <body>
        <section class="container container-fluid ">
            <h1 class="text-center">Agenda</h1>
            <br><br>
            <form name="frmAgenda" action="FormularioAgenda" method="get" class="form">
                <div>
                    <div class=""><label for="nome-contato-cad"><h2>Contato:</h2></label></div><br>
                    <span id="nome-contato-cad-msg"></span>
                    <br>
                    <div><input id="nome-contato-cad"  type="text" name="contato" class="form-control" placeholder="Digite o nome do contato "/></div>
                </div>

                <div>
                    <br>
                    <div class="">
                        <label for="tel-cad"><h2>Telefone:</h2></label>                        
                    </div>
                    <br>
                    <span id="tel-cad-msg"></span>
                    <br>
                    <div>
                        <input  id="tel-cad" type="tel" name="telefone" class="form-control" placeholder="Digite o telefone do contato"/>
                    </div>
                </div>
                <br><br>


                <button type="button" name="btnCadastrar" onclick="Cadastrar()" class=" btn btn-success">Cadastrar </button>


            </form>

            <div>

                <br/>



                <form name="frmRemoverContato" action="FormularioAgendaExcluir" method="get">

                    <h2>Contatos Cadastrados:</h2><br>
                    <span id="excluir-msg"> </span>
                    <br>
                    <button name="acao" value="excluir" onclick="Remover()" class="btn btn-danger">Excluir contatados selecionados</button>


                    <br><br>
                    <br>

                    <%
                        for (int ind = 0; ind < Global.agenda.size(); ind++) {
                            out.println("<input type='checkbox' name='contato' value=" + ind + ">" + "&nbsp;&nbsp;&nbsp;" + Global.agenda.get(ind).getNome() + "&nbsp;-&nbsp;  " + Global.agenda.get(ind).getTelefone()
                                    + "<button type='button' class='btn' data-toggle='modal' data-target='#modal" + ind + "'>"
                                    + "<img src='_img/lapis.png' style='max-width:16px'/>"
                                    + "</button>" + "<br/>"
                            );
                            out.println(
                                    "<!-- Modal -->"
                                    + "<div class='modal fade' id='modal" + ind + "' tabindex='-1' role='dialog' aria-labelledby='exampleModalLabel' aria-hidden='true'>"
                                    + "<div class='modal-dialog' role='document'>"
                                    + "<div class='modal-content'>"
                                    + "<div class='modal-header'>"
                                    + "<h5 class='modal-title' id='exampleModalLabel'>Editar Contato</h5>"
                                    + "<button type='button' class='close' data-dismiss='modal' aria-label='Close'>"
                                    + "<span aria-hidden='true'>&times;</span>"
                                    + "</button>"
                                    + "</div>"
                                    + "<div class='modal-body'>"
                                    + "<div>"
                                    + "<div>Contato</div>"
                                    + "<span id='nome-contato-ed-msg" + ind + "'></span>"
                                    + "<div><input id='nome" + ind + "' type='text' name='nome' value='" + Global.agenda.get(ind).getNome() + "'/></div>"
                                    + "</div>"
                                    + "<div>"
                                    + "<div>"
                                    + "Telefone"
                                    + "</div>"
                                    + "<div>"
                                    + "<span id='tel-ed-msg" + ind + "'></span>"
                                    + "<input id='telefone" + ind + "' type='tel' name='telefone' value='" + Global.agenda.get(ind).getTelefone() + "'/>"
                                    + "</div>"
                                    + "</div>"
                                    + "</div>"
                                    + "<div class='modal-footer'>"
                                    + "<button type='button' class='btn btn-secondary' data-dismiss='modal'>Fechar</button>"
                                    + "<button type='button' class='btn btn-primary' data-dismiss='' onClick='editarContato(" + ind + ")'>Salvar Alterações</button>"
                                    + "</div>"
                                    + "</div>"
                                    + "</div>"
                                    + "</div>"
                            );
                        }
                    %>
                </form>
                <form id="editForm" action="FormularioAgendaEditar" method="post" style="display: none">
                    <input id="nome" type="text" name="nome">
                    <input id="telefone" type="text" name="telefone">
                    <input type="text" name="idContato"/>
                </form>
            </div>
        </section>
        <script src="jquery/jquery.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
        <script>
                        $('#myModal').on('shown.bs.modal', function () {
                            $('#myInput').trigger('focus')
                        })
        </script>
    </body>
</html>
