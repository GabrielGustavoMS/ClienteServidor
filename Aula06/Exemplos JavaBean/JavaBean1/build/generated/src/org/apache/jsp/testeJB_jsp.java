package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testeJB_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   <title>Exemplo de utilização de Bean - Especificação JavaBeans</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<h3>Exemplo de utilização de Bean - Especificação JavaBeans</h3>\r\n");
      out.write("\r\n");
      out.write("  ");
      meusBeans.SerieTag meuteste = null;
      synchronized (_jspx_page_context) {
        meuteste = (meusBeans.SerieTag) _jspx_page_context.getAttribute("meuteste", PageContext.PAGE_SCOPE);
        if (meuteste == null){
          meuteste = new meusBeans.SerieTag();
          _jspx_page_context.setAttribute("meuteste", meuteste, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("meuteste"), "coeficiente", "2.35", null, null, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("   Resultado da série:\r\n");
      out.write("   ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((meusBeans.SerieTag)_jspx_page_context.findAttribute("meuteste")).getSerie())));
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
