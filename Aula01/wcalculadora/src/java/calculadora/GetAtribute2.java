/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAtribute2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetAtribute2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GetAtribute2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Compartilha Dados</title></head><body>");
        
        out.println ("GetAtribute2 (bar): " + request.getAttribute("bar")+"<br>");
        out.println ("GetAtribute2 (foo): " + request.getAttribute("foo")+"<br>");
        
        request.setAttribute ("bar", "16");
        
        out.println ("<br>");
        out.println ("<br>");
        out.println ("GetAtribute2 (bar): " + request.getAttribute("bar")+"<br>");
        out.println ("GetAtribute2 (foo): " + request.getAttribute("foo")+"<br>");
        
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
