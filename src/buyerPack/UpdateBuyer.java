package buyerPack;

import adminPack.AdminControl;
import java.sql.*;
import javax.swing.JOptionPane;
public class UpdateBuyer extends javax.swing.JFrame {

    public UpdateBuyer() {
        initComponents();
       
        this.setSize( 571, 601);
        this.setBounds(400, 55, 571, 601);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        countryTxt = new javax.swing.JTextField();
        stateTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mobileTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        emailTxt.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        getContentPane().add(emailTxt);
        emailTxt.setBounds(220, 220, 270, 30);

        jButton1.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 510, 140, 50);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 220, 130, 20);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter Id ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 130, 130, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Enter Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 170, 130, 20);

        idTxt.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        getContentPane().add(idTxt);
        idTxt.setBounds(220, 130, 270, 30);

        nameTxt.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        getContentPane().add(nameTxt);
        nameTxt.setBounds(220, 170, 270, 30);

        addressTxt.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        getContentPane().add(addressTxt);
        addressTxt.setBounds(220, 270, 270, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Enter address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 270, 130, 20);

        cityTxt.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        getContentPane().add(cityTxt);
        cityTxt.setBounds(220, 320, 270, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Enter City");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 320, 130, 20);

        countryTxt.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        getContentPane().add(countryTxt);
        countryTxt.setBounds(220, 410, 270, 30);

        stateTxt.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        getContentPane().add(stateTxt);
        stateTxt.setBounds(220, 370, 270, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Enter country");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 410, 130, 20);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Enter State");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 370, 130, 20);

        mobileTxt.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        getContentPane().add(mobileTxt);
        mobileTxt.setBounds(220, 460, 270, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Enter Mobile");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 460, 130, 20);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Enter ID(of Buyer you want to update), and new details");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 100, 430, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update buyer new.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 660, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/truevaluedb","root","");
           
            String name = nameTxt.getText();
           
            String query = "UPDATE buyerreg SET name=?, email=?, address=?, city=?, state=?, country=?, mobile=? WHERE id=?";
            PreparedStatement pst=con.prepareStatement(query);
//            
            pst.setString(1, nameTxt.getText().trim());
            pst.setString(2, emailTxt.getText().trim());
            pst.setString(3, addressTxt.getText().trim());
            pst.setString(4, cityTxt.getText().trim());
            pst.setString(5, stateTxt.getText().trim());
            pst.setString(6, countryTxt.getText().trim());
            pst.setString(7, mobileTxt.getText().trim());
            int id = Integer.parseInt(idTxt.getText().trim()); 
            pst.setInt(8,id);
          
            int status=pst.executeUpdate();
            if(status==1)
                JOptionPane.showMessageDialog(this, "Buyer Details Successfully Update ");
            
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
            java.util.logging.Logger.getLogger(UpdateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBuyer().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField stateTxt;
    // End of variables declaration//GEN-END:variables
}
