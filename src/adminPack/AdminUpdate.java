package adminPack;

import java.sql.*;
import javax.swing.JOptionPane;

public class AdminUpdate extends javax.swing.JFrame {

    public AdminUpdate() {
        initComponents();
        this.setTitle("Update Admin Details Window");
        this.setSize(490, 480);
        this.setBounds(400, 120, 490, 480);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        idTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        nameTxt.setToolTipText("Enter name for Updation");
        getContentPane().add(nameTxt);
        nameTxt.setBounds(120, 210, 190, 40);

        passTxt.setToolTipText("Enter password for Updation");
        getContentPane().add(passTxt);
        passTxt.setBounds(120, 270, 190, 40);

        jButton1.setBackground(new java.awt.Color(89, 164, 243));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(303, 335, 110, 40);
        getContentPane().add(idTxt);
        idTxt.setBounds(120, 150, 190, 40);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 160, 40, 15);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 220, 60, 15);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 280, 70, 15);

        jLabel5.setText("Enter ID(of admin you want to update), and new Name & Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 400, 400, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update admin.PNG"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 470, 442);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/truevaluedb","root","");
            String id = idTxt.getText();
            String name = nameTxt.getText();
            String pass = new String(passTxt.getPassword());
            String query = "UPDATE adminlogin SET username=?, password=? WHERE id=?";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,name);
            pst.setString(2,pass);
            pst.setString(3,id);
           
            int status=pst.executeUpdate();
            if(status==1)
            {
                JOptionPane.showMessageDialog(this, "Admin Details Successfully Update ");
            }
            else
            JOptionPane.showMessageDialog(this, "Admin Details Updation Fails");
          } catch (Exception e) {
        }
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField passTxt;
    // End of variables declaration//GEN-END:variables
}
