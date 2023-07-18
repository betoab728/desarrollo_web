/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.controller;

import com.sys.model.Carrito;
import com.sys.model.Cliente;
import com.sys.model.Compra;
import com.sys.model.Fecha;
import com.sys.model.Pago;
import com.sys.model.Producto;
import com.sys.pruebadao.CompraDAO;
import com.sys.pruebadao.ProductosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ELIAS
 */
public class ProductoController extends HttpServlet {

     String listar="vistas/productos.jsp";
     String listarCarrito="vistas/carrito.jsp";
     
     String compraexitosa="vistas/compraexitosa.jsp";
     
     String listado="vistas/ListadoProductos.jsp";
     
     ProductosDAO dao=new ProductosDAO();
                    
     ArrayList<Producto>list=new ArrayList<>();
     
       int item =0;
        ArrayList<Carrito> listaCarrito =new ArrayList<>();
       double totalpagar=0;
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
            out.println("<title>Servlet ProductoController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductoController at " + request.getContextPath() + "</h1>");
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
          
         System.out.println("en el contrl");
          
        if (action.equalsIgnoreCase("listar")){
            acceso=listar;
        } else if (action.equalsIgnoreCase("Listado")){
            acceso=listado;
        } else if (action.equalsIgnoreCase("ListarProd")){
            
            ProductosDAO db=new ProductosDAO();
            ArrayList<Producto> productos=new ArrayList<>();
            
            productos=db.Listar();
            
            acceso=listado;
            request.setAttribute("contador", listaCarrito.size());
            request.setAttribute("productos", productos);
            
        } else if (action.equalsIgnoreCase("AgregarCarrito")){
            
            int idproducto=Integer.parseInt(request.getParameter("id"));
                
              Producto producto=new Producto();
              ProductosDAO db=new ProductosDAO();
              producto=db.ListarId(idproducto);
              
              double totalPagar=0.0;
              int cantidad =1;
              
              item+=1;
              
              Carrito carrito=new Carrito();
              carrito.setItem(item);
              carrito.setIdproducto(producto.getIdproducto());
              carrito.setNombre(producto.getDescripcion());
              carrito.setPrecioCompra(producto.getPrecio());
              carrito.setCantidad(cantidad);
              carrito.setSubtotal(cantidad * producto.getPrecio() );
               carrito.setImagen(producto.getImagen());
              
              listaCarrito.add(carrito);
              
              request.setAttribute("contador", listaCarrito.size());
              
             // acceso="ProductoController?accion=ListarProd";
             
             acceso="ProductoController?accion=ListarProd";
            
        } else if (action.equalsIgnoreCase("MostrarCarrito")){
            
              
                for (int i = 0; i < listaCarrito.size(); i++) {
                totalpagar+=listaCarrito.get(i).getSubtotal();
            }
                request.setAttribute("contador", listaCarrito.size());
                request.setAttribute("totalPagar", totalpagar);
                request.setAttribute("carrito", listaCarrito);
           
             acceso=listarCarrito;        
             
             System.out.println(" en mostrar carrt");
        } else if (action.equalsIgnoreCase("Delete")){
            
            System.out.println("entro a delete");
            
           int idproducto=Integer.parseInt(request.getParameter("idp"));
           
            for (int i = 0; i < listaCarrito.size(); i++) {
                if (listaCarrito.get(i).getIdproducto()==idproducto) 
                    listaCarrito.remove(i);
            }
                
            
           
        } else if (action.equalsIgnoreCase("GenerarCompra")){
            
            System.out.println("genera compra");
            
                double totalpagar=0;
                for (int i = 0; i < listaCarrito.size(); i++) {
                totalpagar+=listaCarrito.get(i).getSubtotal();
                  }
                
                Cliente cliente=new Cliente();
                cliente.setIdcliente(1);
                
                CompraDAO compradb=new CompraDAO();
                
                Compra compra=new Compra();
                //cliente,1,Fecha.FechaBD(),totalpagar,"pendiente",listaCarrito
              //   public Compra(Cliente cliente, int idpago, String fecha, double monto, String estado, List<Carrito> detallecompra) {
               compra.setCliente(cliente);
               compra.setIdpago(1);
               compra.setFecha(Fecha.FechaBD());
               compra.setMonto(totalpagar);
               compra.setDetallecompra(listaCarrito);
               
               int res=compradb.Agregar(compra);
               
                    if (res!=0) {
                         acceso=compraexitosa; 
                    }
                
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
