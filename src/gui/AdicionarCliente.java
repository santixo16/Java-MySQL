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
    
    public void AddClient(java.awt.event.ActionEvent evt){  
        String idCliente = idTextField.getText();
        String primerNombre = primerNombreField.getText();
        String segundoNombre = segundoNombreField.getText();
        String primerApellido = primerApellidoField.getText();
        String segundoApellido = segundoApellidoField.getText();
        String telefono = telefonoField.getText();
        String direccion = direccionField.getText();
        String email = emailField.getText();
        String Fecha_de_la_cita = fechaCitaField.getText();
        
        try {
            Connection conn = conexion.conectar();

            PreparedStatement statement = conn.prepareStatement("INSERT INTO clientes (id_cliente, primer_nombre_cliente, segundo_nombre_cliente, primer_apellido_cliente, segundo_apellido_cliente, telefono_cliente, direccion_cliente, correo_electronico, fecha_cita) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, idCliente);
            statement.setString(2, primerNombre);
            statement.setString(3, segundoNombre);
            statement.setString(4, primerApellido);
            statement.setString(5, segundoApellido);
            statement.setString(6, telefono);
            statement.setString(7, direccion);
            statement.setString(8, email);
            statement.setString(9, Fecha_de_la_cita);
        
            statement.executeUpdate();

            conn.close();

            JOptionPane.showMessageDialog(null, "Cliente agregado correctamente.");
            wipeFields();
        
    } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el cliente: " + e.getMessage());
    }
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
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADICIONAR CLIENTE");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Cédula.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Cédula.setForeground(new java.awt.Color(51, 51, 51));
        Cédula.setText("Cédula:");

        idTextField.setBackground(new java.awt.Color(218, 218, 218));
        idTextField.setForeground(new java.awt.Color(51, 51, 51));

        Primer_nombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Primer_nombre.setForeground(new java.awt.Color(51, 51, 51));
        Primer_nombre.setText("Primer nombre:");

        primerNombreField.setBackground(new java.awt.Color(218, 218, 218));
        primerNombreField.setForeground(new java.awt.Color(51, 51, 51));
        primerNombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerNombreFieldActionPerformed(evt);
            }
        });

        Segundo_nombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Segundo_nombre.setForeground(new java.awt.Color(51, 51, 51));
        Segundo_nombre.setText("Segundo nombre:");

        segundoNombreField.setBackground(new java.awt.Color(218, 218, 218));
        segundoNombreField.setForeground(new java.awt.Color(51, 51, 51));

        Primer_apellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Primer_apellido.setForeground(new java.awt.Color(51, 51, 51));
        Primer_apellido.setText("Primer apellido:");

        primerApellidoField.setBackground(new java.awt.Color(218, 218, 218));
        primerApellidoField.setForeground(new java.awt.Color(51, 51, 51));

        Segundo_apellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Segundo_apellido.setForeground(new java.awt.Color(51, 51, 51));
        Segundo_apellido.setText("Segundo apellido:");

        segundoApellidoField.setBackground(new java.awt.Color(218, 218, 218));
        segundoApellidoField.setForeground(new java.awt.Color(51, 51, 51));

        Teléfono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Teléfono.setForeground(new java.awt.Color(51, 51, 51));
        Teléfono.setText("Teléfono:");

        telefonoField.setBackground(new java.awt.Color(218, 218, 218));
        telefonoField.setForeground(new java.awt.Color(51, 51, 51));

        Dirección.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Dirección.setForeground(new java.awt.Color(51, 51, 51));
        Dirección.setText("Dirección:");

        direccionField.setBackground(new java.awt.Color(218, 218, 218));
        direccionField.setForeground(new java.awt.Color(51, 51, 51));

        Email.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(51, 51, 51));
        Email.setText("Email:");

        emailField.setBackground(new java.awt.Color(218, 218, 218));
        emailField.setForeground(new java.awt.Color(51, 51, 51));

        Fecha_de_la_cita.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Fecha_de_la_cita.setForeground(new java.awt.Color(51, 51, 51));
        Fecha_de_la_cita.setText("Fecha de la cita (YYYY/MM/DD):");

        fechaCitaField.setBackground(new java.awt.Color(218, 218, 218));
        fechaCitaField.setForeground(new java.awt.Color(51, 51, 51));

        back_btn.setBackground(new java.awt.Color(102, 153, 255));
        back_btn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        back_btn.setForeground(new java.awt.Color(0, 0, 0));
        back_btn.setText("VOLVER");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        addition_btn.setBackground(new java.awt.Color(102, 153, 255));
        addition_btn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addition_btn.setForeground(new java.awt.Color(0, 0, 0));
        addition_btn.setText("ADICIONAR");
        addition_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addition_btnActionPerformed(evt);
            }
        });

        wipe_btn.setBackground(new java.awt.Color(102, 153, 255));
        wipe_btn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        wipe_btn.setForeground(new java.awt.Color(0, 0, 0));
        wipe_btn.setText("LIMPIAR");
        wipe_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wipe_btnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cédula)
                                    .addComponent(Segundo_nombre)
                                    .addComponent(Primer_apellido)
                                    .addComponent(Segundo_apellido)
                                    .addComponent(Teléfono)
                                    .addComponent(Dirección)
                                    .addComponent(Primer_nombre)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(primerApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(telefonoField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(segundoApellidoField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                            .addComponent(idTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(primerNombreField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(segundoNombreField, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(direccionField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(Fecha_de_la_cita))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(wipe_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addition_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaCitaField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cédula))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerNombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Primer_nombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundoNombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Segundo_nombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primerApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Primer_apellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundoApellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Segundo_apellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Teléfono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dirección))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaCitaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha_de_la_cita))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addition_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wipe_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
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

    private void primerNombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerNombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerNombreFieldActionPerformed

    private void wipe_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wipe_btnActionPerformed
        wipeFields();
    }//GEN-LAST:event_wipe_btnActionPerformed

    private void addition_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addition_btnActionPerformed
        AddClient(evt);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField primerApellidoField;
    private javax.swing.JTextField primerNombreField;
    private javax.swing.JTextField segundoApellidoField;
    private javax.swing.JTextField segundoNombreField;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JButton wipe_btn;
    // End of variables declaration//GEN-END:variables
}
