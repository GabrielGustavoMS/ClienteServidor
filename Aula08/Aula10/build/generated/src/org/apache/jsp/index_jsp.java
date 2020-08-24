package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import classes.AlunoDAO;
import classes.Aluno;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    String status = request.getParameter("status");
    
    if(status != null){
        if(status.equals("OK")) {
            out.println("Registro Inserido com sucesso");
        }
        else {
            out.println("ERRO: " + status);
        }
    }
    
    String rgm = request.getParameter("rgm");
    Aluno aluno = new Aluno();
    if(rgm != null) {
        aluno = new AlunoDAO().consultarAluno(rgm);
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Banco de Dados</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <form name=\"form1\" action=\"gravar.jsp\" method=\"post\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>RGM:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"rgm\" value=\"");
      out.print( aluno.getRgm() );
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nome:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nome\"  value=\"");
      out.print( aluno.getNome() );
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nota 1:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nota1\"  value=\"");
      out.print( aluno.getNota1());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nota 2:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nota2\"  value=\"");
      out.print( aluno.getNota2() );
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Gravar\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Nome</td>\n");
      out.write("                <td>RGM</td>\n");
      out.write("                <td>Nota 1</td>\n");
      out.write("                <td>Nota 2</td>\n");
      out.write("            </tr>\n");
      out.write("        ");

            ArrayList<Aluno> lista = new AlunoDAO().getAlunos();
            for(int i=0; i<lista.size(); i++) {
                out.println("<tr>");
                out.println("<td><a href='index.jsp?rgm=" + lista.get(i).getRgm() + "'>" + lista.get(i).getRgm()+ "</a></td>");
                out.println("<td>" + lista.get(i).getNome() + "</td>");
                out.println("<td>" + lista.get(i).getNota1()+ "</td>");
                out.println("<td>" + lista.get(i).getNota2()+ "</td>");
                out.println("</tr>");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
