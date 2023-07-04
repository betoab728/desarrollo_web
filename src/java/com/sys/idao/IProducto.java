/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.idao;

import com.sys.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ELIAS
 */
public interface IProducto {
    
    public ArrayList<Producto> Listar();
    public Producto Listar(int id);
    public int Editar(Producto producto);
    public int Agregar(Producto producto);
    public int Eliminar(int id);
    public List Buscar(String descripcion);
    public Producto ListarId(int id);
    
    
}
