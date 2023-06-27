/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.controller;

import com.sys.model.Producto;
import com.sys.model.Usuario;
import com.sys.pruebadao.ProductosDAO;
import com.sys.pruebadao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ELIAS
 */
public class UsuarioController extends HttpServlet {
    
     String menu="vistas/menu.jsp";
     String listaproductos="vistas/productos.jsp";
     String login="vistas/login.jsp";
     String nuevoproducto="vistas/nuevoproducto.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsuarioController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UsuarioController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String acceso="";
        String action=request.getParameter("accion");
        
        if (action.equalsIgnoreCase("Ingresar")){
            
             
//            
            String nombre =request.getParameter("txtnombre");
            String clave=  request.getParameter("txtclave");
            
            Usuario usuario= new Usuario();
            usuario.setNombre(nombre);
            usuario.setPassword(clave);
            
            UsuarioDAO dao= new  UsuarioDAO();
            
            Usuario validar= new Usuario();
            validar= dao.Login(usuario);
            
            if(validar.getNombre()!=null){
                //acceso correcto
                System.out.println("Acceso correcto");
                 acceso=menu;
                 
                 System.out.println("acceso paso a menu");
            } else{
                // usuario no encontrado
                System.out.println("Acceso denegado");
                
                 acceso=login;
            }
    
        }else if(action.equalsIgnoreCase("listarproductos")) {
              
             acceso=listaproductos;
        } else if(action.equalsIgnoreCase("NuevoProducto")) {
              
             acceso=nuevoproducto;
        }
        else if(action.equalsIgnoreCase("Guardar")) {
            
              String descripcion =request.getParameter("txtdescripcion");
              double precio =Double.parseDouble(request.getParameter("txtprecio")) ;
              double descuento =Double.parseDouble(request.getParameter("txtdescuento")) ;;
              String imagen =request.getParameter("txtimagen");
              
              Producto producto=new Producto();
              producto.setDescripcion(descripcion);
              producto.setPrecio(precio);
              producto.setDescuento(descuento);
              producto.setImagen(imagen);
              
              ProductosDAO db=new ProductosDAO();
              db.Agregar(producto);
              
             acceso=listaproductos;
        }
        
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
