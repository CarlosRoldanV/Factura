/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.controladores.ControladorFactura;
import ec.edu.ups.controladores.ControladorFacturaDetalle;
import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.modelo.FacturaDetalle;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Fernanda
 */
public class CrearFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaFactura
     */
    private ControladorFactura controladorfactura;
    private ControladorFacturaDetalle controladorfacturadetalle;
    private ControladorCliente controladorcliente;
    private ControladorProducto controladorproducto;
    Cliente cliente;
    private double subtotal1;
    private double iva1;
    private double total1;
    public CrearFactura(ControladorFactura controladorFactura,ControladorFacturaDetalle ControladorFacturaDetalle , ControladorCliente controladorCliente, ControladorProducto controladorProducto) {
        initComponents();
        Factura facturav = new Factura();
        this.controladorfactura = controladorFactura;
        this.controladorfacturadetalle = ControladorFacturaDetalle;
        this.controladorcliente= controladorCliente;
        this.controladorproducto= controladorProducto;
        Fecha.setText(fechaActual());
        NumFac.setText(String.valueOf(this.controladorfactura.getCodigo()));
    }

    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        return formato.format(fecha);
    }
    
    public void Subtotal(){
        subtotal1 = 0.00;
        TableModel tabla = TablaProducto.getModel();
        int fila = tabla.getRowCount();
        for(int i = 0; i < fila; i++){
            subtotal1 +=(double) tabla.getValueAt(i, 4);
        }
        Subtotal.setText(String.valueOf(subtotal1));
    }
    
    public void Iva(){
        iva1 = 0.12* subtotal1;
        Iva.setText(String.valueOf(iva1));
    }
    
    public void Total(){
        Subtotal();
        Iva();
        Total.setText(String.valueOf(subtotal1)+(iva1));
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
        codigo = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        BuscarCliente = new javax.swing.JButton();
        apellido = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        numfac = new javax.swing.JLabel();
        NumFac = new javax.swing.JTextField();
        direccion = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        fecha = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        subtotal = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        Subtotal = new javax.swing.JTextField();
        Iva = new javax.swing.JTextField();
        Total = new javax.swing.JTextField();
        bscarProducto = new javax.swing.JLabel();
        BuscarProducto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Calcular = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        codigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigo.setText("CODIGO");
        jPanel1.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 87, 24));

        Codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Codigo.setEnabled(false);
        jPanel1.add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 24));

        cedula.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cedula.setText("RUC/CEULA");
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 41, 87, 24));

        Cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 43, 110, 24));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("NOMBRE");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 115, 87, 24));

        Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre.setToolTipText("");
        Nombre.setEnabled(false);
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, 24));

        BuscarCliente.setText("BUSCAR");
        BuscarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 146, 24));

        apellido.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        apellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apellido.setText("APELLIDOS");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 157, 87, 24));

        Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Apellido.setEnabled(false);
        Apellido.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 157, 110, 24));

        numfac.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        numfac.setText("N° FACTURA");
        jPanel1.add(numfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 13, -1, 24));

        NumFac.setEnabled(false);
        jPanel1.add(NumFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 13, 110, 24));

        direccion.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        direccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        direccion.setText("DIRECCIÓN");
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 55, 86, 24));

        Direccion.setEnabled(false);
        Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionActionPerformed(evt);
            }
        });
        jPanel1.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 57, 110, 24));

        telefono.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefono.setText("TELEFONO");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 99, 86, 24));

        Telefono.setEnabled(false);
        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 99, 110, 24));

        fecha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("FECHA");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 157, 86, 24));

        Fecha.setEnabled(false);
        jPanel1.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 157, 110, 24));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 489, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PRODUCTO", "P.UNI", "CANTIDAD", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaProducto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 228, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        subtotal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        subtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtotal.setText("SUBTOTAL");

        iva.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        iva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iva.setText("IVA 12%");

        total.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setText("TOTAL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Iva)
                    .addComponent(Subtotal)
                    .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(subtotal))
                    .addComponent(Subtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Iva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total)
                    .addComponent(Total))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 361, -1, -1));

        bscarProducto.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        bscarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bscarProducto.setText("BUSCAR PRODUCTO");
        getContentPane().add(bscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 198, -1, 24));

        BuscarProducto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(BuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 198, 100, 24));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Calcular.setText("CALCULAR");
        Calcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Crear.setText("CREAR");
        Crear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        Cancelar.setText("CANCELAR");
        Cancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Crear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Calcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 361, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionActionPerformed

    private void BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteActionPerformed
        // TODO add your handling code here:
         String cedula=Cedula.getText();
        Cliente buscarCliente=controladorcliente.readCedula(cedula);
        Nombre.setText(buscarCliente.getNombre());
        Apellido.setText(buscarCliente.getNombre());
        Direccion.setText(buscarCliente.getDireccion());
        Telefono.setText(buscarCliente.getTelefono());
        cliente = buscarCliente;
    }//GEN-LAST:event_BuscarClienteActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        // TODO add your handling code here:
        Factura factura = new Factura();
        factura.setCliente(cliente);
        factura.setIva(Double.parseDouble(Iva.getText()));
        factura.setSubtotal(Double.parseDouble(Subtotal.getText()));
        factura.setTotal(Double.parseDouble(Total.getText()));
        //factura.setFecha(fecha);
        controladorfactura.crear(factura);
        JOptionPane.showMessageDialog(this, "Factura Creada");
        NumFac.setText(String.valueOf(this.controladorfactura.getCodigo()));
        Codigo.setText("");
        Cedula.setText("");
        Nombre.setText("");
        Apellido.setText("");
        Direccion.setText("");
        Telefono.setText("");
        Subtotal.setText("");
        Iva.setText("");
        Total.setText("");
    }//GEN-LAST:event_CrearActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
        Subtotal();
        Iva();
        Total();
        Crear.setEnabled(true);
    }//GEN-LAST:event_CalcularActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton BuscarCliente;
    private javax.swing.JButton BuscarProducto;
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Codigo;
    private javax.swing.JButton Crear;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Fecha;
    private javax.swing.JTextField Iva;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NumFac;
    private javax.swing.JTextField Subtotal;
    private javax.swing.JTable TablaProducto;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel bscarProducto;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel iva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numfac;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}