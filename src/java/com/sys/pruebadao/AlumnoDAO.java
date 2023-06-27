/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.pruebadao;

import com.sys.config.Conexion;
import com.sys.idao.IAlumno;
import com.sys.model.Alumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ELIAS
 */
public class AlumnoDAO implements IAlumno {
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Alumno alumno=new Alumno();

    @Override
    public ArrayList<Alumno> Listar() {
       ArrayList<Alumno> list=new ArrayList<>();
       String sql="SELECT * FROM alumno";
       
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                Alumno alumno=new Alumno();
                alumno.setId(rs.getInt("idalumno"));
                alumno.setDni(rs.getString("dni"));
                alumno.setApellidopaterno(rs.getString("apellidopaterno"));
                alumno.setApellidomaterno(rs.getString("apellidomaterno"));
                alumno.setNombres(rs.getString("nombres"));
                alumno.setDireccion(rs.getString("direccion"));
                alumno.setTelefono(rs.getString("telefono"));
                
                list.add(alumno);
                
            }
        } catch (Exception e) {
            System.out.println("Error en modulo alumnodao:" +e.toString());
               System.out.println("lista vacia");
        }
       return list;
    }

    @Override
    public int Editar(Alumno alumno) {
      
        String SQL_UPDATE = "UPDATE alumno SET dni = ?, apellidopaterno = ? , apellidomaterno = ?"
                + ",nombres = ?, direccion = ?, telefono = ?  WHERE idalumno = ? ";
        try {
            con=cn.getConnection();
            
             PreparedStatement pst=con.prepareStatement(SQL_UPDATE);
             pst.setString(1, alumno.getDni());
             pst.setString(2, alumno.getApellidopaterno());
             pst.setString(3, alumno.getApellidomaterno());
             pst.setString(4, alumno.getNombres());
             pst.setString(5, alumno.getDireccion());
             pst.setString(6, alumno.getTelefono());
             pst.setInt(7, alumno.getId());
                        
            int row = pst.executeUpdate();
            return row;
            
        } catch (Exception e) {
             System.out.println("error al actualizar :"+ e.toString());
            return 0;
        }
        
    }

    @Override
    public int Agregar(Alumno alumno) {
        
        String SQL_INSERT = "insert into alumno (dni, apellidopaterno, apellidomaterno, nombres ,direccion,telefono) VALUES (?,?,?,?,?,?)";
        try {
            con=cn.getConnection();
            
             PreparedStatement pst=con.prepareStatement(SQL_INSERT);
             pst.setString(1, alumno.getDni());
             pst.setString(2, alumno.getApellidopaterno());
             pst.setString(3, alumno.getApellidomaterno());
             pst.setString(4, alumno.getNombres());
             pst.setString(5, alumno.getDireccion());
             pst.setString(6, alumno.getTelefono());
                        
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
    public List Buscar(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public Alumno Listar(int id) {
      
       String sql="SELECT * FROM alumno where idalumno="+id;
       
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
              
                alumno.setId(rs.getInt("idalumno"));
                alumno.setDni(rs.getString("dni"));
                alumno.setApellidopaterno(rs.getString("apellidopaterno"));
                alumno.setApellidomaterno(rs.getString("apellidomaterno"));
                alumno.setNombres(rs.getString("nombres"));
                alumno.setDireccion(rs.getString("direccion"));
                alumno.setTelefono(rs.getString("telefono"));
                
                              
            }
        } catch (Exception e) {
            System.out.println("Error en modulo alumnodao:" +e.toString());
               System.out.println("lista vacia");
        }
       return alumno;
    }
    
}
