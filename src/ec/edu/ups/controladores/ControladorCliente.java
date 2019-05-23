/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Carlos
 */
public class ControladorCliente {
     private Set<Cliente> lista;
    private int codigo;
    // Constructor\\\\\\\\\\\\\\\\\\\\\\
  public ControladorCliente() {
        lista = new HashSet<>();
        codigo = 1;
    }
    public int getCodigo(){
        return codigo;
    }
 public Cliente readCedula(String cedula){
        for(Cliente cliente : lista){
            if(cliente.getCedula().equals(cedula))
                return cliente;
        }
        return null;
    }
    public Set<Cliente> getLista() {
        return lista;
    }
    /////////CRUD\\\\\\\\\\
    public void create(Cliente objeto) {
        
        objeto.setCodigo(codigo);
         codigo++;
        lista.add(objeto);
       
    }
    public Cliente read(int codigo) {
        for (Cliente cliente : lista) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }
    public void update(Cliente objeto) {
        for (Cliente cliente : lista) {
           
            if(cliente.equals(objeto)){
                lista.remove(cliente);
                lista.add(objeto);
                break;
            }
        }
    }
    public void delete(int codigo) {
        for (Cliente cliente : lista) {
           
            if(cliente.getCodigo()== codigo){
                lista.remove(cliente);
                break;
            }
        }
    }
   
   
}
