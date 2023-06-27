package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Allqovet</title>\n");
      out.write("     <!-- bootstrap -->\n");
      out.write("     <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\" crossorigin=\"anonymous\">\n");
      out.write("     \n");
      out.write("     <!-- css -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo-menu.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <section>\n");
      out.write("        <div class=\"container-fluid p-3\" style=\"background-color:#5f3061;\"><h1 class=\"text-center text-light p-3\">Veterinaria Allqovet</h1></div>\n");
      out.write("\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <h1 class=\"text-center mb-5\"> MANTENIMIENTO</h1>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <div class=\"row mt-5\">\n");
      out.write("            \n");
      out.write("            <div class=\"col\">\n");
      out.write("                <a class=\"admin\" href=\"../ProductoController?accion=listar\">\n");
      out.write("                    <div class=\"card shadow p-3\" style=\"width: 20rem;\">\n");
      out.write("                        <img src=\"IMG/gestion-de-producto.png\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title fs-3 fw-bold text-center admin\">Gestion de Productos</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <a class=\"admin\" href=\"\">\n");
      out.write("                    <div class=\"card shadow p-3\" style=\"width: 20rem;\">\n");
      out.write("                        <img src=\"IMG/gestion-de-equipos.png\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title fs-3 fw-bold text-center admin\">Gestion de Usuarios</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>      \n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col\">\n");
      out.write("               <a class=\"admin\" href=\"\">\n");
      out.write("                <div class=\"card shadow p-3\" style=\"width: 20rem;\">\n");
      out.write("                    <img src=\"IMG/equipo.png\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title fs-3 fw-bold text-center admin\">Gestion de Clientes.</h5>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               </a>        \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col mt-3\">\n");
      out.write("                <a class=\"admin\" href=\"\">\n");
      out.write("                    <div class=\"card shadow p-3\" style=\"width: 20rem;\">\n");
      out.write("                        <img src=\"./IMG/gestion-de-equipos.png\" class=\"card-img-top\" alt=\"imagen equipo\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title fs-3 fw-bold text-center admin\">Gestion de Pedidos</h5>\n");
      out.write("                        </div>\n");
      out.write("                    </div>      \n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("\n");
      out.write("     <!--FOOTER INICIO -->\n");
      out.write("  <div class=\"container-fluid btn-lg-square text-light mt-5 py-5\" style=\"background-color:#5f3061;\">\n");
      out.write("    <div class=\"container py-5x\">\n");
      out.write("        <div class=\"row g-5 \">\n");
      out.write("            <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                <h4 id=\"conocenos\"\n");
      out.write("                    class=\"d-inline-block text-uppercase border-bottom border-5 border-secondary mb-4\">VISÍTANOS\n");
      out.write("                </h4>\n");
      out.write("                <p id=\"color\" class=\"mb-2\"><i class=\"fa fa-map-marker-alt  me-3\"></i>Av. Jorge Chávez Mz. L1 Lote 16\n");
      out.write("                    A. Ex canal Balarezo. Castilla - Piura. </p>\n");
      out.write("                <p id=\"color\" class=\"mb-2\"><i class=\"fa fa-envelope  me-3\"></i>allqovet@hotmail.com</p>\n");
      out.write("                <p id=\"color\" class=\"mb-0\"><i class=\"fa fa-phone-alt me-3\"></i>979444796 / 073 343638</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                <h4 id=\"conocenos\"\n");
      out.write("                    class=\"d-inline-block text-uppercase border-bottom border-5 border-secondary mb-4\">ENLACES\n");
      out.write("                    RÁPIDOS</h4>\n");
      out.write("                <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                    <a id=\"color\" style=\"text-decoration:none; color:white;\"  class=\"mb-2\" href=\"#\"><i class=\"fa fa-angle-right me-2\"></i>Inicio</a>\n");
      out.write("                    <a id=\"color\" style=\"text-decoration:none; color:white;\" class=\"mb-2\" href=\"#\"><i class=\"fa fa-angle-right me-2\"></i>Conócenos</a>\n");
      out.write("                    <a id=\"color\" style=\"text-decoration:none; color:white;\" class=\"mb-2\" href=\"#\"><i class=\"fa fa-angle-right me-2\"></i>Servicios</a>\n");
      out.write("                    <a id=\"color\" style=\"text-decoration:none; color:white;\" class=\"mb-2\" href=\"#\"><i class=\"fa fa-angle-right me-2\"></i>Contáctanos</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                <h4 id=\"conocenos\"\n");
      out.write("                    class=\"d-inline-block text-uppercase border-bottom border-5 border-secondary mb-4\">\n");
      out.write("                    CORRESPONDENCIA</h4>\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control p-3 border-0\" placeholder=\"Ingresa tu correo\">\n");
      out.write("                        <button id=\"color\" class=\"btn\">Enviar</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <h6 id=\"conocenos\" class=\"text-uppercase mt-4 mb-3\">Síguenos</h6>\n");
      out.write("                <div class=\"d-flex\">\n");
      out.write("                    <a id=\"color\" class=\"btn btn-lg btn-lg-square rounded-circle me-2\" href=\"#\"><i\n");
      out.write("                            class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                    <a id=\"color\" class=\"btn btn-lg btn-lg-square rounded-circle\" href=\"#\"><i\n");
      out.write("                            class=\"fab fa-instagram\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- FOOTER FINAL -->\n");
      out.write("</body>\n");
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
