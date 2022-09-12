package adminPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class carregsale extends javax.swing.JFrame {
    public carregsale() {
        initComponents();
        this.setSize(615, 640);
        this.setBounds(400, 30, 615, 640);
        this.setTitle("Car Sell Registration");
        sellBtn.setVisible(false);
        sellerIdTxt.setVisible(false);
        sellerIdLbl.setVisible(false);
        carNoTxt.setVisible(false);
        carNoLbl.setVisible(false);
        regNoTxt.setVisible(false);
        regNoLbl.setVisible(false);
        minPriceLbl.setVisible(false);
        maxPriceLbl.setVisible(false);
        actualPriceLbl.setVisible(false);
        minPriceTxt.setVisible(false);
        maxPriceTxt.setVisible(false);
        actualPriceTxt.setVisible(false);
       
    }
    int finalPrice;
    carregsale(int finalPrice) {
        initComponents();
        this.setSize(615, 640);
        this.setBounds(400, 30, 615, 640);
        this.setTitle("Car Sell Registration");
       
        sellBtn.setVisible(true);
        sellerIdTxt.setVisible(true);
        sellerIdLbl.setVisible(true);
        carNoTxt.setVisible(true);
        carNoLbl.setVisible(true);
        regNoTxt.setVisible(true);
        regNoLbl.setVisible(true);
        minPriceLbl.setVisible(true);
        maxPriceLbl.setVisible(true);
        actualPriceLbl.setVisible(true);
        minPriceTxt.setVisible(true);
        maxPriceTxt.setVisible(true);
        actualPriceTxt.setVisible(true);
        
        this.finalPrice = finalPrice;
        String str1 = Integer.toString(finalPrice);
        actualPriceTxt.setText(str1);
        maxPriceTxt.setText(str1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLbl = new javax.swing.JLabel();
        regLbl = new javax.swing.JLabel();
        regTxt = new javax.swing.JTextField();
        companyLbl = new javax.swing.JLabel();
        companyTxt = new javax.swing.JTextField();
        modelLbl = new javax.swing.JLabel();
        modelTxt = new javax.swing.JTextField();
        varientLbl = new javax.swing.JLabel();
        varientTxt = new javax.swing.JTextField();
        fuelLbl = new javax.swing.JLabel();
        sellerIdLbl = new javax.swing.JLabel();
        sellerIdTxt = new javax.swing.JTextField();
        carNoLbl = new javax.swing.JLabel();
        carNoTxt = new javax.swing.JTextField();
        regNoLbl = new javax.swing.JLabel();
        regNoTxt = new javax.swing.JTextField();
        minPriceLbl = new javax.swing.JLabel();
        minPriceTxt = new javax.swing.JTextField();
        maxPriceLbl = new javax.swing.JLabel();
        maxPriceTxt = new javax.swing.JTextField();
        trueValueBtn = new javax.swing.JButton();
        actualPriceTxt = new javax.swing.JTextField();
        actualPriceLbl = new javax.swing.JLabel();
        fuelTypeList = new javax.swing.JComboBox<>();
        sellBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        mainLbl.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        mainLbl.setForeground(new java.awt.Color(255, 45, 30));
        mainLbl.setText("CAR SELLER REGISTRATION");
        getContentPane().add(mainLbl);
        mainLbl.setBounds(140, 10, 370, 50);

        regLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        regLbl.setText("Reg Year");
        getContentPane().add(regLbl);
        regLbl.setBounds(50, 80, 110, 24);

        regTxt.setToolTipText("When you've purchased this Car");
        regTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regTxtActionPerformed(evt);
            }
        });
        getContentPane().add(regTxt);
        regTxt.setBounds(180, 80, 190, 30);

        companyLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        companyLbl.setText("Company");
        getContentPane().add(companyLbl);
        companyLbl.setBounds(50, 120, 110, 24);

        companyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyTxtActionPerformed(evt);
            }
        });
        getContentPane().add(companyTxt);
        companyTxt.setBounds(180, 120, 190, 30);

        modelLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        modelLbl.setText("Model");
        getContentPane().add(modelLbl);
        modelLbl.setBounds(50, 160, 110, 24);

        modelTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTxtActionPerformed(evt);
            }
        });
        getContentPane().add(modelTxt);
        modelTxt.setBounds(180, 160, 190, 30);

        varientLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        varientLbl.setText("Varient");
        getContentPane().add(varientLbl);
        varientLbl.setBounds(50, 200, 110, 24);

        varientTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varientTxtActionPerformed(evt);
            }
        });
        getContentPane().add(varientTxt);
        varientTxt.setBounds(180, 200, 190, 30);

        fuelLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fuelLbl.setText("Fuel Type");
        getContentPane().add(fuelLbl);
        fuelLbl.setBounds(50, 240, 110, 24);

        sellerIdLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sellerIdLbl.setText("Seller ID");
        getContentPane().add(sellerIdLbl);
        sellerIdLbl.setBounds(50, 280, 110, 24);

        sellerIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerIdTxtActionPerformed(evt);
            }
        });
        getContentPane().add(sellerIdTxt);
        sellerIdTxt.setBounds(180, 280, 190, 30);

        carNoLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        carNoLbl.setText("Car Number");
        getContentPane().add(carNoLbl);
        carNoLbl.setBounds(50, 320, 110, 24);

        carNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carNoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(carNoTxt);
        carNoTxt.setBounds(180, 320, 190, 30);

        regNoLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        regNoLbl.setText("Reg Number");
        getContentPane().add(regNoLbl);
        regNoLbl.setBounds(50, 360, 110, 24);

        regNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(regNoTxt);
        regNoTxt.setBounds(180, 360, 190, 30);

        minPriceLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        minPriceLbl.setText("Min Price");
        getContentPane().add(minPriceLbl);
        minPriceLbl.setBounds(50, 400, 110, 24);

        minPriceTxt.setToolTipText("Enable after calculating true value");
        minPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minPriceTxtActionPerformed(evt);
            }
        });
        getContentPane().add(minPriceTxt);
        minPriceTxt.setBounds(180, 400, 190, 30);

        maxPriceLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        maxPriceLbl.setText("Max Price");
        getContentPane().add(maxPriceLbl);
        maxPriceLbl.setBounds(50, 440, 110, 24);

        maxPriceTxt.setToolTipText("Enable after calculating true value");
        maxPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxPriceTxtActionPerformed(evt);
            }
        });
        getContentPane().add(maxPriceTxt);
        maxPriceTxt.setBounds(180, 440, 190, 30);

        trueValueBtn.setBackground(new java.awt.Color(204, 204, 255));
        trueValueBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        trueValueBtn.setForeground(new java.awt.Color(51, 51, 51));
        trueValueBtn.setText("True Value");
        trueValueBtn.setBorder(null);
        trueValueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trueValueBtnActionPerformed(evt);
            }
        });
        getContentPane().add(trueValueBtn);
        trueValueBtn.setBounds(450, 100, 110, 40);

        actualPriceTxt.setToolTipText("Enable after calculating true value");
        getContentPane().add(actualPriceTxt);
        actualPriceTxt.setBounds(180, 480, 190, 30);

        actualPriceLbl.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        actualPriceLbl.setText("Actual Price");
        getContentPane().add(actualPriceLbl);
        actualPriceLbl.setBounds(50, 480, 110, 21);

        fuelTypeList.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fuelTypeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petrol", "Diesel" }));
        fuelTypeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelTypeListActionPerformed(evt);
            }
        });
        getContentPane().add(fuelTypeList);
        fuelTypeList.setBounds(180, 240, 190, 30);

        sellBtn.setBackground(new java.awt.Color(204, 204, 255));
        sellBtn.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        sellBtn.setForeground(new java.awt.Color(51, 51, 51));
        sellBtn.setText("Sell Car");
        sellBtn.setBorder(null);
        sellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sellBtn);
        sellBtn.setBounds(450, 200, 110, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sale car1.1.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(170, 260, 430, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regTxtActionPerformed

    private void companyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyTxtActionPerformed

    private void modelTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelTxtActionPerformed

    private void varientTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varientTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varientTxtActionPerformed

    private void sellerIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerIdTxtActionPerformed

    private void carNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carNoTxtActionPerformed

    private void regNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNoTxtActionPerformed

    private void minPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minPriceTxtActionPerformed

    private void maxPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxPriceTxtActionPerformed

    private void trueValueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trueValueBtnActionPerformed
         JOptionPane.showMessageDialog(this, "You have to Enter Details again after calcuating True Value\nwith the minimum price you want");
         int regid = Integer.parseInt(regTxt.getText().trim()); 
        new FindTrueValue(regid).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_trueValueBtnActionPerformed

    private void fuelTypeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelTypeListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuelTypeListActionPerformed

    private void sellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellBtnActionPerformed
        try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/truevaluedb","root","");
            if(con!=null)
            {
//            (regyear,company, model, varient, fueltype, sellerid, carnumber, regnumber, minprice, maxprice)
                  String fuelType = fuelTypeList.getSelectedItem().toString();
               String query="INSERT INTO carvalue VALUES(?,?,?,?,?,?,?,?,?,?)";
               PreparedStatement pst=con.prepareStatement(query);
               pst.setString(1,regTxt.getText().trim());
               pst.setString(2, companyTxt.getText());
               pst.setString(3, modelTxt.getText());
               pst.setString(4,varientTxt.getText());
               pst.setString(5, fuelType);
               pst.setString(6, sellerIdTxt.getText());
               pst.setString(7, carNoTxt.getText().trim());
               pst.setString(8, regNoTxt.getText());
               pst.setString(9, minPriceTxt.getText());
               pst.setString(10, maxPriceTxt.getText());

         
               int status = pst.executeUpdate();
               if(status != 0)
                    JOptionPane.showMessageDialog(this,modelTxt.getText()+" is added for sale.");
               else
                   JOptionPane.showMessageDialog(this, "failed to add "+modelTxt.getText()+" for sale :(" );
           }
        con.close();
        
        } catch (Exception e) {
        }
            this.setVisible(false);

    }//GEN-LAST:event_sellBtnActionPerformed

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
            java.util.logging.Logger.getLogger(carregsale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carregsale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carregsale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carregsale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carregsale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualPriceLbl;
    private javax.swing.JTextField actualPriceTxt;
    private javax.swing.JLabel carNoLbl;
    private javax.swing.JTextField carNoTxt;
    private javax.swing.JLabel companyLbl;
    private javax.swing.JTextField companyTxt;
    private javax.swing.JLabel fuelLbl;
    private javax.swing.JComboBox<String> fuelTypeList;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel mainLbl;
    private javax.swing.JLabel maxPriceLbl;
    private javax.swing.JTextField maxPriceTxt;
    private javax.swing.JLabel minPriceLbl;
    private javax.swing.JTextField minPriceTxt;
    private javax.swing.JLabel modelLbl;
    private javax.swing.JTextField modelTxt;
    private javax.swing.JLabel regLbl;
    private javax.swing.JLabel regNoLbl;
    private javax.swing.JTextField regNoTxt;
    private javax.swing.JTextField regTxt;
    private javax.swing.JButton sellBtn;
    private javax.swing.JLabel sellerIdLbl;
    private javax.swing.JTextField sellerIdTxt;
    private javax.swing.JButton trueValueBtn;
    private javax.swing.JLabel varientLbl;
    private javax.swing.JTextField varientTxt;
    // End of variables declaration//GEN-END:variables
}