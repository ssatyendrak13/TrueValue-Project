package buyerPack;

import java.sql.*;
import javax.swing.JOptionPane;

public class SearchBuyer extends javax.swing.JFrame {

    public SearchBuyer() {
        initComponents();
        this.setSize(500, 500);
        this.setBounds(400, 100, 500, 500);
        this.setTitle("Buyer Search");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchBuyerBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setText("Enter Name ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 190, 150, 30);

        nameTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nameTxt.setToolTipText("Enter name to search seller");
        getContentPane().add(nameTxt);
        nameTxt.setBounds(260, 190, 130, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("SEARCH BUYER");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 40, 370, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search icon.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 130, 240, 240);

        searchBuyerBtn.setBackground(new java.awt.Color(204, 204, 255));
        searchBuyerBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        searchBuyerBtn.setText("SEARCH");
        searchBuyerBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchBuyerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBuyerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBuyerBtn);
        searchBuyerBtn.setBounds(100, 340, 110, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search buyer.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBuyerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBuyerBtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/truevaluedb","root", "");
            if(con!=null)
            {
                PreparedStatement pst=con.prepareStatement("SELECT * FROM buyerreg WHERE name = ?");
                pst.setString(1, nameTxt.getText().trim());
                //int count=pst.executeUpdate();
                ResultSet rst = pst.executeQuery();
                if(rst.next())
                JOptionPane.showMessageDialog(this,nameTxt.getText()+" is Found as a Buyer.");
                else
                JOptionPane.showMessageDialog(this, nameTxt.getText()+" is not Found as a Buyer:(" );
            }
            con.close();
        } catch (Exception e) {
        }
        //      new AdminControl().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchBuyerBtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(SearchBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBuyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton searchBuyerBtn;
    // End of variables declaration//GEN-END:variables
}
