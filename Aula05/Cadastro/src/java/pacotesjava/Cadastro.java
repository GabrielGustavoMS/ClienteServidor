package pacotesjava;

import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Cadastro extends HttpServlet {

  int count = 0;
  Aluno cadastro[] = new Aluno[10];

  public void doPost(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {


    if (req.getParameter("acao").equals("CADASTRAR"))
    	cadastrar(req, res);
    else
    	listar(req, res);

  }

  private void cadastrar(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
	    Aluno a = new Aluno();

	    a.setrgm_aluno(req.getParameter("rgm"));
	    a.setnome_aluno(req.getParameter("nome"));
	    cadastro[count]=a;

	    count++;
	    RequestDispatcher rd = req.getRequestDispatcher("/Paginas/Cadastrado.html");
        rd.forward(req, res);

	    //res.sendRedirect("../Paginas/Cadastrado.html");
  }

  private void listar(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
	    res.setContentType("text/html; charset=iso-8859-1");
	    PrintWriter out = res.getWriter();

	    out.println("<html>");
        out.println("<body>");

	    out.println("<table width='100%' border='1'>");
		out.println("<tr bgcolor='#FFFF99'> ");
		out.println("<td width='8%'><font color='#000033'>C&oacute;digo:</font></td>");
		out.println("<td width='92%'><font color='#000033'>Nome</font></td>");
		out.println("</tr>");
		for (int cont=0;cont<count;cont++){
			 out.println("<tr> ");
			 out.println("<td>" + cadastro[cont].getrgm_aluno() + "</td>");
			 out.println("<td>" + cadastro[cont].getnome_aluno() + "</td>");
			 out.println("</tr>");
		}
		out.println("</table>");


	    out.println("<p><input type='button' name='voltar' value='Voltar' onClick='javascript:history.back()'></p>");
	    out.println("</body>");
        out.println("</html>");
  }
}

