/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


   function validaCampos(acao) {
                var celsius;
                var fahrenheit;
                fahrenheit = document.getElementById("f").value;
                celsius = document.getElementById("c").value;
                switch (acao) {
                    case "Celsius Para Fahrenheit":
                        if (celsius === null || celsius === "" || Number.isNaN(celsius)) {
                            document.getElementById("camposMsg").innerHTML = "Campo Celsius, aceita apenas números";
                            
                            return false;
                        }
                        break;
                    case "Fahrenheit Para Celsius":
                        if (fahrenheit === null || fahrenheit === "" || Number.isNaN(fahrenheit)) {
                            document.getElementById("camposMsg").innerHTML = "Campo Fahrenheit, aceita apenas números";
                            return false;
                        }
                        break;                    
                }
                return true;
            }
            function enviarForm(acao) {

                if (validaCampos(acao)) {
                    document.getElementById("acao").value = acao;
                    document.getElementById("formTemp").submit();
                }
            }