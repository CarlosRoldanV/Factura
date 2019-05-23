/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Carlos
 */
public class FacturaDetalle {
    private int codigo;
    private double precio;
    private int cantidad;
    private double subtotal;
    private Producto producto;
    private int codfac;
    ////////contructores\\\\\\\\\\\

    public FacturaDetalle(int codigo, double precio, int cantidad, double subtotal, Producto producto, int codfac) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.producto = producto;
        this.codfac = codfac;
    }
    //////////getters\\\\\\\\

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCodfac() {
        return codfac;
    }
    ////////////////setteres\\\\\\\\\\

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCodfac(int codfac) {
        this.codfac = codfac;
    }
    //////////toSting\\\\\\\\\\

    @Override
    public String toString() {
        return "FacturaDetalle{" + "codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", producto=" + producto + ", codfac=" + codfac + '}';
    }
    
}
