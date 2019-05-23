/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.modelo.Producto;
public class BuscarProducto extends javax.swing.JInternalFrame {

    private ControladorProducto controladorProducto;
    public BuscarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto = controladorProducto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Bnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Bcodigo = new javax.swing.JTextField();
        Bprecio = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CODIGO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 70, 90, 21));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("NOMBRE");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 110, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        Bnombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bnombre.setEnabled(false);
        Bnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnombreActionPerformed(evt);
            }
        });
        jPanel2.add(Bnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PRECIO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 150, 90, -1));

        Bcodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcodigoActionPerformed(evt);
            }
        });
        jPanel2.add(Bcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, 30));

        Bprecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Bprecio.setEnabled(false);
        jPanel2.add(Bprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 170, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 360, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcodigoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(Bcodigo.getText());
        Producto buscarProducto = controladorProducto.read(codigo);
        Bnombre.setText(buscarProducto.getNombre());
        Bprecio.setText(String.valueOf(buscarProducto.getPrecio()));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BnombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bcodigo;
    private javax.swing.JTextField Bnombre;
    private javax.swing.JTextField Bprecio;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}