/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankappp;

import admin.admindashboard;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.userdashboard;

/**
 *
 * @author SCC
 */
public class loginform extends javax.swing.JFrame {

    /**
     * Creates new form loginform
     */
    public loginform() {
        initComponents();
    }

   static String status;
    static String type;
    
            
    public static boolean loginAcc(String username, String password){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE user_username = '" + username + "'";
            ResultSet resultSet = connector.getData(query);
            if(resultSet.next()){
                
                String hashedPass = resultSet.getString("user_password");
                String rehashedPass = passwordHasher.hashPassword(password);
                
                
                if(hashedPass.equals(rehashedPass)){
                    status = resultSet.getString("user_status");
                    type = resultSet.getString("user_type");
                    Session sess = Session.getInstance();
                    sess.setUid(resultSet.getInt("user_id"));
                    sess.setFname(resultSet.getString("user_fname"));
                    sess.setLname(resultSet.getString("user_lname"));
                    sess.setEmail(resultSet.getString("user_email"));
                    sess.setUsername(resultSet.getString("user_username"));
                    sess.setType(resultSet.getString("user_type"));
                    sess.setStatus(resultSet.getString("user_status"));
                return true;
                }else{
                    return false;
                }
                
            }else{
                return false;
            }
            
        }catch (SQLException | NoSuchAlgorithmException ex) {
            return false;
        }

    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(736, 415, 415, 415));
        setMaximumSize(new java.awt.Dimension(736, 415));
        setMinimumSize(new java.awt.Dimension(736, 415));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 50, 100, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 90, 100, 17);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(181, 47, 190, 30);

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 120, 80, 23);

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(270, 120, 100, 23);

        jButton3.setText("Create account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(180, 150, 190, 23);

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(180, 80, 190, 30);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(-10, 170, 750, 240);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGIN FORM");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(280, 60, 150, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 3, 737, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        
       
        
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        Session sess = Session.getInstance();
        
        if(loginAcc(username.getText(), password.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null,"Pending Account, Wait for the Admin to Approval!");
            }else{
                if(type.equals("Admin")){
                    JOptionPane.showMessageDialog(null, "Login Successfully!");
                    admindashboard ap = new admindashboard();
                    ap.uname.setText(""+sess.getLname());
                    ap.setVisible(true);
                    this.dispose();
                }else if(type.equals("User")){
                    JOptionPane.showMessageDialog(null, "Login Successfully!");
                    userdashboard up = new userdashboard();
                    
                   
                    up.bname.setText(""+sess.getLname());
                    up.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No account type, Contact the Admin!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Account!");
        }      
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        
        registrationform register = new registrationform();
        register.setVisible(true);
        this.dispose();


       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
