/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC
 */
public class adminApplicants extends javax.swing.JFrame {

    /**
     * Creates new form adminApplicants
     */
    public adminApplicants() {
        initComponents();
    }
    
    public void close(){
            
            this.dispose();
            userform md = new userform();
            md.setVisible(true);
            
        }
    
    public String action;
     public static String us, em;
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE user_username = '" + username.getText() + "' OR user_email = '" + email.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                
                em = resultSet.getString("user_email");
                System.out.println(""+em);
                if(em.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    email.setText("");
                }
                
                us = resultSet.getString("user_username");
                System.out.println(""+us);
                if(us.equals(username.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!");
                    username.setText("");
                }
                
                return true;
                
            }else{
                return false;
            }
            
        }catch (SQLException ex) {
            System.out.println(""+ex);
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

        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        acctype = new javax.swing.JComboBox<>();
        pass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(712, 499));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        id.setBackground(new java.awt.Color(0, 102, 255));
        id.setMinimumSize(new java.awt.Dimension(737, 410));
        id.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First name:");
        id.add(jLabel1);
        jLabel1.setBounds(30, 54, 85, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last name:");
        id.add(jLabel2);
        jLabel2.setBounds(30, 90, 85, 29);

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        id.add(fname);
        fname.setBounds(120, 60, 156, 20);
        id.add(lname);
        lname.setBounds(120, 90, 156, 24);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        id.add(jLabel4);
        jLabel4.setBounds(30, 130, 85, 22);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        id.add(email);
        email.setBounds(120, 120, 156, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username:");
        id.add(jLabel5);
        jLabel5.setBounds(30, 158, 85, 25);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password:");
        id.add(jLabel6);
        jLabel6.setBounds(30, 190, 85, 25);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Type:");
        id.add(jLabel7);
        jLabel7.setBounds(30, 215, 85, 25);
        id.add(username);
        username.setBounds(120, 150, 156, 25);

        acctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        acctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctypeActionPerformed(evt);
            }
        });
        id.add(acctype);
        acctype.setBounds(119, 215, 156, 25);
        id.add(pass);
        pass.setBounds(120, 180, 156, 23);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");
        id.add(jLabel8);
        jLabel8.setBounds(30, 26, 85, 17);

        jTextField1.setEnabled(false);
        id.add(jTextField1);
        jTextField1.setBounds(119, 23, 156, 20);

        label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Label");
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMouseClicked(evt);
            }
        });
        id.add(label);
        label.setBounds(120, 280, 67, 25);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");
        id.add(jLabel9);
        jLabel9.setBounds(30, 246, 85, 23);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        id.add(status);
        status.setBounds(119, 248, 156, 23);

        jPanel1.add(id);
        id.setBounds(0, 70, 740, 350);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ADD USER!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 20, 110, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shet.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(240, 10, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-6, -3, 740, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void acctypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acctypeActionPerformed

    private void labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseClicked
        
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || username.getText().isEmpty() || pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pass.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Password must be 8 characters and above!");
            pass.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
        
        
        }else{
        
        if(action.equals("Add")){
           dbConnector dbc = new dbConnector();
            boolean result = dbc.insertData("INSERT INTO tbl_user ("
                    + "user_fname,"
                    + "user_lname,"
                    + "user_email,"
                    + "user_username,"
                    + "user_password,"
                    + "user_type,"
                    + "user_status) VALUES ("
                    + "'"+fname.getText()+"',"
                    + "'"+lname.getText()+"',"
                    + "'"+email.getText()+"',"
                    + "'"+username.getText()+"',"
                    + "'"+pass.getText()+"',"
                    + "'"+acctype.getSelectedItem()+"',"
                    + "'"+status.getSelectedItem()+"')");  
            
            if(true){
                JOptionPane.showMessageDialog(null, "Successfully Save!");
                close();
            }else{
                System.out.println("Saving Data Failed!");
            }
            
        }
        }
            
        
            
        
        
        
        
        
    }//GEN-LAST:event_labelMouseClicked

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
            java.util.logging.Logger.getLogger(adminApplicants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminApplicants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminApplicants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminApplicants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminApplicants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acctype;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JPanel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel label;
    private javax.swing.JTextField lname;
    public javax.swing.JPasswordField pass;
    private javax.swing.JComboBox<String> status;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
