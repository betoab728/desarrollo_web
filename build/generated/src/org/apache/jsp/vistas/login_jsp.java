package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Allqovet</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilos.css\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form action=\"../UsuarioController\" method=\"GET\">\r\n");
      out.write("<section class=\"vh-100 gradient-custom\">\r\n");
      out.write("  <div class=\"container py-5 h-100\">\r\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("      <div class=\"col-12 col-md-8 col-lg-6 col-xl-5\">\r\n");
      out.write("        <div class=\"card bg-dark text-white\" style=\"border-radius: 1rem;\">\r\n");
      out.write("          <div class=\"card-body p-5 text-center\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"mb-md-5 mt-md-4 pb-5\">\r\n");
      out.write("\r\n");
      out.write("              <h2 class=\"fw-bold mb-2 text-uppercase\">REGISTRO</h2>\r\n");
      out.write("              <p class=\"text-white-50 mb-5\">Por favor ingrese su usuario y contraseña</p>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"form-outline form-white mb-4\">\r\n");
      out.write("                <input type=\"text\" placeholder=\"Ingrese su usuario\" name=\"txtnombre\" class=\"form-control form-control-lg\" />\r\n");
      out.write("                <label class=\"form-label\" for=\"typeEmailX\">Usuario</label>\r\n");
      out.write("              </div>\r\n");
      out.write("                \r\n");
      out.write("              <div class=\"form-outline form-white mb-4\">\r\n");
      out.write("                <input type=\"password\" placeholder=\"Ingrese su contraseña\" name=\"txtclave\"class=\"form-control form-control-lg\" />\r\n");
      out.write("                <label class=\"form-label\" for=\"typePasswordX\">Contraseña</label>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <input class=\"btn btn-outline-light btn-lg px-5\" type=\"submit\" value=\"Ingresar\" name=\"accion\"> \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
