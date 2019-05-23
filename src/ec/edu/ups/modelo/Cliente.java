/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;
import java.util.Objects;
/**
 *
 * @author Carlos
 */
public class Cliente {

   
    private int codigo;
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
///////////////contructor\\\\\\\\\\\\\
    public Cliente() {
        
    }
    public Cliente(int codigo, String nombre, String cedula, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    
////////////Seters\\\\\\\\\\\\
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
   ////////////////gettes\\\\\\\\\\\\\\\\\

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
    //////////ToString\\\\\\\\\\

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", cedula=" + cedula + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    }
