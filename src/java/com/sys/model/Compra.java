/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sys.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ELIAS
 */
public class Compra {
    
  private int idcompra;
  private  Cliente cliente;
  private  int idpago;
  private   String fecha;
  private  double monto;
  private  String estado;
    
    private List<Carrito>detallecompra;

    public Compra() {
    }

    public Compra(Cliente cliente, int idpago, String fecha, double monto, String estado, List<Carrito> detallecompra) {
        this.cliente = cliente;
        this.idpago = idpago;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = estado;
        this.detallecompra = detallecompra;
    }
    

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Carrito> getDetallecompra() {
        return detallecompra;
    }

    public void setDetallecompra(List<Carrito> detallecompra) {
        this.detallecompra = detallecompra;
    }


    
}
