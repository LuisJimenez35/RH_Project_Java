/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Welcome_Functions;

import Security.Database_Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisM
 */
public class RecoverPassword_Window extends javax.swing.JFrame {

    /**
     * Creates new form RecoverPassword_Window
     */
    public RecoverPassword_Window() {
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

        LoginButton1 = new javax.swing.JButton();
        EmailInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginButton1.setBackground(new java.awt.Color(51, 153, 0));
        LoginButton1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        LoginButton1.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton1.setText("Return");
        LoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));

        EmailInput.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        EmailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailInputActionPerformed(evt);
            }
        });
        getContentPane().add(EmailInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 260, 40));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Put your Email here");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        LoginButton.setBackground(new java.awt.Color(51, 102, 255));
        LoginButton.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Send Email");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Recover Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RecoverPassImage.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailInputActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String Email = EmailInput.getText();
        
        Connection conn = Database_Conection.getConexion();
        
        try{
            // Consultar la base de datos para verificar las credenciales
            String sql = "SELECT * FROM RH_Users WHERE Email = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, Email);
            
            ResultSet result = statement.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Search email in the system", "Email System" , JOptionPane.WARNING_MESSAGE );
            
            //Validate email data
            if (result.next()) {
                JOptionPane.showMessageDialog(null, "Found Email " , "Email System", JOptionPane.INFORMATION_MESSAGE);                                
                // Open new window and close before window
                JOptionPane.showMessageDialog(null, "Check your email and wait for the secret code" , "Email System", JOptionPane.INFORMATION_MESSAGE);
                RecoverPassword_Window_2 Recover2 = new RecoverPassword_Window_2();
                Recover2.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Email not found", "Email System", JOptionPane.ERROR_MESSAGE);
            }            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
    Main_Window MenWindow = new Main_Window();
    MenWindow.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_LoginButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RecoverPassword_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecoverPassword_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecoverPassword_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecoverPassword_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecoverPassword_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailInput;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton LoginButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
