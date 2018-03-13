package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chat4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<title>TechForce</title>\n");
      out.write("\t<meta name=\"description\" content=\"Cardio is a free one page template made exclusively for Codrops by Luka Cvetinovic\" />\n");
      out.write("\t<meta name=\"keywords\" content=\"html template, css, free, one page, gym, fitness, web design\" />\n");
      out.write("\t<meta name=\"author\" content=\"Luka Cvetinovic for Codrops\" />\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"img/favicons/favicon-32x32.png\" sizes=\"32x32\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"img/favicons/favicon-16x16.png\" sizes=\"16x16\">\n");
      out.write("\t<link rel=\"manifest\" href=\"img/favicons/manifest.json\">\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"img/favicons/favicon.ico\">\n");
      out.write("\t<meta name=\"msapplication-TileColor\" content=\"#00a8ff\">\n");
      out.write("\t<meta name=\"msapplication-config\" content=\"img/favicons/browserconfig.xml\">\n");
      out.write("\t<meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("\t<!-- Normalize -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\">\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("\t<!-- Owl -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/owl.css\">\n");
      out.write("\t<!-- Animate.css -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate.css\">\n");
      out.write("\t<!-- Font Awesome -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.1.0/css/font-awesome.min.css\">\n");
      out.write("\t<!-- Elegant Icons -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/eleganticons/et-icons.css\">\n");
      out.write("\t<!-- Main style -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/cardio.css\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black;\">\n");
      out.write("    <section style=\"background-color: black;\" id=\"services\" class=\"section\">\n");
      out.write("        <div class=\"container\" >\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-sm-6 text-center-mobile\">\n");
      out.write("                    ");
      org.mypackage.hello.FacturaHandler mybean = null;
      synchronized (session) {
        mybean = (org.mypackage.hello.FacturaHandler) _jspx_page_context.getAttribute("mybean", PageContext.SESSION_SCOPE);
        if (mybean == null){
          mybean = new org.mypackage.hello.FacturaHandler();
          _jspx_page_context.setAttribute("mybean", mybean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("mybean"), "cpu", request.getParameter("cpu"), request, "cpu", false);
      out.write("\n");
      out.write("                    <h2 class=\"bounceInDown animated\" style=\"color: red;\">El procesador es un ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.FacturaHandler)_jspx_page_context.findAttribute("mybean")).getCpu())));
      out.write("</h2>\n");
      out.write("                    <h2 class=\"bounceInLeft animated\" style=\"color: white;\">¿Que procesador gráfico te gustaría?</h2>\n");
      out.write("                </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-6 col-lg-offset-6 text-center-mobile\">\n");
      out.write("                                    <form name=\"cpu Input Form\" action=\"chat5.jsp\">\n");
      out.write("                                        <ul class=\"list-inline\">\n");
      out.write("                                            <li class=\"bounce animated\"><a href=\"\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"ATI RADEON\">ATI Radeon</a></li>\n");
      out.write("                                            <li class=\"bounce animated\"><a href=\"\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Nvidia the way is meant to be played\">Nvidia</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-white\" name=\"gpu\" />\n");
      out.write("                                        <input type=\"submit\" class=\"btn btn-block btn-blue\"  value=\"Enviar\" />\n");
      out.write("                                        <p>Monto actual: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.FacturaHandler)_jspx_page_context.findAttribute("mybean")).getMonto())));
      out.write("</p>\n");
      out.write("                                    </form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $('[data-toggle=\"tooltip\"]').tooltip();   \n");
      out.write("});\n");
      out.write("</script>\n");
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
