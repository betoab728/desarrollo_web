/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.idao;

import com.sys.model.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ELIAS
 */
public interface IAlumno {
    public ArrayList<Alumno> Listar();
    public Alumno Listar(int id);
    public int Editar(Alumno alumno);
    public int Agregar(Alumno alumno);
    public int Eliminar(int id);
    public List Buscar(String apellido);
    
}
