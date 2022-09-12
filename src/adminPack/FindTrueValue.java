package adminPack;
import javax.swing.JOptionPane;

public class FindTrueValue extends javax.swing.JFrame {
    int regid;
    public FindTrueValue(int regid) {
        initComponents();
        this.setSize(660, 570);
        this.setBounds(330, 25, 660, 570);
        this.setTitle("True Valuation");
        this.regid = regid;
        usdYearTxt.setText(""+(2020 - regid));
    }

    FindTrueValue() {
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kmTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usdYearTxt = new javax.swing.JTextField();
        calculateBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter Actual Cost of Car");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 150, 220, 39);

        priceTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(priceTxt);
        priceTxt.setBounds(360, 150, 180, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Kilo Meters Driven");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 200, 220, 39);

        kmTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(kmTxt);
        kmTxt.setBounds(360, 210, 180, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Used years");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 260, 220, 39);

        usdYearTxt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(usdYearTxt);
        usdYearTxt.setBounds(360, 260, 180, 30);

        calculateBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        calculateBtn.setText("CALCULATE");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(calculateBtn);
        calculateBtn.setBounds(340, 460, 120, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/true valuation pic.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-160, -70, 1390, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
         int newPrice = 0;
        int newPriceKm = 0;
        int price = Integer.parseInt(priceTxt.getText());
        int temp = price;
        int usdYear = Integer.parseInt(usdYearTxt.getText().trim());
        int kmDriven = Integer.parseInt(kmTxt.getText());
        if(kmDriven < 50000)
            newPriceKm = (int)(price * 0.02); // 980000
        else if(kmDriven < 100000)
            newPriceKm = (int)(price * 0.04);
        else 
            newPriceKm = (int)(price * 0.06);
        if(usdYear > 0 && usdYear <= 15)
        {
            if(usdYear == 1)
                    newPrice = (int)(price - (price * 0.1));
            else if(usdYear == 2)
            {
                 newPrice = (int)(price - (price * 0.1));
                 newPrice = (int)(newPrice - (newPrice * 0.2)); // 720000
            }
            else if(usdYear == 3 || usdYear == 4)
            {
                 newPrice = (int)(price - (price * 0.1));
                 newPrice = (int)(newPrice - (newPrice * 0.2)); // 720000
                 newPrice = (int)(newPrice - (newPrice * 0.3)); // 504000
            }
            else 
            {
                 newPrice = (int)(price - (price * 0.1));
                 newPrice = (int)(newPrice - (newPrice * 0.2)); // 720000
                 newPrice = (int)(newPrice - (newPrice * 0.3)); // 504000
                 newPrice = (int)(newPrice - (newPrice * 0.4)); // 504000
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Year must be in range of 0-15");
        int finalPrice = newPrice - newPriceKm;
        
        JOptionPane.showMessageDialog(this, "True value will display in the next form\nin the Actual Price  Text Field.");
        this.setVisible(false);
        new carregsale(finalPrice).setVisible(true);
    }//GEN-LAST:event_calculateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FindTrueValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindTrueValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindTrueValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindTrueValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindTrueValue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kmTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField usdYearTxt;
    // End of variables declaration//GEN-END:variables
}
