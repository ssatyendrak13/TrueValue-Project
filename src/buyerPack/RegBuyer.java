package buyerPack;

import adminPack.AdminControl;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegBuyer extends javax.swing.JFrame {

    public RegBuyer() {
        initComponents();
        this.setSize( 620, 590);
        this.setBounds(380, 60, 620, 590);
        this.setTitle("Register Buyer");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        cityTxt = new javax.swing.JTextField();
        stateTxt = new javax.swing.JTextField();
        countryTxt = new javax.swing.JTextField();
        mobileTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(idTxt);
        idTxt.setBounds(280, 110, 220, 30);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 510, 120, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mobile");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 460, 100, 30);
        getContentPane().add(emailTxt);
        emailTxt.setBounds(280, 210, 220, 30);
        getContentPane().add(addressTxt);
        addressTxt.setBounds(280, 260, 220, 30);

        cityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cityTxt);
        cityTxt.setBounds(280, 310, 220, 30);

        stateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateTxtActionPerformed(evt);
            }
        });
        getContentPane().add(stateTxt);
        stateTxt.setBounds(280, 360, 220, 30);
        getContentPane().add(countryTxt);
        countryTxt.setBounds(280, 410, 220, 30);
        getContentPane().add(mobileTxt);
        mobileTxt.setBounds(280, 460, 220, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 110, 100, 40);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 160, 100, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Email");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 210, 100, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 260, 100, 30);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("City");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 310, 100, 24);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("State");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(80, 360, 100, 20);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Country");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(80, 410, 100, 30);
        getContentPane().add(nameTxt);
        nameTxt.setBounds(280, 160, 220, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register buyere.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-40, -10, 680, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/truevaluedb","root", "");
         if(con!=null)
           {
               String query="INSERT INTO buyerreg VALUES(?,?,?,?,?,?,?,?)";
               PreparedStatement pst=con.prepareStatement(query);
               int id = Integer.parseInt(idTxt.getText().trim()); 
               pst.setInt(1,id);
               pst.setString(2, nameTxt.getText().trim());
               pst.setString(3, emailTxt.getText().trim());
               pst.setString(4, addressTxt.getText().trim());
               pst.setString(5, cityTxt.getText().trim());
               pst.setString(6, stateTxt.getText().trim());
               pst.setString(7, countryTxt.getText().trim());
               pst.setString(8, mobileTxt.getText().trim());
               
               int count=pst.executeUpdate();
               if(count>0)
               { JOptionPane.showMessageDialog(this,nameTxt.getText()+" is registered as a buyer");}
               else{
                   JOptionPane.showMessageDialog(this, "failed to register "+nameTxt.getText()+" as buyer:(" );
               }
           }
        con.close();
        } catch (Exception e) {
        }
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTxtActionPerformed
    }//GEN-LAST:event_cityTxtActionPerformed

    private void stateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateTxtActionPerformed
    }//GEN-LAST:event_stateTxtActionPerformed

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
            java.util.logging.Logger.getLogger(RegBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegBuyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JTextField countryTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField stateTxt;
    // End of variables declaration//GEN-END:variables

}
