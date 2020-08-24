package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/conecta.jsp");
  }

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

      out.write('\n');
      out.write('\n');

	Connection con = null;
	Statement stmt = null;
	
	try {
            //Banco de Dados
            String serverName = "localhost";
            String mydatabase = "aula";

            //Login e senha do banco
            String username = "root";
            String password = "root";

            // Carregando o JDBC Driver
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            // Criando a conexão com o Banco de Dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase; // a JDBC url
            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
			
        }
	catch (ClassNotFoundException e){
            //Driver não encontrado
            out.println("Driver não encontrado: " + e.toString());
        }
	catch (SQLException e) {
            //Não está conseguindo se conectar ao banco
            out.println("Erro ao executar SQL: " + e.toString());
        }


      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Exemplo Ajax 2</title>\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            var xmlHttp;\r\n");
      out.write("            function pesquisaAlunos(combo) {\r\n");
      out.write("                indice = combo.value;\r\n");
      out.write("\t\t\t\tif(indice == 0) return;\r\n");
      out.write("                var url = 'pesquisaAlunos.jsp?codTurma=' + indice;\r\n");
      out.write("                if (window.ActiveXObject) {\r\n");
      out.write("                        xmlHttp = new ActiveXObject('Microsoft.XMLHTTP');\r\n");
      out.write("                }\r\n");
      out.write("                else if (window.XMLHttpRequest) {\r\n");
      out.write("                        xmlHttp = new XMLHttpRequest();\r\n");
      out.write("                }\r\n");
      out.write("                xmlHttp.open('GET', url, true);\r\n");
      out.write("                msg = document.getElementById(\"mensagem\");\r\n");
      out.write("                msg.style.visibility = \"visible\";\r\n");
      out.write("                xmlHttp.onreadystatechange = callback;\r\n");
      out.write("                xmlHttp.send(null);\r\n");
      out.write("            }\r\n");
      out.write("            function callback(){\r\n");
      out.write("                if (xmlHttp.readyState == 4) {\r\n");
      out.write("                    if (xmlHttp.status == 200) {\r\n");
      out.write("                        escreveTabela();\r\n");
      out.write("                    }\r\n");
      out.write("                    msg.style.visibility = \"hidden\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            function escreveTabela(){\r\n");
      out.write("                var tabela = document.getElementById(\"tabelaAlunos\");\r\n");
      out.write("\t\ttabela.innerHTML = xmlHttp.responseText;\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <h1 align=\"center\">Exemplo Ajax 2 </h1>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <p align=\"center\">No evento <i><b>onChange</b></i> do combo das turmas, o objeto <i>XMLHttpRequest</i> \r\n");
      out.write("\tpesquisa os alunos da turma em uma base de dados, através de uma requisição assíncrona \r\n");
      out.write("\tà página <i><b>pesquisaAlunos.jsp</b></i>. Atrav&eacute;s da resposta XML, &eacute; gerada \r\n");
      out.write("\tuma tabela.</p>\r\n");
      out.write("    <p align=\"center\">\r\n");
      out.write("      <select name=\"select\" onChange=\"pesquisaAlunos(this)\">\r\n");
      out.write("        <option value=\"0\">Escolha uma Turma</option>\r\n");
      out.write("        ");

            String resp = "";
            try{
                ResultSet rs = stmt.executeQuery("SELECT * FROM turma ORDER BY nome");
                while(rs.next()){
                    resp+="<option value='"+rs.getInt("codigo")+"'>";
                    resp+=rs.getString("nome")+"</option>";
                }
                rs.close();
            }catch(Exception ex){
                resp = "<option>Erro ao carregar as turmas" + ex.toString() + "</option>";
            }
            out.println(resp);
        
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("\t</p>\r\n");
      out.write("    <div id=\"tabelaAlunos\" align=\"center\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"mensagem\" style=\"background-color:#CC3300; color:#FFFFFF; font-weight:bold; position:absolute; top:0; right:0; visibility:hidden\">&nbsp;&nbsp;Processando...&nbsp;&nbsp;</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
