package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carton1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"author\" content=\"\" />\n");
      out.write("    <!--[if IE]>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <![endif]-->\n");
      out.write("    <title>Bingoooo!! </title>\n");
      out.write("    <!-- BOOTSTRAP CORE STYLE CSS -->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- FONT AWESOME STYLE CSS -->\n");
      out.write("    <link href=\"assets/font-awesome-4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- CUSTOM STYLE CSS -->\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\" />    \n");
      out.write("    <!-- GOOGLE FONT -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar-fixed-top\">\n");
      out.write("     <!--NAVBAR SECTION-->\n");
      out.write("    <div class=\"navbar navbar-inverse navbar-fixed-top scrollclass\" >\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Bingo</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar-collapse collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"index.html\">HOME</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("     <section id=\"home\" class=\"text-center\">\n");
      out.write("           <div class=\"container\">\n");
      out.write("           <div class=\"row text-center pad-top\">\n");
      out.write("            <div class=\"col-md-12 pad-top-more\">\n");
      out.write("                <h1 class=\"white\">Hola!</h1>\n");
      out.write("                <h2 class=\"white typed\">Ingresa tu ID para obtener un carton</h2>\n");
      out.write("                <form name=\"idCliente Input Form\" action=\"carton2.jsp\">\n");
      out.write("                    <div class=\"col-md-6 col-lg-offset-3 text-center-mobile\">\n");
      out.write("                        <input type=\"text\" class=\"form-control form-white\" name=\"idCliente\" />\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-block btn-blue\"  value=\"Enviar\" />\n");
      out.write("                    </div> \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("       </section>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!-- Holder for mobile navigation -->\n");
      out.write("    <div class=\"mobile-nav\">\n");
      out.write("        <ul>\n");
      out.write("        </ul>\n");
      out.write("        <a href=\"#\" class=\"close-link\"><i class=\"arrow_up\"></i></a>\n");
      out.write("    </div>\n");
      out.write("    <!-- Scripts -->\n");
      out.write("    <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/wow.min.js\"></script>\n");
      out.write("    <script src=\"js/typewriter.js\"></script>\n");
      out.write("    <script src=\"js/jquery.onepagenav.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
