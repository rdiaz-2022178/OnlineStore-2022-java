package org.rodrigodiaz.vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import org.rodrigodiaz.controlador.ControlDeCliente;
import org.rodrigodiaz.controlador.ControlDeUsuario;
import org.rodrigodiaz.modelo.Cliente;
import org.rodrigodiaz.modelo.Usuario;


/**
 *
 * @author rodro
 */
public class VentanaLoginStore extends javax.swing.JFrame {
    
    ControlDeCliente controlador = new ControlDeCliente();
    VentanaVistaAdmin ventanaVistaAdmin = new VentanaVistaAdmin();
    VentanaVistaCliente ventanaVistaCliente = new VentanaVistaCliente();
    VentanaRegistrarse ventanaRegistrarse = new VentanaRegistrarse();
    
    /***
     * Cremos un objeto instanciado del controlador
     */


    /**
     * Creates new form LoginVeterinaryProject
     */
    public VentanaLoginStore() {
        initComponents();
        setLocationRelativeTo(null);
        
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
        lbl_fondoLogo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtPassLogin = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        botonIngresar = new javax.swing.JButton();
        botonIngresar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_fondoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/recursos/city.png"))); // NOI18N
        lbl_fondoLogo.setText("jLabel2");
        jPanel1.add(lbl_fondoLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 290, 490));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("INICIAR SESIÓN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("USUARIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 100, -1));

        txtUsuarioLogin.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuarioLogin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUsuarioLogin.setText("Ingrese su nombre de usuario");
        txtUsuarioLogin.setToolTipText("");
        txtUsuarioLogin.setBorder(null);
        txtUsuarioLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioLoginMousePressed(evt);
            }
        });
        jPanel1.add(txtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 390, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 370, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CONTRASEÑA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        txtPassLogin.setBackground(new java.awt.Color(255, 255, 255));
        txtPassLogin.setText("***************");
        txtPassLogin.setBorder(null);
        txtPassLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassLoginMousePressed(evt);
            }
        });
        jPanel1.add(txtPassLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 360, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 370, 10));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/rodrigodiaz/recursos/login.png"))); // NOI18N
        jLabel4.setText("LOGIN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, 50));

        botonIngresar.setBackground(new java.awt.Color(0, 134, 190));
        botonIngresar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("INGRESAR");
        botonIngresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 110, 40));

        botonIngresar1.setBackground(new java.awt.Color(0, 134, 190));
        botonIngresar1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar1.setText("REGISTRAR");
        botonIngresar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonIngresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 110, 40));

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

    private void txtUsuarioLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioLoginMousePressed
        if (txtUsuarioLogin.getText().equals("Ingrese su nombre de usuario")){
            txtUsuarioLogin.setText("");
            txtUsuarioLogin.setForeground(Color.black);
        }

    }//GEN-LAST:event_txtUsuarioLoginMousePressed

    private void txtPassLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassLoginMousePressed
        if (String.valueOf(txtPassLogin.getPassword()).equals("***************")){
            txtPassLogin.setText("");
            txtPassLogin.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPassLoginMousePressed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        Cliente cliente = new Cliente();
        cliente.setUsuario(txtUsuarioLogin.getText());
        cliente.setContraseña(String.valueOf(txtPassLogin.getPassword()));
        if (controlador.iniciarSesionCliente2(cliente) == true) {
            ventanaVistaAdmin.setVisible(false);
            JOptionPane.showMessageDialog(null, "Bienvenido "+ cliente.getUsuario());
            txtUsuarioLogin.setText("");
            txtPassLogin.setText("");
            ventanaVistaCliente.setVisible(true);
        }else if(controlador.iniciarSesionAdmin2(cliente) == true){
            ventanaVistaCliente.setVisible(false);
            JOptionPane.showMessageDialog(null, "Bienvenido "+cliente.getUsuario());
            ventanaVistaAdmin.setVisible(true);
            txtUsuarioLogin.setText("");
            txtPassLogin.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Verifique el usuario o la contraseña", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        txtPassLogin.setText("***************");
        txtUsuarioLogin.setText("Ingrese su nombre de usuario");

    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresar1ActionPerformed
        ventanaRegistrarse.setVisible(true);
    }//GEN-LAST:event_botonIngresar1ActionPerformed

/**/
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonIngresar1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_fondoLogo;
    private javax.swing.JPasswordField txtPassLogin;
    private javax.swing.JTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables
}
