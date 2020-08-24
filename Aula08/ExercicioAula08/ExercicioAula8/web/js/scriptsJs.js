/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function carregarProdutos() {
    let baseurl = `http://localhost:8080/ExercicioAula8/listarProdutos.jsp`;
    var xmlhttp;
    if(window.ActiveXObject){
        xmlhttp = new ActiveXObject('Microsoft.XMLHTTP');
    }else if(window.XMLHttpRequest){
        xmlhttp = new XMLHttpRequest();
    }else{
        alert("Seu navegador não suporta ajax");
        return;
    }
    xmlhttp.open("GET", baseurl, true);
    xmlhttp.send();
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
            var produtos = JSON.parse(xmlhttp.responseText);
            var tabelatopo = ` <table class="table table-bordered table-striped">
                                            <tr>
                                                <th>Código do produto</th>
                                                <th>Nome do produto</th>
                                                <th>Descrição</th>
                                                <th>Quantidade do produto em estoque</th>
                                                <th>Valor do produto em R$</th>
                                                <th>Fabricante</th>
                                            </tr>`;
            var tabelacorpo = "";
            for (i = 0; i < produtos.length; i++) {
                tabelacorpo += "<tr><td>" + produtos[i].id + "</td>"
                        + "<td>" + produtos[i].nome + "</td>"
                        + "<td>" + produtos[i].descricao + "</td>"
                        + "<td>" + produtos[i].qtde_estoque + "</td>"
                        + "<td>" + produtos[i].valor + "</td>"
                        + "<td>" + produtos[i].fabricante + "</td>"
                        + "</tr>";
            }
            var tabelarodape = "</table>";
            var tabela = tabelatopo + tabelacorpo + tabelarodape;
            document.getElementById("lista-produtos").innerHTML = tabela;
        }
    };
}

function enviarCadastro() {
    if (validaCamposCadastro()) {

        console.log("campos válidos");
        $("#formCadastrar").submit();
    }
}

function  deletarProduto(){
    if(validaCamposDeletar()){
        console.log("campos válidos");
        $("#formDeletar").submit();
    }
}




function validaCamposCadastro() {
    $("#nome-produto-msg,#descricao-produto-msg,#qtde-produto-em-estoque-msg,#valor-produto-msg,#fabricante-produto-msg").empty();
    $("#nome-produto-msg,#descricao-produto-msg,#qtde-produto-em-estoque-msg,#valor-produto-msg,#fabricante-produto-msg").removeClass("text-danger");
    normalizeFloatingPoint();
    if (isEmpty("#nome-produto")) {
        addWarningEmpyField("#nome-produto-msg");
        return false;
    } else if (isEmpty("#descricao-produto")) {
        addWarningEmpyField("#descricao-produto-msg");
        return false;
    } else if (isEmpty("#qtde-produto-em-estoque") || !(isInt("#qtde-produto-em-estoque")) || isFVNaN("#qtde-produto-em-estoque") || hasCommaOrDot("#qtde-produto-em-estoque")) {
        addWarningNaN("#qtde-produto-em-estoque-msg");
        addMsg("#qtde-produto-em-estoque-msg", " inteiros");
        return false;
    } else if (isEmpty("#valor-produto") || isFVNaN("#valor-produto")) {
        addWarningNaN("#valor-produto-msg");
        return false;
    } else if (isEmpty("#fabricante-produto")) {
        addWarningEmpyField("#fabricante-produto-msg");
        return false;
    }
    return true;
}

function validaCamposDeletar() {
    $("#deletar-msg").empty();
    $("#deletar-msg").removeClass("text-danger");


    if (isEmpty("#id-produto-deletar") || isFVNaN("#id-produto-deletar") || !(isInt("#id-produto-deletar")) || hasCommaOrDot("#id-produto-deletar")) {
         addWarningNaN("#deletar-msg");
         addMsg("#deletar-msg"," inteiros.");
         addMsg("#deletar-msg",'<br>'+" Formato de código inválido!!!");
         return false;
         
    }
    return true;
}



function isFVNaN(id) {
    var str = $(id).val();
    return isNaN(str);
}
function addClassInvalid(id) {
    $(id).addClass("text-danger");
}

function addMsg(id, msg) {
    $(id).append(msg);
}
function addWarningEmpyField(id) {
    addClassInvalid(id);
    addMsg(id, "Esse campo não pode ser vazio");
}
function addWarningNaN(id) {
    addClassInvalid(id);
    addMsg(id, "Esse campo só aceita números");
}


function isEmpty(id) {
    var str = $(id).val();
    return str === "" || str === null;
}

function normalizeFloatingPoint() {
    var valor = $("#valor-produto").val();
    var qtdeProduto = $("#qtde-produto-em-estoque").val();
    valor = valor.replace(",", ".");
    qtdeProduto = qtdeProduto.replace(",", ".");
    document.getElementById("formCadastrar").valor.value = valor;
    document.getElementById("formCadastrar").qtde_estoque.value = qtdeProduto;
}

function toSubmit(id) {
    $(id).submit();
}

function isInt(id) {
    var valor = $(id).val();

    return valor % 1 === 0;
}

function hasCommaOrDot(id) {
    var valor = $(id).val();
    var number = valor.indexOf(",");
    var n2 = valor.indexOf(".");
    return number > -1 || n2 > -1;
}
       
       function chamarPopup(msg){
           
           alert(msg);
       }