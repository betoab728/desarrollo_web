package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import com.sys.model.Producto;
import java.util.ArrayList;
import com.sys.pruebadao.ProductosDAO;

public final class productos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"css/estilos-footer.css\"> -->\n");
      out.write("    <!-- bootstrap -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\" crossorigin=\"anonymous\">\n");
      out.write("     <!-- iconos -->\n");
      out.write("     <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("      <!-- iconos -->\n");
      out.write("\t <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <!-- ICÓNOS CSS -->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- iconos -->\n");
      out.write("    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("\n");
      out.write(" \n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid p-3\" style=\"background-color:#5f3061;\"><h1 class=\"text-center text-light p-3\">Veterinaria Allqovet</h1></div>\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <div class=\"container my-5\" >\n");
      out.write("            <h2 class=\"text-center\" >Registro de productos</h2>\n");
      out.write("            <hr class=\"mb-4\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                 \n");
      out.write("                <form action=\"\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Buscar por descripcion\" name=\"buscar\" class=\"form-control\" value=\"\"> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary\" name=\"btn_buscar\" value=\"Buscar\">\n");
      out.write("                            <a class=\"btn btn-primary\" href=\"nuevo.php\">Nuevo Producto</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("            <br>\n");
      out.write("          <table class=\"alumnos\" border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                         <th>DESCRIPCION</th>\n");
      out.write("                        <th>PRECIO</th>\n");
      out.write("                        <th>DESCUENTO</th>\n");
      out.write("                        <th>IMAGEN</th>\n");
      out.write("                      \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                \n");
      out.write("                ");

                    ProductosDAO dao=new ProductosDAO();
                    
                    ArrayList<Producto>list=dao.Listar();
                    
                    Iterator<Producto>iter=list.iterator();
                    Producto producto=new Producto();
                   
                    while(iter.hasNext()){
                        producto=iter.next();
                    
                    
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                     \n");
      out.write("                        <td>");
      out.print( producto.getIdproducto() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(producto.getDescripcion() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(producto.getPrecio() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(producto.getDescuento() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(producto.getImagen() );
      out.write("</td>\n");
      out.write("                       \n");
      out.write("                        <td> \n");
      out.write("                            <a href=\"../ProductoController?accion=editar&id=");
      out.print( producto.getIdproducto() );
      out.write("\" class=\"btn btn-success\" ><i class=\"fas fa-edit\"></i></a>\n");
      out.write("                             <a class=\"btn btn-danger deletebtn\"><i class=\"far fa-trash-alt\"></i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("    </div>\n");
      out.write("</section>          \n");
      out.write("    <!-- ventana modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"deletemodal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Eliminar Producto</h5>\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                    <form action=\"eliminar.php\" method=\"POST\">\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <input type=\"hidden\" name=\"delete_id\" id=\"delete_id\">\n");
      out.write("                            <h4>¿Esta seguro de eliminar el producto?</h4>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">No</button>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\" name=\"deletedata\">Si, eliminar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      <!--fin ventana modal -->                   \n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("    $('.deletebtn').on('click',function(){\n");
      out.write("\n");
      out.write("       $('#deletemodal').modal('show');\n");
      out.write("       $tr=$(this).closest('tr');\n");
      out.write("       var data=$tr.children(\"td\").map(function(){\n");
      out.write("        return $(this).text();\n");
      out.write("       }).get();\n");
      out.write("       console.log(data);\n");
      out.write("       $('#delete_id').val(data[0]);\n");
      out.write("      \n");
      out.write("    });\n");
      out.write("\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>   \n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("  <!--FOOTER INICIO -->\n");
      out.write("  <div class=\"container-fluid btn-lg-square text-light mt-5 py-5\" style=\"background-color:#5f3061;\">\n");
      out.write("        <div class=\"container py-5x\">\n");
      out.write("            <div class=\"row g-5 \">\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <h4 id=\"conocenos\"\n");
      out.write("                        class=\"d-inline-block text-uppercase border-bottom border-5 border-secondary mb-4\">VISÍTANOS\n");
      out.write("                    </h4>\n");
      out.write("                    <p id=\"color\" class=\"mb-2\"><i class=\"fa fa-map-marker-alt  me-3\"></i>Av. Jorge Chávez Mz. L1 Lote 16\n");
      out.write("                        A. Ex canal Balarezo. Castilla - Piura. </p>\n");
      out.write("                    <p id=\"color\" class=\"mb-2\"><i class=\"fa fa-envelope  me-3\"></i>allqovet@hotmail.com</p>\n");
      out.write("                    <p id=\"color\" class=\"mb-0\"><i class=\"fa fa-phone-alt me-3\"></i>979444796 / 073 343638</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <h4 id=\"conocenos\"\n");
      out.write("                        class=\"d-inline-block text-uppercase border-bottom border-5 border-secondary mb-4\">ENLACES\n");
      out.write("                        RÁPIDOS</h4>\n");
      out.write("                    <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                        <a id=\"color\" style=\"text-decoration:none; color:white;\"  class=\"mb-2\" href=\"#\"><i class=\"fa fa-angle-right me-2\"></i>Inicio</a>\n");
      out.write("                        <a id=\"color\" style=\"text-decoration:none; color:white;\" class=\"mb-2\" href=\"#\"><i class=\"fa fa-angle-right me-2\"></i>Conócenos</a>\n");
      out.write("                        <a id=\"color\" style=\"text-decoration:none; color:white;\" class=\"mb-2\" href=\"#\"><i class=\"fa fa-angle-right me-2\"></i>Servicios</a>\n");
      out.write("                        <a id=\"color\" style=\"text-decoration:none; color:white;\" class=\"mb-2\" href=\"#\"><i class=\"fa fa-angle-right me-2\"></i>Contáctanos</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <h4 id=\"conocenos\"\n");
      out.write("                        class=\"d-inline-block text-uppercase border-bottom border-5 border-secondary mb-4\">\n");
      out.write("                        CORRESPONDENCIA</h4>\n");
      out.write("                    <form action=\"\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control p-3 border-0\" placeholder=\"Ingresa tu correo\">\n");
      out.write("                            <button id=\"color\" class=\"btn\">Enviar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <h6 id=\"conocenos\" class=\"text-uppercase mt-4 mb-3\">Síguenos</h6>\n");
      out.write("                    <div class=\"d-flex\">\n");
      out.write("                        <a id=\"color\" class=\"btn btn-lg btn-lg-square rounded-circle me-2\" href=\"#\"><i\n");
      out.write("                                class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                        <a id=\"color\" class=\"btn btn-lg btn-lg-square rounded-circle\" href=\"#\"><i\n");
      out.write("                                class=\"fab fa-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- FOOTER FINAL -->\n");
      out.write("\n");
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
