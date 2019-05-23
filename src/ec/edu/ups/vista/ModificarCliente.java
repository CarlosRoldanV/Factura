/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class ModificarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Update
     */
     private ControladorCliente controladorcliente;
     private ResourceBundle mensajes;
    public ModificarCliente(ControladorCliente ControladorCliente, ResourceBundle mensaje) {
        initComponents();
         this.controladorcliente = ControladorCliente;
         this.mensajes = mensaje;
        cambiarIdioma(mensaje);
        
    }
public void cambiarIdioma(ResourceBundle mensajes) {
        LN.setText(mensajes.getString("cliente.nombre"));
        LC.setText(mensajes.getString("cliente.codigo"));
        
        LCE.setText(mensajes.getString("cliente.cedula"));
        LD.setText(mensajes.getString("cliente.direccion"));
        LT.setText(mensajes.getString("cliente.telefono"));
        cancelar.setText(mensajes.getString("boton.cancelar"));
        buscar.setText(mensajes.getString("boton.buscar"));
        BA.setText(mensajes.getString("boton.actualizar"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttelefono = new javax.swing.JTextField();
        LT = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        LD = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        LCE = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        LN = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        BA = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LC = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttelefono.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 250, 50));

        LT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LT.setText("TELEFONO:");
        getContentPane().add(LT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 160, 30));

        txtdireccion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 250, 60));

        LD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LD.setText("DIRECCION:");
        getContentPane().add(LD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 160, 30));

        txtcedula.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 250, 50));

        LCE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LCE.setText("CEDULA:");
        LCE.setToolTipText("");
        getContentPane().add(LCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 120, 30));

        txtnombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 250, 50));

        LN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LN.setText("NOMBRE:");
        getContentPane().add(LN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 120, 30));

        buscar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        buscar.setForeground(new java.awt.Color(204, 0, 204));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 240, 40));

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 255, 204));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 150, 40));

        BA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BA.setForeground(new java.awt.Color(102, 102, 255));
        BA.setText("ACTUALIZAR");
        BA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAActionPerformed(evt);
            }
        });
        getContentPane().add(BA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 150, 50));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LC.setText("CODIGO");
        jPanel1.add(LC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 120, 30));

        txtcodigo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 670, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here
        int codigo=Integer.parseInt(txtcodigo.getText());
        Cliente cliente = controladorcliente.read(codigo);
        System.out.println(cliente);
        txtnombre.setText(cliente.getNombre());
        txtcedula.setText(cliente.getCedula());
        txtdireccion.setText(cliente.getDireccion());
        txttelefono.setText(cliente.getTelefono());
    }//GEN-LAST:event_buscarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:

        dispose();
        
    }//GEN-LAST:event_cancelarActionPerformed

    private void BAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAActionPerformed
        // TODO add your handling code here:
        Cliente cliente = controladorcliente.read(Integer.parseInt(txtcodigo.getText()));
        cliente.setCedula(txtcedula.getText());
        cliente.setNombre(txtnombre.getText());
        cliente.setDireccion(txtdireccion.getText());
        cliente.setTelefono(txttelefono.getText());
        controladorcliente.update(cliente);
       JOptionPane.showMessageDialog(this, "Cliente actualizado exitosamente!!", "Crear cliente" , JOptionPane.OK_OPTION);
        txtcodigo.setText("");
        txtcedula.setText("");
        txtnombre.setText("");
        txtdireccion.setText("");
       txttelefono.setText("");
    }//GEN-LAST:event_BAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BA;
    private javax.swing.JLabel LC;
    private javax.swing.JLabel LCE;
    private javax.swing.JLabel LD;
    private javax.swing.JLabel LN;
    private javax.swing.JLabel LT;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
