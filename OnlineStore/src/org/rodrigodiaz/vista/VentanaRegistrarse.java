/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.rodrigodiaz.vista;

import java.awt.Color;
import org.rodrigodiaz.controlador.ControlDeCliente;
import org.rodrigodiaz.modelo.Cliente;
import org.rodrigodiaz.modelo.Usuario;

/**
 *
 * @author rodro
 */
public class VentanaRegistrarse extends javax.swing.JFrame {
    ControlDeCliente controlador = new ControlDeCliente();

    /**
     * Creates new form VentanaRegistrarse
     */
    public VentanaRegistrarse() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombreCliente = new javax.swing.JLabel();
        lblApellidoCliente = new javax.swing.JLabel();
        lblTelefonoCliente = new javax.swing.JLabel();
        lblEmailCliente = new javax.swing.JLabel();
        lblDpiCliente = new javax.swing.JLabel();
        lblUsuarioCliente = new javax.swing.JLabel();
        lblContrase├▒aCliente = new javax.swing.JLabel();
        botonCrearCliente = new javax.swing.JButton();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        txtUsuarioCliente = new javax.swing.JTextField();
        txtContrase├▒aCliente = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtDpiCliente1 = new javax.swing.JTextField();
        lblUsuarioCliente1 = new javax.swing.JLabel();
        cbDepartamentoCLiente = new javax.swing.JComboBox<>();
        lblDepartamentoMedico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRARSE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 140, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 310, -1));

        lblNombreCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreCliente.setText("Nombre");
        jPanel1.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, -1));

        lblApellidoCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblApellidoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidoCliente.setText("Apellido");
        jPanel1.add(lblApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, -1));

        lblTelefonoCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTelefonoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefonoCliente.setText("Telefono");
        jPanel1.add(lblTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblEmailCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEmailCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblEmailCliente.setText("Email");
        jPanel1.add(lblEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lblDpiCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDpiCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblDpiCliente.setText("DPI");
        jPanel1.add(lblDpiCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        lblUsuarioCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblUsuarioCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuarioCliente.setText("Direccion");
        jPanel1.add(lblUsuarioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        lblContrase├▒aCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblContrase├▒aCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblContrase├▒aCliente.setText("Contrase├▒a");
        jPanel1.add(lblContrase├▒aCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        botonCrearCliente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonCrearCliente.setForeground(new java.awt.Color(0, 0, 0));
        botonCrearCliente.setText("REGISTRARSE");
        botonCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearClienteActionPerformed(evt);
            }
        });
        jPanel1.add(botonCrearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 160, 30));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 130, -1));
        jPanel1.add(txtApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 130, -1));
        jPanel1.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 130, -1));
        jPanel1.add(txtEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 130, -1));
        jPanel1.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 130, -1));
        jPanel1.add(txtUsuarioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 130, -1));
        jPanel1.add(txtContrase├▒aCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 130, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/recursos/iconoCliente3.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 50, 50));
        jPanel1.add(txtDpiCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 130, -1));

        lblUsuarioCliente1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblUsuarioCliente1.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuarioCliente1.setText("Usuario");
        jPanel1.add(lblUsuarioCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        cbDepartamentoCLiente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta Verapaz", "Baja Verapaz", "Chimaltenango", "Chiquimula", "El Progreso", "Escuintla", "Guatemala", "Huehuetenango", "Izabal", "Jalapa", "Jutiapa", "Peten", "Quetzaltenango", "Quiche", "Retalhuleu", "Sacatepequez", "San Marcos", "Santa Rosa", "Solola", "Suchitepequez", "Totonicapan", "Zacapa" }));
        jPanel1.add(cbDepartamentoCLiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 110, -1));

        lblDepartamentoMedico.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblDepartamentoMedico.setForeground(new java.awt.Color(0, 0, 0));
        lblDepartamentoMedico.setText("Departamento");
        jPanel1.add(lblDepartamentoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearClienteActionPerformed
        Cliente cliente = new Cliente();
        ControlDeCliente controlador = new ControlDeCliente();
        cliente.setNombreCliente(txtNombreCliente.getText());
        cliente.setApellidoCliente(txtApellidoCliente.getText());
        cliente.setTelefonoCLietne(txtTelefonoCliente.getText());
        cliente.setEmailCliente(txtEmailCliente.getText());
        cliente.setDireccionCLiente(txtDireccionCliente.getText());
             
        if (cbDepartamentoCLiente.getSelectedItem().equals("Alta Verapaz")) {
            cliente.setIdDepartamentoCliente(1);
        }else if(cbDepartamentoCLiente.getSelectedItem().equals("Baja Verapaz")){
            cliente.setIdDepartamentoCliente(2);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Chimaltenango")) {
            cliente.setIdDepartamentoCliente(3);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Chiquimula")) {
            cliente.setIdDepartamentoCliente(4);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("El Progreso")) {
            cliente.setIdDepartamentoCliente(5);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Escuintla")) {
            cliente.setIdDepartamentoCliente(6);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Guatemala")) {
            cliente.setIdDepartamentoCliente(7);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Huehuetenango")) {
            cliente.setIdDepartamentoCliente(8);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Izabal")) {
            cliente.setIdDepartamentoCliente(9);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Jalapa")) {
            cliente.setIdDepartamentoCliente(10);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Jutiapa")) {
            cliente.setIdDepartamentoCliente(11);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Peten")) {
            cliente.setIdDepartamentoCliente(12);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Quetzaltenango")) {
            cliente.setIdDepartamentoCliente(13);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Quiche")) {
            cliente.setIdDepartamentoCliente(14);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Retalhuleu")) {
            cliente.setIdDepartamentoCliente(15);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Sacatepequez")) {
            cliente.setIdDepartamentoCliente(16);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("San Marcos")) {
            cliente.setIdDepartamentoCliente(17);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Santa Rosa")) {
            cliente.setIdDepartamentoCliente(18);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Solola")) {
            cliente.setIdDepartamentoCliente(19);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Suchitepequez")) {
            cliente.setIdDepartamentoCliente(20);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Totonicapan")) {
            cliente.setIdDepartamentoCliente(21);
        }else if (cbDepartamentoCLiente.getSelectedItem().equals("Zacapa")) {
            cliente.setIdDepartamentoCliente(22);
        }

        cliente.setDpiCLiente(txtUsuarioCliente.getText());
        cliente.setEstadoActivo(true);
        cliente.setUsuario(txtUsuarioCliente.getText());
        cliente.setContrase├▒a(String.valueOf(txtContrase├▒aCliente.getPassword()));
        cliente.setRol(false);
        
  

        controlador.agregarCliente(cliente);
        txtNombreCliente.setText("");
        txtApellidoCliente.setText("");
        txtTelefonoCliente.setText("");
        txtEmailCliente.setText("");
        txtDireccionCliente.setText("");
        txtDpiCliente1.setText("");
        txtUsuarioCliente.setText("");
        txtContrase├▒aCliente.setText("");
        setVisible(false);
    }//GEN-LAST:event_botonCrearClienteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearCliente;
    private javax.swing.JComboBox<String> cbDepartamentoCLiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidoCliente;
    private javax.swing.JLabel lblContrase├▒aCliente;
    private javax.swing.JLabel lblDepartamentoMedico;
    private javax.swing.JLabel lblDpiCliente;
    private javax.swing.JLabel lblEmailCliente;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblUsuarioCliente;
    private javax.swing.JLabel lblUsuarioCliente1;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JPasswordField txtContrase├▒aCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDpiCliente1;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtUsuarioCliente;
    // End of variables declaration//GEN-END:variables
}
