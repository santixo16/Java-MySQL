/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import aplicacionpi.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class ModificarCliente extends javax.swing.JFrame {
    ConnectionDB conexion = new ConnectionDB("techcare");

    /**
     * Creates new form ModificarCliente
     */
    public ModificarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(700, 580);
        this.setTitle("MODIFICAR CLIENTE");
        disableFields();
    }
    
    public void enableFields(){
          primerNombreField.setEnabled(true);
          segundoNombreField.setEnabled(true);
          primerApellidoField.setEnabled(true);
          segundoApellidoField.setEnabled(true);        
          telefonoField.setEnabled(true);
          segundoApellidoField.setEnabled(true);
          direccionField.setEnabled(true);
          emailField.setEnabled(true);          
          fechaCitaField.setEnabled(true);
          modify_btn.setEnabled(true);          
    }
    
    public void disableFields(){
        primerNombreField.setEnabled(false);
        segundoNombreField.setEnabled(false);
        primerApellidoField.setEnabled(false);
        segundoApellidoField.setEnabled(false);        
        telefonoField.setEnabled(false);
        segundoApellidoField.setEnabled(false);
        direccionField.setEnabled(false);
        emailField.setEnabled(false);
        fechaCitaField.setEnabled(false);        
        modify_btn.setEnabled(false);
    }
    
    public void wipeFields(){
                idTextField.setText("");
                primerNombreField.setText("");
                segundoNombreField.setText("");
                primerApellidoField.setText("");
                segundoApellidoField.setText("");
                telefonoField.setText("");
                direccionField.setText("");
                emailField.setText("");               
                fechaCitaField.setText("");
    }
    
    public void searchClient(String id_cliente){
        Connection conn = conexion.conectar();
        try{
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM clientes WHERE id_cliente = ?");
            stmt.setString(1, id_cliente);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                enableFields();
                String primerNombre = rs.getString("primer_nombre_cliente");
                String segundoNombre = rs.getString("segundo_nombre_cliente");
                String primerApellido = rs.getString("primer_apellido_cliente");
                String segundoApellido = rs.getString("segundo_apellido_cliente");
                String telefono = rs.getString("telefono_cliente");
                String direccion = rs.getString("direccion_cliente");
                String email = rs.getString("correo_electronico");
                LocalDate fechaCita = rs.getDate("fecha_cita").toLocalDate() ;
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String fechaCitaStr = fechaCita.format(formatter);                
                
                primerNombreField.setText(primerNombre);
                segundoNombreField.setText(segundoNombre);
                primerApellidoField.setText(primerApellido);
                segundoApellidoField.setText(segundoApellido);
                telefonoField.setText(telefono);
                direccionField.setText(direccion);
                emailField.setText(email);
                fechaCitaField.setText(fechaCitaStr);
            }else{
                disableFields();
                wipeFields();
                JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el ID ingresado","Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
    }
    
    public void modifyClient(){
        String id_cliente = idTextField.getText();
        String nuevoPrimerNombre = primerNombreField.getText();
        String nuevoSegundoNombre = segundoNombreField.getText();
        String nuevoPrimerApellido = primerApellidoField.getText();
        String nuevoSegundoApellido = segundoApellidoField.getText();
        String nuevoTelefono = telefonoField.getText();
        String nuevaDireccion = direccionField.getText();
        String nuevoEmail = emailField.getText();
        
        try{
          Connection conn = conexion.conectar();        
          PreparedStatement stmt = conn.prepareStatement("UPDATE clientes SET primer_nombre_cliente = ?, segundo_nombre_cliente = ?, primer_apellido_cliente = ?, segundo_apellido_cliente = ?, telefono_cliente = ?, direccion_cliente = ?, correo_electronico = ? WHERE id_cliente = ?");
          stmt.setString(1, nuevoPrimerNombre);
          stmt.setString(2, nuevoSegundoNombre);
          stmt.setString(3, nuevoPrimerApellido);
          stmt.setString(4, nuevoSegundoApellido);
          stmt.setString(5, nuevoTelefono);
          stmt.setString(6, nuevaDireccion);
          stmt.setString(7, nuevoEmail);
          stmt.setString(8, id_cliente);
          
          int rowsAffected = stmt.executeUpdate();
          
          if(rowsAffected > 0 ){             
            JOptionPane.showMessageDialog(null, "Los datos del cliente se han actualizado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            disableFields();
            wipeFields();
          }else{
              disableFields();
            JOptionPane.showMessageDialog(null, "No se pudo actualizar los datos del cliente", "Error", JOptionPane.ERROR_MESSAGE);            
          }
          
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void goBack(){
        this.dispose();
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
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
        jLabel1 = new javax.swing.JLabel();
        segundoNombreField = new javax.swing.JTextField();
        fechaCitaField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        primerApellidoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        segundoApellidoField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefonoField = new javax.swing.JTextField();
        direccionField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        primerNombreField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        search_btn = new javax.swing.JButton();
        goback_btn = new javax.swing.JButton();
        wipe_btn = new javax.swing.JButton();
        modify_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICAR CLIENTE");

        segundoNombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoNombreFieldActionPerformed(evt);
            }
        });

        fechaCitaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaCitaFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Primer apellido:");

        jLabel10.setText("Fecha cita:");

        jLabel6.setText("Segundo apellido:");

        jLabel7.setText("Teléfono:");

        jLabel8.setText("Dirección:");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        idLabel.setText("Cedula:");

        jLabel9.setText("Email:");

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Primer nombre:");

        primerNombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerNombreFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Segundo nombre:");

        search_btn.setText("BUSCAR");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        goback_btn.setText("VOLVER");
        goback_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goback_btnActionPerformed(evt);
            }
        });

        wipe_btn.setText("LIMPIAR");
        wipe_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wipe_btnActionPerformed(evt);
            }
        });

        modify_btn.setText("MODIFICAR");
        modify_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(wipe_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(modify_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(segundoNombreField)
                            .addComponent(primerNombreField)
                            .addComponent(idTextField)
                            .addComponent(primerApellidoField)
                            .addComponent(segundoApellidoField)
                            .addComponent(telefonoField)
                            .addComponent(direccionField)
                            .addComponent(emailField)
                            .addComponent(fechaCitaField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goback_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primerNombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(segundoNombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primerApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundoApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaCitaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wipe_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goback_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void segundoNombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundoNombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segundoNombreFieldActionPerformed

    private void fechaCitaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCitaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaCitaFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void primerNombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerNombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerNombreFieldActionPerformed

    private void wipe_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wipe_btnActionPerformed
        disableFields();
        wipeFields();
    }//GEN-LAST:event_wipe_btnActionPerformed

    private void modify_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_btnActionPerformed
        modifyClient();
    }//GEN-LAST:event_modify_btnActionPerformed

    private void goback_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goback_btnActionPerformed
        goBack();
    }//GEN-LAST:event_goback_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        String id = idTextField.getText();
        searchClient(id);
    }//GEN-LAST:event_search_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direccionField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fechaCitaField;
    private javax.swing.JButton goback_btn;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modify_btn;
    private javax.swing.JTextField primerApellidoField;
    private javax.swing.JTextField primerNombreField;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField segundoApellidoField;
    private javax.swing.JTextField segundoNombreField;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JButton wipe_btn;
    // End of variables declaration//GEN-END:variables
}
