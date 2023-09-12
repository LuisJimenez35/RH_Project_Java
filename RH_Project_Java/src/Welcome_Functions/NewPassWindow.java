package Welcome_Functions;

//Imported Archives and Librarys
import Security.Database_Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class NewPassWindow extends javax.swing.JFrame {
    private String userEmail;
    
    public NewPassWindow(String userEmail1, String userEmail2) {
        setUndecorated(true);
        initComponents();
        this.userEmail = userEmail2;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginButton1 = new javax.swing.JButton();
        Password2 = new javax.swing.JTextField();
        Password1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginButton1.setBackground(new java.awt.Color(102, 0, 0));
        LoginButton1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        LoginButton1.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton1.setText("Cancel");
        LoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 170, -1));

        Password2.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        Password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password2ActionPerformed(evt);
            }
        });
        getContentPane().add(Password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 260, 40));

        Password1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        Password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password1ActionPerformed(evt);
            }
        });
        getContentPane().add(Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 260, 40));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm the password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter the new password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        LoginButton.setBackground(new java.awt.Color(51, 102, 255));
        LoginButton.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Send New Password");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 180, 40));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Recover Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RecoverPassImage.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password2ActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String Pass1 = Password1.getText();
        String Pass2 = Password2.getText();
        
        Connection conn = Database_Conection.getConexion();
      
        if (Pass1.equals(Pass2)) {
            try {
                String sql = "UPDATE RH_Users SET Password = ? WHERE Email = ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, Pass1);
                statement.setString(2, userEmail); 
                
                int rowsAffected = statement.executeUpdate();
                
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Correct password update", "Security System", JOptionPane.INFORMATION_MESSAGE);
                    Main_Window Principal1 = new Main_Window();
                    Principal1.setVisible(true);
                    this.dispose();                
                } else {
                    JOptionPane.showMessageDialog(null, "Error updating data E-mail not found", "Security System", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(NewPassWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Passwords not the same", "Security System", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_LoginButtonActionPerformed
 
    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
        Main_Window MenWindow = new Main_Window();
        MenWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginButton1ActionPerformed

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void Password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewPassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold> 
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RecoverPassJava recoverPassJava = new RecoverPassJava();
                String userEmail = recoverPassJava.getUserEmail();

                new NewPassWindow(userEmail, userEmail).setVisible(true);
    }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton LoginButton;
    private javax.swing.JButton LoginButton1;
    private javax.swing.JTextField Password1;
    private javax.swing.JTextField Password2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
