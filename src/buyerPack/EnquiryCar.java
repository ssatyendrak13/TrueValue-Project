package buyerPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EnquiryCar extends javax.swing.JFrame {

    public EnquiryCar() {
        initComponents();
        this.setSize(540, 525);
        this.setBounds(400, 60, 540, 525);
        this.setTitle("Buyer's Enquiry");
        sellersTable.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        yearTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sellersTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ENQUIRY FOR CAR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 30, 400, 42);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Enter Year of Car you want");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 110, 270, 50);

        yearTxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(yearTxt);
        yearTxt.setBounds(340, 120, 120, 30);

        searchBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn);
        searchBtn.setBounds(340, 220, 120, 40);

        sellersTable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sellersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Company", "Model", "Varient", "Fuel Type", "Price"
            }
        ));
        sellersTable.setDragEnabled(true);
        sellersTable.setEnabled(false);
        jScrollPane2.setViewportView(sellersTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 340, 490, 120);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enquiry final.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 160, 180, 170);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enquiry bg.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 620, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
         try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/truevaluedb","root", "");
           DefaultTableModel md=(DefaultTableModel)sellersTable.getModel();
            md.setRowCount(0);
           if(con != null)
           {
               PreparedStatement pst=con.prepareStatement("SELECT * FROM carvalue WHERE regyear=?");
               pst.setString(1,yearTxt.getText().trim());
//               int count = pst.executeUpdate();  don't know why this line is creating error
              
               ResultSet rst = pst.executeQuery();
//               JOptionPane.showMessageDialog(this,rst.next());
//               System.out.println(rst.next());
               if(rst.next())
               {
                    JOptionPane.showMessageDialog(this,"Cars Found");
                    JOptionPane.showMessageDialog(this,"Press OK to see details in table");
                    
                    sellersTable.setVisible(true);
                    
                    String companyName=rst.getString("company");
                    String model=rst.getString("model");
                    String varient=rst.getString("varient");
                    String fueltype=rst.getString("fueltype");
                    String price=rst.getString("maxprice");
                    md.addRow(new Object[]{companyName,model,varient,fueltype,price});
                    
               }
               else
                   JOptionPane.showMessageDialog(this, "No car is found for that year:(" );
               
           }
         else
             JOptionPane.showMessageDialog(this,"Connection Not Done");
        con.close();
        
        } catch (Exception e) {
        }
        
          //  new AdminControl().setVisible(true);
         //   this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EnquiryCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnquiryCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnquiryCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnquiryCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnquiryCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable sellersTable;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables
}
