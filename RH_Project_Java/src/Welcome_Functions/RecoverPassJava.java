package Welcome_Functions;

//Imported Archives and Librarys
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import Security.Database_Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Security.RandomCode;

public class RecoverPassJava extends javax.swing.JFrame {
    private String userEmail;
    private String secretCode1;

    public RecoverPassJava() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        EmailInput = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        LoginButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Recover Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        EmailInput.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        EmailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailInputActionPerformed(evt);
            }
        });
        getContentPane().add(EmailInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 260, 40));

        LoginButton.setBackground(new java.awt.Color(51, 102, 255));
        LoginButton.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Send Email");
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
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, 40));

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

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Put your Email here");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RecoverPassImage.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailInputActionPerformed

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String email = EmailInput.getText();
        userEmail = email;

        Connection conn = Database_Conection.getConexion();
 
        try {
            String sql = "SELECT * FROM RH_Users WHERE Email = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, email);

            ResultSet result = statement.executeQuery();

            if (result.next()) {
                JOptionPane.showMessageDialog(null, "Email found", "Email System", JOptionPane.INFORMATION_MESSAGE);

                String secretCode1 = RandomCode.generateRandomCode();
                
                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");

                final String username = "soportprimeprogram@gmail.com";
                final String password = "fykcuuefrblwvqku";

                Session session = Session.getInstance(props,
                    new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

                    try {
                        MimeMessage message = new MimeMessage(session);
                        message.setFrom(new InternetAddress(username));
                        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
                        message.setSubject("Recover Password Code");

                        String htmlContent = "<html>" +
                        "<head></head>" +
                        "<body style=\"background-image: url(NewProject/images/fondo-verde-borroso-de-la-luz-del-extracto-bokeh-brillo-102747021.jpg); background-position: center;\">" +
                        "<div class=\"card\" style=\"margin: 0 auto; text-align: center; align-items: center; background-color: rgb(255, 255, 255); width: 70%; height: 280px; margin-top: 10%;\">" +
                        "<br>" +
                        "<h2 style=\"text-align: start; margin-left: 10%; margin-top: 5; font-size: 123%; color: blue;\">RH-SYSTEM/LuisJimenez35</h2>" +
                        "<h3 style=\"margin-top: 30px; display: inline-block; text-align: center; color: rgb(7, 7, 7); font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif ; font-weight: bold; font-size: 140%;\">Hello, please enter the following code to recover your password</h3>" +
                        "<br>" +
                        "<hr>" +
                        "<h1 style=\"color: rgb(51, 94, 214); font-size: 300%; position: relative; top: auto;\">" + secretCode1 + "</h1>" +
                        "</div>" +
                        "</body>" +
                        "</html>";

                        message.setContent(htmlContent, "text/html");

                        JOptionPane.showMessageDialog(null, "An email has been sent with the recovery code.", "Email System", JOptionPane.INFORMATION_MESSAGE);

                        Transport.send(message);

                        RecoverPassJava2 recoverPass2 = new RecoverPassJava2(secretCode1, userEmail);
                        recoverPass2.setVisible(true);
                        this.dispose();

                    } catch (MessagingException e) {
                        e.printStackTrace(); // Imprimir traza de la excepción
                        JOptionPane.showMessageDialog(null, "Email could not be sent " + e.getMessage(), "Email System", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Email not found", "Email System", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Databse Error.", "Email System", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_LoginButtonActionPerformed

    public String getUserEmail() {
        return userEmail;
    }
    
    public String getSecretCode1() {
        return secretCode1;
    }
    
    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
        Main_Window MenWindow = new Main_Window();
        MenWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RecoverPassJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecoverPassJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecoverPassJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecoverPassJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecoverPassJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailInput;
    public javax.swing.JButton LoginButton;
    private javax.swing.JButton LoginButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
