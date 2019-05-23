/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Carlos
 */
public class ControladorProducto {
       private Set<Producto> lista;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }
    
    public ControladorProducto() {
        lista = new HashSet<>();
        codigo = 1;
    }
    
    public void crear(Producto producto){
        producto.setCodigoProducto(codigo);
        codigo++;
        lista.add(producto);
    }
    
    public Producto read(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigoproducto()== codigo){
                return producto;
            }
        }
        return null;
    }
    
    public void update(Producto producto){
        if(lista.contains(producto)){
            lista.remove(producto);
            lista.add(producto);
        }
    }
    
    public void delete(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigoproducto()== codigo){
                lista.remove(producto);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Producto producto : lista) {
            System.out.println(producto.getNombre());
        }
    }
    public Set<Producto> getLista() {

        return lista;

    }
}