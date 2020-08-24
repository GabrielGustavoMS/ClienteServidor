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

public class Formulario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Formulário</title>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<link rel='stylesheet' href='css/bootstrap.min.css'>");
            out.println("<script src='js/bootstrap.min.js'></script>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div class='container'>");
            out.println("<form class='form-horizontal' action='Calcular' method='post'>");
            out.println("<div class='form-group'>");
            out.println("<label for='inputNota1' class='control-label col-xs-2'>Nota 1:</label>");
            out.println("<div class='col-xs-10'>");
            out.println("<input type='text' class='form-control' id='inputNota1' name='txtNota1' placeholder='Digitar Nota' required>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<label for='inputNota2' class='control-label col-xs-2'>Nota 2</label>");
            out.println("<div class='col-xs-10'>");
            out.println("<input type='text' class='form-control' id='inputNota2' name='txtNota2' placeholder='Digite Nota' required>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class='form-group'>");
            out.println("<div class='col-xs-offset-2 col-xs-10'>");
            out.println("<button type='submit' class='btn btn-primary'>Calcular</button>");
            out.println("</div>");
            out.println("</div>");

            String media = request.getParameter("media");
            
            if(media!=null)
            {
                out.println("<div class='form-group'>");
                out.println("<div class='col-xs-12'>");
                out.println("<div class='alert alert-dark' role='alert'>A média das notas é: " + media + "</span");
                out.println("</div>");
                out.println("</div>");
            }
            
            out.println("</form>");
            out.println("</div>"); 
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
