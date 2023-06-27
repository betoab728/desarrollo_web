/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.idao;

import com.sys.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ELIAS
 */
public interface IUsuario {
    
     public ArrayList<Usuario> Listar();
    public Usuario Listar(int id);
    public int Editar(Usuario usuario);
    public int Agregar(Usuario usuario);
    public int Eliminar(int id);
    public List Buscar(String apellido);
    public Usuario Login (Usuario usuario);
    
}
