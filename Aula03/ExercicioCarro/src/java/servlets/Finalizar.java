/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hight
 */
public class Finalizar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Finalizar</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/css/bootstrap.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 class='text-center m-2 p-1'>Servlet Finalizar at " + request.getContextPath() + "</h1>");
            String nome = request.getParameter("nome-txt");
            String cpf = request.getParameter("cpf-txt");
            String endereco = request.getParameter("end-txt");
            String tel = request.getParameter("tel-txt");
            String modeloCarro = request.getParameter("modelo-carro");
            String numPortas = request.getParameter("numero-portas-carro");
            String acessorios[] = request.getParameterValues("acessorios-carro");
            String acessoriosName[] = {"Ar condicionado", "Direção", "VE/TE"};
            float precoAcessorios[] = {3000f, 2000f, 1000f};
            float precoTotal = 0;
            if (!(modeloCarro == null)) {

                float precounitario = 0;
                switch (modeloCarro) {
                    case "ex":
                        precoTotal = 10000f;
                        precounitario = 10000f;
                        break;
                    case "exl":
                        precoTotal = 20000f;
                        precounitario = 20000f;
                        break;
                    case "master":
                        precoTotal = 30000f;
                        precounitario = 30000f;
                        break;
                }
                out.println("<section class='container container-fluid'>");
                out.println("<table class='table table-bordered'>");
                out.println("<thead>");
                out.println("<th>");
                out.println("Informação Pessoal");
                out.println("</th>");
                out.println("<th>");
                out.println("Valor");
                out.println("</th>");
                out.println("</thead>");
                out.println("<tbody>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Nome: ");
                out.println("</td>");
                out.println("<td>");
                out.println(nome);
                out.println("</td>");
                out.println("</tr>");

                out.println("<tr>");
                out.println("<td>");
                out.println("CPF: ");
                out.println("</td>");
                out.println("<td>");
                out.println(cpf);
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Endereço: ");
                out.println("</td>");
                out.println("<td>");
                out.println(endereco);
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Telefone: ");
                out.println("</td>");
                out.println("<td>");
                out.println(tel);
                out.println("</td>");
                out.println("</tr>");
                out.println("</tbody>");
                out.println("</table>");
                out.println("<table class='table table-bordered'");
                out.println("<thead>");
                out.println("<th>");
                out.println("Item");
                out.println("</th>");
                out.println("<th>");
                out.println("Valor");
                out.println("</th>");
                out.println("<th>");
                out.println("Preço Unitário");
                out.println("</th>");
                out.println("</thead>");
                out.println("<tbody>");
                out.println("<tr>");
                out.println("<td>");
                out.println("Modelo carro:");
                out.println("</td>");
                out.println("<td>");
                out.println(modeloCarro);
                out.println("</td>");
                out.println("<td>");
                out.println("R$ " + precounitario);
                out.println("</td>");
                out.println("</tr>");

            }

            if (!numPortas.equals("")) {
                float precounitario = 0;
                if (numPortas.equalsIgnoreCase("4p")) {
                    precounitario = 4000f;
                    precoTotal += 4000f;
                }
                out.println("<tr>");
                out.println("<td>");
                out.println("Número de Portas:");
                out.println("</td>");
                out.println("<td>");
                out.println(numPortas);
                out.println("</td>");
                out.println("<td>");
                out.println("R$ " + precounitario);
                out.println("</td>");
                out.println("</tr>");

            }
            if (acessorios != null) {

                for (int i = 0; i < acessorios.length; i++) {

                    float precoUnitario = precoAcessorios[Integer.parseInt(acessorios[i])];
                    precoTotal += precoUnitario;

                    out.println("<tr>");
                    out.println("<td>");
                    out.println("Acessório " + (i + 1));
                    out.println("</td>");
                    out.println("<td>");
                    out.println(acessoriosName[Integer.parseInt(acessorios[i])]);
                    out.println("</td>");
                    out.println("<td>");
                    out.println("R$ " + precoUnitario);
                    out.println("</td>");
                    out.println("</tr>");
                }

            }
            out.println("</tbody>");
            out.println("</table>");
            out.println();
            out.println("<div class=\"d-block    p-2 bg-success text-white\">");
            out.println("Preço total : R$ " + precoTotal);
            out.println("</div>");
            out.println("<section/>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
           
        response.sendRedirect("acessoNegado.html");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
