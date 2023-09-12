package Welcome_Functions;

//Imported Archives and Librarys
import javax.swing.JOptionPane;

public class RecoverPassJava2 extends javax.swing.JFrame {
    private String secretCode;
    private String userEmail;

    public RecoverPassJava2(String secretCode1, String userEmail1) {
        setUndecorated(true);
        initComponents();
        this.secretCode = secretCode1;
        this.userEmail = userEmail1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        CodeInput = new javax.swing.JTextField();
        LoginButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Recover Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Put your secret code here");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        LoginButton.setBackground(new java.awt.Color(51, 102, 255));
        LoginButton.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Send Secret Code");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, 40));

        CodeInput.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        CodeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeInputActionPerformed(evt);
            }
        });
        getContentPane().add(CodeInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 260, 40));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RecoverPassImage.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeInputActionPerformed

    }//GEN-LAST:event_CodeInputActionPerformed

    public String getUserEmail() {
        return userEmail;
    }
    
    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
        RecoverPassJava Recover2 = new RecoverPassJava();
        Recover2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginButton1ActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String SecretCode = CodeInput.getText();
        
        if (SecretCode.equals(secretCode)){
            JOptionPane.showMessageDialog(null, "Correct Code", "Security System", JOptionPane.INFORMATION_MESSAGE);

            NewPassWindow newPass = new NewPassWindow(secretCode, userEmail);
            newPass.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect Code", "Security System", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RecoverPassJava2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecoverPassJava2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecoverPassJava2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecoverPassJava2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Crea una instancia de RecoverPassJava para obtener secretCode1
                RecoverPassJava recoverPassJava = new RecoverPassJava();
                String secretCode1 = recoverPassJava.getSecretCode1();
                String userEmail = recoverPassJava.getUserEmail();

                // Creas una nueva instancia de RecoverPassJava2 pasando ambos valores
                new RecoverPassJava2(secretCode1, userEmail).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodeInput;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton LoginButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
