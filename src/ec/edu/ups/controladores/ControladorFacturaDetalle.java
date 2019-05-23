/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.FacturaDetalle;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Carlos
 */
public class ControladorFacturaDetalle {

    private Set<FacturaDetalle> lista;
    private int codigo;

    public ControladorFacturaDetalle() {
        lista = new HashSet<>();
        codigo = 1;
    }

    public int getCodigo() {
        return codigo;
    }

    public Set<FacturaDetalle> getLista() {

        return lista;

    }
/////////CRUD\\\\\\\\\\
    public void crear(FacturaDetalle objeto) {
        objeto.setCodigo(codigo);
        lista.add(objeto);
        codigo++;
    }

    public FacturaDetalle read(int codigo) {
        for (FacturaDetalle factura : lista) {
            if (factura.getCodigo() == codigo) {
                return factura;
            }
        }
        return null;
    }

    public void update(FacturaDetalle objeto) {
        if (lista.contains(objeto)) {
            lista.remove(objeto);
            lista.add(objeto);
        }
    }

    public void delete(int codigo) {
        for (FacturaDetalle factura : lista) {
            if (factura.getCodigo() == codigo) {
                lista.remove(factura);
                break;
            }
        }
    }

}
