/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.pruebadao;

import com.sys.config.Conexion;
import com.sys.idao.IUsuario;
import com.sys.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ELIAS
 */
public class UsuarioDAO  implements IUsuario {
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public ArrayList<Usuario> Listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario Listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Editar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Agregar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List Buscar(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario Login(Usuario usuario) {
        
         Usuario usuario_in=new Usuario();
        
        String sql="SELECT * FROM usuario where nombre=? and password=?";
       
        try {
            
            con=cn.getConnection();
      
             PreparedStatement pst=con.prepareStatement(sql);
             pst.setString(1, usuario.getNombre());
             pst.setString(2, usuario.getPassword());
            
             rs=pst.executeQuery();
              
            while(rs.next()){
                
                usuario_in.setId(rs.getInt("id"));
                usuario_in.setNombre(rs.getString("nombre"));
              
            }
            
        } catch (Exception e) {
            
               System.out.println("Error en modulo usuariodao:" +e.toString());
               
        }
        return   usuario_in;
    }
    
    
    
}
