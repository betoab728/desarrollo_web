/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.pruebadao;

import com.sys.config.Conexion;
import com.sys.idao.IProducto;
import com.sys.model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ELIAS
 */
public class ProductosDAO implements IProducto {
    
      Conexion cn= new Conexion();
      Connection con;

    @Override
    public ArrayList<Producto> Listar() {
        
       ArrayList<Producto> list=new ArrayList<>();
       String sql="SELECT * FROM productos";
       
        try {
            con=cn.getConnection();
           PreparedStatement  pst=con.prepareStatement(sql);
           ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                Producto producto=new Producto();
                producto.setIdproducto(rs.getInt("idproducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setDescuento(rs.getDouble("descuento"));
                producto.setImagen(rs.getString("imagen"));
                
                list.add(producto);
                
            }
        } catch (Exception e) {
            System.out.println("Error en modulo productodao:" +e.toString());
              
        }
       return list;
        
    }

    @Override
    public Producto Listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Editar(Producto producto) {
       String SQL_UPDATE = "UPDATE productos SET descripcion = ?, precio = ? , descuento = ?"
                + ",imagen = ?  WHERE idproducto = ? ";
        try {
            con=cn.getConnection();
            
             PreparedStatement pst=con.prepareStatement(SQL_UPDATE);
             pst.setString(1, producto.getDescripcion());
             pst.setDouble(2, producto.getPrecio());
             pst.setDouble(3, producto.getDescuento());
             pst.setString(4, producto.getImagen());
             pst.setInt(5, producto.getIdproducto());
            
                        
            int row = pst.executeUpdate();
            return row;
            
        } catch (Exception e) {
             System.out.println("error al actualizar :"+ e.toString());
            return 0;
        }
        
    }

    @Override
    public int Agregar(Producto producto) {
       
             String SQL_INSERT = "insert into productos (descripcion, precio, descuento ,imagen) VALUES (?,?,?,?)";
        try {
            con=cn.getConnection();
            
             PreparedStatement pst=con.prepareStatement(SQL_INSERT);
             pst.setString(1, producto.getDescripcion());
             pst.setDouble(2, producto.getPrecio());
             pst.setDouble(3, producto.getDescuento());
             pst.setString(4, producto.getImagen());
           
            int row = pst.executeUpdate();
            return row;
            
        } catch (Exception e) {
             e.printStackTrace();
            return 0;
        }
        
    }

    @Override
    public int Eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List Buscar(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
