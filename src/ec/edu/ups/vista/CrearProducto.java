/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author erics
 */
public class CrearProducto extends javax.swing.JInternalFrame {
    private ControladorProducto controladorproducto;
    private ResourceBundle mensaje;
    
    /**
     * Creates new form CrearProducto
     */
    public CrearProducto(ControladorProducto controladorproducto, ResourceBundle mensajes) {
        initComponents();
     
        this.controladorproducto = controladorproducto;
         this.mensaje = mensajes;
       txtcp.setText(Integer.toString(this.controladorproducto.getCodigo()));
        cambiarIdioma(mensajes);
    }
    
     public void cambiarIdioma(ResourceBundle mensajes){
        
        JC.setText(mensajes.getString("producto.codigo"));
        JN.setText(mensajes.getString("producto.nombre"));
        JP.setText(mensajes.getString("producto.precio"));
        Aceptar.setText(mensajes.getString("boton.crear")); 
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        JP = new javax.swing.JLabel();
        JC = new javax.swing.JLabel();
        txtp = new javax.swing.JTextField();
        txtnp = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        txtcp = new javax.swing.JTextField();
        JN = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Crear Producto\n\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(51, 255, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JP.setText("PRECIO:");
        JP.setToolTipText("");
        jPanel3.add(JP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 120, 30));

        JC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JC.setText("CODIGO:");
        jPanel3.add(JC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, 30));

        txtp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpActionPerformed(evt);
            }
        });
        jPanel3.add(txtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 220, 50));

        txtnp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnpActionPerformed(evt);
            }
        });
        jPanel3.add(txtnp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 220, 50));

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancelar.setForeground(new java.awt.Color(0, 255, 204));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel3.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 150, 40));

        Aceptar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(0, 255, 204));
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        jPanel3.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 150, 40));

        txtcp.setEditable(false);
        txtcp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel3.add(txtcp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 220, 50));

        JN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JN.setText("NOMBRE:");
        jPanel3.add(JN, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 120, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 460, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnpActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        Producto crearproducto =new Producto();
        System.out.println(crearproducto.getCodigoproducto());
        crearproducto.setCodigoProducto(Integer.parseInt(txtcp.getText()));
        crearproducto.setNombre(txtnp.getText());
       crearproducto.setPrecio(Double.parseDouble(txtp.getText()));
       controladorproducto.crear(crearproducto);
       
        ////////limpiar
        txtnp.setText("");
        txtp.setText("");
       txtcp.setText(String.valueOf(this.controladorproducto.getCodigo()));
       JOptionPane.showMessageDialog(this, "Producto creado exitosamente!!", "Crear producto" , JOptionPane.OK_OPTION);
    }//GEN-LAST:event_AceptarActionPerformed

    private void txtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel JC;
    private javax.swing.JLabel JN;
    private javax.swing.JLabel JP;
    private javax.swing.JButton cancelar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtcp;
    private javax.swing.JTextField txtnp;
    private javax.swing.JTextField txtp;
    // End of variables declaration//GEN-END:variables
}
