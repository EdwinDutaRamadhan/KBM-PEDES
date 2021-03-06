/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsipsuratlk;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author HP
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form pageLogin
     */
    public SignUp() {
        initComponents();
        labelimage.setBorder(new EmptyBorder(0,0,0,0));
        enterButton.setBorder(null);
        enterButton.setContentAreaFilled(false);
        reset();
        repassword.setText(" ");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelimage = new javax.swing.JLabel();
        iconFTI = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        repasswordTextField = new javax.swing.JTextField();
        repassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(220, 221, 216));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        labelimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arsipsuratlk/img/login_1.jpg"))); // NOI18N
        labelimage.setText(" ");

        iconFTI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arsipsuratlk/img/logo_fti_50x50.png"))); // NOI18N
        iconFTI.setText(" ");

        usernameTextField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        usernameTextField.setText("Username");
        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusLost(evt);
            }
        });

        passwordTextField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        passwordTextField.setText("Password");
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        passwordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusLost(evt);
            }
        });

        enterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arsipsuratlk/img/icon_enter.jpg"))); // NOI18N
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Felix Titling", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("DAFTAR AKUN");

        repasswordTextField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        repasswordTextField.setText("Re-Password");
        repasswordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                repasswordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                repasswordTextFieldFocusLost(evt);
            }
        });

        repassword.setForeground(new java.awt.Color(255, 0, 51));
        repassword.setText("re-password tidak sama dengan password!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(labelimage, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(111, 111, 111))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(repasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(repassword)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(iconFTI)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelimage, javax.swing.GroupLayout.PREFERRED_SIZE, 658, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(iconFTI)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(repasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repassword)
                .addGap(52, 52, 52)
                .addComponent(enterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusGained
        if(usernameTextField.getText().equals("Username")){
            usernameTextField.setText("");
            usernameTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_usernameTextFieldFocusGained

    private void usernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusLost
        if(usernameTextField.getText().equals("")){
            usernameTextField.setText("Username");
            usernameTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_usernameTextFieldFocusLost

    private void passwordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusGained
        if(passwordTextField.getText().equals("Password")){
            passwordTextField.setText("");
            passwordTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_passwordTextFieldFocusGained

    private void passwordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusLost
        if(passwordTextField.getText().equals("")){
            passwordTextField.setText("Password");
            passwordTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_passwordTextFieldFocusLost

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        
        if(repasswordTextField.getText().equals(passwordTextField.getText())){
           try {
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/arsip_lk","root", "");
            koneksi.createStatement().executeUpdate("insert into db_data values" + "('"+usernameTextField.getText()+"','"+passwordTextField.getText()+"')");   
            JOptionPane.showMessageDialog(this,"Berhasil Mendaftar");
            pageLogin ed=new pageLogin();
            ed.setExtendedState(JFrame.MAXIMIZED_BOTH);
            ed.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        } 
       }else{
           repassword.setText("re-password tidak sama dengan password!"); 
           reset();
       }
        if(usernameTextField.getText().equals("Username")&&passwordTextField.getText().equals("Password")){
            //JOptionPane.showMessageDialog(this,"Isi data terlebih dahulu");
            repassword.setText("Isi data terlebih dahulu");
        }
             
    }//GEN-LAST:event_enterButtonActionPerformed

    private void repasswordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repasswordTextFieldFocusGained
        if(repasswordTextField.getText().equals("Re-Password")){
            repasswordTextField.setText("");
            repasswordTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_repasswordTextFieldFocusGained

    private void repasswordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repasswordTextFieldFocusLost
        if(repasswordTextField.getText().equals("")){
            repasswordTextField.setText("Re-Password");
            repasswordTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_repasswordTextFieldFocusLost

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        //kepenccet
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SignUp ed=new SignUp();
                ed.setExtendedState(JFrame.MAXIMIZED_BOTH);
                ed.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel iconFTI;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelimage;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel repassword;
    private javax.swing.JTextField repasswordTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        usernameTextField.setText("Username");
        usernameTextField.setForeground(new Color(153,153,153));
        passwordTextField.setText("Password");
        passwordTextField.setForeground(new Color(153,153,153));
        repasswordTextField.setText("Re-Password");
        repasswordTextField.setForeground(new Color(153,153,153));
    }

}
