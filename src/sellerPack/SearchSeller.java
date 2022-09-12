package sellerPack;

import adminPack.AdminControl;
import java.sql.*;
import javax.swing.JOptionPane;
public class SearchSeller extends javax.swing.JFrame {

    /**
     * Creates new form SearchSeller
     */
    public SearchSeller() {
        initComponents();
        this.setSize(500, 500);
        this.setBounds(400, 100, 500, 500);
        this.setTitle("Search Seller");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter Name ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 180, 120, 30);

        nameTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nameTxt.setToolTipText("Enter name to search seller");
        getContentPane().add(nameTxt);
        nameTxt.setBounds(250, 180, 130, 30);

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 350, 110, 40);

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("SEARCH SELLER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 40, 370, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search icon.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 140, 210, 200);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search seller.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-730, -130, 1940, 930);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/truevaluedb","root", "");
         if(con!=null)
           {
               PreparedStatement pst=con.prepareStatement("SELECT * FROM sellerreg WHERE name = ?");
               pst.setString(1, nameTxt.getText().trim());
//               int count=pst.executeUpdate();
               ResultSet rst = pst.executeQuery();
               if(rst.next())
                    JOptionPane.showMessageDialog(this,nameTxt.getText()+" Seller Found");
               else
                   JOptionPane.showMessageDialog(this, nameTxt.getText()+" is not Found as a Seller:(" );
           }
        con.close();
        
        } catch (Exception e) {
        }
        
          //  new AdminControl().setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchSeller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameTxt;
    // End of variables declaration//GEN-END:variables
}
