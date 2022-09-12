package adminPack;
import java.sql.*;
import javax.swing.JOptionPane;

public class AddCar extends javax.swing.JFrame {
    public AddCar() {
        initComponents();
        this.setSize(467, 460);
        this.setBounds(400, 120, 467, 460);
        this.setTitle("Add Car Window");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        modelTxt = new javax.swing.JTextField();
        varientTxt = new javax.swing.JTextField();
        addCarBtn = new javax.swing.JButton();
        fuelTypeList = new javax.swing.JComboBox<>();
        regYearList = new javax.swing.JComboBox<>();
        regYearLbl1 = new javax.swing.JLabel();
        companyTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("DFPOP1-W9", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("ADD NEW CAR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 30, 240, 48);

        priceLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        priceLbl.setText("Price");
        getContentPane().add(priceLbl);
        priceLbl.setBounds(60, 360, 80, 16);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Company");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 150, 70, 16);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Model");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 210, 50, 16);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Varient");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 260, 70, 16);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Fuel Type");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 310, 60, 16);
        getContentPane().add(priceTxt);
        priceTxt.setBounds(150, 350, 130, 30);
        getContentPane().add(modelTxt);
        modelTxt.setBounds(150, 200, 130, 30);
        getContentPane().add(varientTxt);
        varientTxt.setBounds(150, 250, 130, 30);

        addCarBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addCarBtn.setText("Add Car");
        addCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addCarBtn);
        addCarBtn.setBounds(310, 350, 120, 30);

        fuelTypeList.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fuelTypeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petrol", "Diesel" }));
        fuelTypeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelTypeListActionPerformed(evt);
            }
        });
        getContentPane().add(fuelTypeList);
        fuelTypeList.setBounds(150, 300, 130, 30);

        regYearList.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        regYearList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));
        regYearList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regYearListActionPerformed(evt);
            }
        });
        getContentPane().add(regYearList);
        regYearList.setBounds(150, 104, 130, 30);

        regYearLbl1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        regYearLbl1.setText("Reg Year");
        getContentPane().add(regYearLbl1);
        regYearLbl1.setBounds(40, 110, 80, 16);
        getContentPane().add(companyTxt);
        companyTxt.setBounds(150, 150, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car icon.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 120, 120, 120);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 210, 40, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add car bg.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 460, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarBtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/truevaluedb","root", "");
         if(con!=null)
           {
                String reg = regYearList.getSelectedItem().toString();
               String company = companyTxt.getText();
               String model = modelTxt.getText();
               String varient = varientTxt.getText();
                String fuelType = fuelTypeList.getSelectedItem().toString();
               String price = priceTxt.getText().trim();
               
               String query="INSERT INTO cardetail VALUES(?,?,?,?,?,?)";
               PreparedStatement pst=con.prepareStatement(query);
              
               pst.setString(1,reg);
               pst.setString(2, company);
               pst.setString(3, model);
               pst.setString(4, varient);
               pst.setString(5, fuelType);
               pst.setString(6, price);
              
               int count=pst.executeUpdate();
               if(count>0)
                    JOptionPane.showMessageDialog(this,modelTxt.getText()+" is added sucessfully");
               else
                   JOptionPane.showMessageDialog(this, "failed to add car  "+modelTxt.getText() );
           }
        con.close();
        } catch (Exception e) {
        }
            this.setVisible(false);
    }//GEN-LAST:event_addCarBtnActionPerformed

    private void fuelTypeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelTypeListActionPerformed
         String country[]={"India","Aus","U.S.A","England","Newzealand"};   
        // TODO add your handling code here:
    }//GEN-LAST:event_fuelTypeListActionPerformed

    private void regYearListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regYearListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regYearListActionPerformed

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
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarBtn;
    private javax.swing.JTextField companyTxt;
    private javax.swing.JComboBox<String> fuelTypeList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField modelTxt;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JLabel regYearLbl1;
    private javax.swing.JComboBox<String> regYearList;
    private javax.swing.JTextField varientTxt;
    // End of variables declaration//GEN-END:variables
}
