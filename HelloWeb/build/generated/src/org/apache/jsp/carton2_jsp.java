package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;

public final class carton2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body style=\"background-color: white;\">\n");
      out.write("        <div class=\"navbar navbar-inverse navbar-fixed-top scrollclass\" >\n");
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
      out.write("        <section style=\"background-color: lightblue;\" id=\"services\" class=\"section\">\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                    <div class=\"row text-center pad-top\">\n");
      out.write("                    <div class=\"col-sm-10 text-center-mobile\">\n");
      out.write("                        ");
      org.mypackage.hello.Bingo mybean = null;
      synchronized (session) {
        mybean = (org.mypackage.hello.Bingo) _jspx_page_context.getAttribute("mybean", PageContext.SESSION_SCOPE);
        if (mybean == null){
          mybean = new org.mypackage.hello.Bingo();
          _jspx_page_context.setAttribute("mybean", mybean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("mybean"), "idCliente", request.getParameter("idCliente"), request, "idCliente", false);
      out.write("\n");
      out.write("                        \n");
      out.write("                        <h1 class=\"bounceInDown animated\" style=\"color: white;\">ID");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getIdCliente())));
      out.write("</h1>\n");
      out.write("                        <h2 class=\"bounceInLeft animated\" style=\"color: white;\">Este es tu carton");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getNum_carton())));
      out.write(" </h2>\n");
      out.write("                           \n");
      out.write("                        <div  >\n");
      out.write("                            <table class=\"table table-bordered text-center\" style=\"border-color:blue;border:6px !important\">\n");
      out.write("                                <tr>\n");
      out.write("                                  <td><h1>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getBingo1())));
      out.write("</h1></td>\n");
      out.write("                                  <td><h1>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getBingo2())));
      out.write("</h1></td>\n");
      out.write("                                  <td><h1>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getBingo3())));
      out.write("</h1></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                  <td><h1>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getBingo4())));
      out.write("</h1></td>\n");
      out.write("                                  <td><h1>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getBingo5())));
      out.write("</h1></td>\n");
      out.write("                                  <td><h1>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getBingo6())));
      out.write("</h1></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                  <td><h1>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getBingo7())));
      out.write("</h1></td>\n");
      out.write("                                  <td><h1>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getBingo8())));
      out.write("</h1></td>\n");
      out.write("                                  <td><h1>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.Bingo)_jspx_page_context.findAttribute("mybean")).getBingo9())));
      out.write("</h1></td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                             <form name=\"idCliente Input Form\" action=\"carton3.jsp\">\n");
      out.write("                                <div class=\"col-md-2 col-lg-offset-3 text-center-mobile\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-block btn-blue\"  value=\"aceptar\" />\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                                <a href=\"javascript:abc();\"><script>function restartall() {\n");
      out.write("                                        $('#text').append('hello');\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                    function abc() {\n");
      out.write("                                        document.location.reload();\n");
      out.write("                                        restartall();\n");
      out.write("\n");
      out.write("                                    }</script>\n");
      out.write("                                <div class=\"col-md-2 col-lg-offset-3 text-center-mobile\">\n");
      out.write("                                    <input type=\"submit\" onclick=\"restartall()\" class=\"btn btn-block btn-blue\"  value=\"Cambiar Carton\" />\n");
      out.write("                                </div>\n");
      out.write("                            \n");
      out.write("                               \n");
      out.write("\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                        </div>   \n");
      out.write("                    </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("            </section>\n");
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
