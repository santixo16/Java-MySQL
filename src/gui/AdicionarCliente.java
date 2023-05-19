/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import aplicacionpi.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
/**
 *
 * @author Santiago
 */
public class AdicionarCliente extends javax.swing.JFrame {

    ConnectionDB conexion = new ConnectionDB("techcare");   
    
    /**
     * Creates new form AdicionarCliente
     */
    public AdicionarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(680,590);
        this.setTitle("ADICIONAR CLIENTE");
    }
    
    public void goBack(){
        this.dispose();
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
    }
    
    public void wipeFields(){
                idTextField.setText("");
                primerNombreField.setText("");
                segundoNombreField.setText("");
                segundoApellidoField.setText("");
                segundoApellidoField.setText("");
                telefonoField.setText("");
                direccionField.setText("");
                emailField.setText("");
                fechaCitaField.setText("");
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Cédula = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        Primer_nombre = new javax.swing.JLabel();
        primerNombreField = new javax.swing.JTextField();
        Segundo_nombre = new javax.swing.JLabel();
        segundoNombreField = new javax.swing.JTextField();
        Primer_apellido = new javax.swing.JLabel();
        primerApellidoField = new javax.swing.JTextField();
        Segundo_apellido = new javax.swing.JLabel();
        segundoApellidoField = new javax.swing.JTextField();
        Teléfono = new javax.swing.JLabel();
        telefonoField = new javax.swing.JTextField();
        Dirección = new javax.swing.JLabel();
        direccionField = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        Fecha_de_la_cita = new javax.swing.JLabel();
        fechaCitaField = new javax.swing.JTextField();
        back_btn = new javax.swing.JButton();
        addition_btn = new javax.swing.JButton();
        wipe_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("ADICIONAR CLIENTE");

        Cédula.setText("Cédula:");

        idTextField.setBackground(new java.awt.Color(255, 255, 255));

        Primer_nombre.setText("Primer nombre:");

        primerNombreField.setBackground(new java.awt.Color(255, 255, 255));
        primerNombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerNombreFieldActionPerformed(evt);
            }
        });

        Segundo_nombre.setText("Segundo nombre:");

        segundoNombreField.setBackground(new java.awt.Color(255, 255, 255));

        Primer_apellido.setText("Primer apellido:");

        primerApellidoField.setBackground(new java.awt.Color(255, 255, 255));

        Segundo_apellido.setText("Segundo apellido:");

        segundoApellidoField.setBackground(new java.awt.Color(255, 255, 255));

        Teléfono.setText("Teléfono:");

        telefonoField.setBackground(new java.awt.Color(255, 255, 255));

        Dirección.setText("Dirección:");

        direccionField.setBackground(new java.awt.Color(255, 255, 255));

        Email.setText("Email:");

        emailField.setBackground(new java.awt.Color(255, 255, 255));

        Fecha_de_la_cita.setText("Fecha de la cita:");

        fechaCitaField.setBackground(new java.awt.Color(255, 255, 255));

        back_btn.setText("VOLVER");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        addition_btn.setText("ADICIONAR");
        addition_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addition_btnActionPerformed(evt);
            }
        });

        wipe_btn.setText("LIMPIAR");
        wipe_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wipe_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Fecha_de_la_cita)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fechaCitaField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Primer_nombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(primerNombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Cédula)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Segundo_nombre)
                                    .addGap(46, 46, 46)
                                    .addComponent(segundoNombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Primer_apellido)
                                    .addGap(58, 58, 58)
                                    .addComponent(primerApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Email)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Dirección)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Teléfono)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Segundo_apellido)
                                    .addGap(46, 46, 46)
                                    .addComponent(segundoApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wipe_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(addition_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cédula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerNombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Primer_nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundoNombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Segundo_nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Primer_apellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundoApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Segundo_apellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Teléfono))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dirección))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaCitaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha_de_la_cita))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addition_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wipe_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primerNombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerNombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerNombreFieldActionPerformed

    private void wipe_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wipe_btnActionPerformed
        wipeFields();
    }//GEN-LAST:event_wipe_btnActionPerformed

    private void addition_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addition_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addition_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        goBack();
    }//GEN-LAST:event_back_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cédula;
    private javax.swing.JLabel Dirección;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Fecha_de_la_cita;
    private javax.swing.JLabel Primer_apellido;
    private javax.swing.JLabel Primer_nombre;
    private javax.swing.JLabel Segundo_apellido;
    private javax.swing.JLabel Segundo_nombre;
    private javax.swing.JLabel Teléfono;
    private javax.swing.JButton addition_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField direccionField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fechaCitaField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField primerApellidoField;
    private javax.swing.JTextField primerNombreField;
    private javax.swing.JTextField segundoApellidoField;
    private javax.swing.JTextField segundoNombreField;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JButton wipe_btn;
    // End of variables declaration//GEN-END:variables
}