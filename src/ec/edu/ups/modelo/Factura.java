/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Carlos
 */
public class Factura {

    
 private int codigo;
private Date fecha;
private Cliente cliente;
private double subtotal;
private double iva;
private double total;
/////////contructor\\\\\\\\\\\
public Factura() {
    }

    public Factura(int codigo, Date fecha, Cliente cliente, double subtotal, double iva, double total) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
    }

 ///////getters\\\\\\\

    public int getCodigo() {
        return codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }
/////////////sett\\\\\\\\\

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setTotal(double total) {
        this.total = total;
    }
///////////////toString\\\\\\\\\\\\\\\\
    
    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", fecha=" + fecha + ", cliente=" + cliente + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + '}';
    }

    
}