/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Carlos
 */
public class Producto {

    private int codigoproducto;
    private String nombre;
    private double precio;
   

    //////constructor\\\\\\\\\\\
    public Producto(){
    
}
    public Producto(int codigo, String nombre, double precio) {
        this.codigoproducto = codigo;
        this.nombre = nombre;
        this.precio = precio;
      
    }

    public int getCodigoproducto() {
        return codigoproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    ///////setters\\\\\\\\\\
    public void setCodigoProducto(int codigo) {
        this.codigoproducto = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    ////getters\\\\\\\\\\\
    

   

    ////to string\\\\\\

    @Override
    public String toString() {
        return "Producto{" + "codigoproducto=" + codigoproducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

    //////////hashcde\\\\\\\\\\
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.codigoproducto;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.codigoproducto != other.codigoproducto) {
            return false;
        }
       
        return true;
    }

}
