/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Muhammad Adil FAYYAZ
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public LoginForm() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txtUserEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Login");
        setMaximumSize(new java.awt.Dimension(800, 480));
        setMinimumSize(new java.awt.Dimension(800, 480));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 480));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Signin.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 70, 610, 80);

        txtUserEmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(txtUserEmail);
        txtUserEmail.setBounds(110, 210, 610, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 270, 120, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Email");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 180, 120, 25);

        txtUserPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(txtUserPassword);
        txtUserPassword.setBounds(110, 300, 610, 40);

        btnLogin.setBackground(new java.awt.Color(204, 255, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnLogin.setText("Sign in");
        btnLogin.setToolTipText("");
        jPanel1.add(btnLogin);
        btnLogin.setBounds(530, 360, 190, 40);

        btnCreateAccount.setBackground(new java.awt.Color(74, 137, 255));
        btnCreateAccount.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setText("Create an Account");
        jPanel1.add(btnCreateAccount);
        btnCreateAccount.setBounds(10, 440, 210, 30);

        jButton2.setBackground(new java.awt.Color(74, 137, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(750, 10, 40, 40);

        jLabel1.setBackground(new java.awt.Color(74, 137, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 828, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    public void DisplayError(String error){
        JOptionPane.showMessageDialog(this,error,"Alert",JOptionPane.WARNING_MESSAGE);
    }
    public void addLoginListener(ActionListener listnerforbutton){
        btnLogin.addActionListener(listnerforbutton);
    }
    public void addCreateAccoutListener(ActionListener listnerforbutton){
        btnCreateAccount.addActionListener(listnerforbutton);
    }
    public JButton getBtnLogin() {
        return btnLogin;
    }

    public JButton getBtnCreateAccount() {
        return btnCreateAccount;
    }

    public void setBtnCreateAccount(JButton btnCreateAccount) {
        this.btnCreateAccount = btnCreateAccount;
    }
    
    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }
    public JTextField getTxtUserEmail() {
        return txtUserEmail;
    }

    public void setTxtUserEmail(JTextField txtUserEmail) {
        this.txtUserEmail = txtUserEmail;
    }

    public JPasswordField getTxtUserPassword() {
        return txtUserPassword;
    }

    public void setTxtUserPassword(JPasswordField txtUserPassword) {
        this.txtUserPassword = txtUserPassword;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtUserEmail;
    private javax.swing.JPasswordField txtUserPassword;
    // End of variables declaration//GEN-END:variables
}