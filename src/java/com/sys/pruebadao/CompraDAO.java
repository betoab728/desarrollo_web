/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.pruebadao;

import com.sys.config.Conexion;
import com.sys.idao.ICompra;
import com.sys.model.Carrito;
import com.sys.model.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ELIAS
 */
public class CompraDAO  implements ICompra {

    Connection con;
    Conexion cn=new Conexion();
     PreparedStatement  pst;
    ResultSet rs;
     int r=0;
    
    
    @Override
    public int Agregar(Compra compra) {
      String sql ="insert into compra (idcliente,idpago,fecha,monto,estado) values(?,?,?,?,?)";
        try {
                con=cn.getConnection();
                pst=con.prepareStatement(sql);
                pst.setInt(1, compra.getCliente().getIdcliente());
                pst.setDouble(2, compra.getIdpago());
                pst.setString(3, compra.getFecha());
                pst.setDouble(4, compra.getMonto());
                pst.setString(5, compra.getEstado());
                
                r=  pst.executeUpdate();
                
                int idcompra=0;
               String sql3="select @@IDENTITY as idcompra";
                rs=pst.executeQuery(sql3);
                while(rs.next()){
                     idcompra=rs.getInt("idcompra");
                }
               
                rs.close();
                
                for(Carrito detalle: compra.getDetallecompra()){
                   String sql2="insert into detallecompra (idproducto,idcompra,cantidad,precio) values (?,?,?,?)";
                    
                    pst=con.prepareStatement(sql2);
                    pst.setInt(1, detalle.getIdproducto());
                    pst.setDouble(2, idcompra);
                    pst.setInt(3, detalle.getCantidad());
                    pst.setDouble(4, detalle.getPrecioCompra());
                    
                    r=  pst.executeUpdate();
                }
                
                
        } catch (Exception e) {
            System.out.println("error en la compra"+e.getMessage());
        }
        
        return r;
    }
    
}
