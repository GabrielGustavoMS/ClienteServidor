/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkout;

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
public class Calc extends HttpServlet {

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
            out.println("<title>Total da Compra</title>"); 
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-s<cale=1.0\">");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/css/bootstrap-grid.min.css\"/>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/css/bootstrap.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<section class=\"container\">");
            out.println("<section class=\"container-fluid\">");
            out.println("<h1 class=\"text-center\">Checkout: </h1>");
            float produtos[];
            int n = 0;
            String checks[] =  request.getParameterValues("produto");
            
            float precos[] = {549.9f,999.9f,1199.9f,2299f,1099f,1849.90f,1295.89f,1099f,1099f};
            float precoTotal=0;
            for(int i = 0;i< checks.length;i++){
                int id = Integer.parseInt(checks[i]);
                float precoUnitario = precos[id];
                int quantidade = Integer.parseInt(request.getParameter("pr"+id+"_quant"));
                precoTotal += precoUnitario*quantidade;
            }
           
            
            out.println("<span class=\"d-block bg-success p-2 text-light rounded\"> Total da compra é de: R$ "+precoTotal+" </span>");
            System.out.println(""+checks[0]);
                    
            
           
            out.println("</section>");
            out.println("</section>");
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
