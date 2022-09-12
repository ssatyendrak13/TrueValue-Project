package adminPack;

import buyerPack.EnquiryCar;
import buyerPack.RegBuyer;
import buyerPack.SearchBuyer;
import buyerPack.UpdateBuyer;
import sellerPack.RegSeller;
import sellerPack.SearchSeller;
import sellerPack.UpdateSeller;

public class AdminControl extends javax.swing.JFrame {

    public AdminControl() {
        initComponents();
        this.setSize(1920, 1009);
        this.setBounds(-10, 0, 1920, 1009);
        this.setTitle("Admin Control Panel");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        adminControlMenuBar = new javax.swing.JMenuBar();
        adminMenu = new javax.swing.JMenu();
        updateAdminMenu = new javax.swing.JMenuItem();
        registerAdminMenu = new javax.swing.JMenuItem();
        addCarMenu = new javax.swing.JMenuItem();
        buyerMenu = new javax.swing.JMenu();
        updateBuyerMenu = new javax.swing.JMenuItem();
        registerBuyerMenu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        sellerMenu = new javax.swing.JMenu();
        updateSellerMenu = new javax.swing.JMenuItem();
        registerSellerMenu = new javax.swing.JMenuItem();
        aboutUsMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenuItem();
        searchMenu = new javax.swing.JMenu();
        searchSellerMenu = new javax.swing.JMenuItem();
        searchBuyerMenu = new javax.swing.JMenuItem();
        carValueMenu = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/control final final1.png"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, -10, 640, 640);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 102));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1410, 740);

        adminMenu.setText("Admin");

        updateAdminMenu.setText("updateinfo");
        updateAdminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAdminMenuActionPerformed(evt);
            }
        });
        adminMenu.add(updateAdminMenu);

        registerAdminMenu.setText("register now");
        registerAdminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAdminMenuActionPerformed(evt);
            }
        });
        adminMenu.add(registerAdminMenu);

        addCarMenu.setText("Add car");
        addCarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarMenuActionPerformed(evt);
            }
        });
        adminMenu.add(addCarMenu);

        adminControlMenuBar.add(adminMenu);

        buyerMenu.setText("Buyer");

        updateBuyerMenu.setText("update info");
        updateBuyerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBuyerMenuActionPerformed(evt);
            }
        });
        buyerMenu.add(updateBuyerMenu);

        registerBuyerMenu.setText("register new");
        registerBuyerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBuyerMenuActionPerformed(evt);
            }
        });
        buyerMenu.add(registerBuyerMenu);

        jMenuItem1.setText("car enquiry");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        buyerMenu.add(jMenuItem1);

        adminControlMenuBar.add(buyerMenu);

        sellerMenu.setText("Seller");

        updateSellerMenu.setText("update info");
        updateSellerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSellerMenuActionPerformed(evt);
            }
        });
        sellerMenu.add(updateSellerMenu);

        registerSellerMenu.setText("register new");
        registerSellerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerSellerMenuActionPerformed(evt);
            }
        });
        sellerMenu.add(registerSellerMenu);

        adminControlMenuBar.add(sellerMenu);

        aboutUsMenu.setText("About Us");

        aboutMenu.setText("Who am I?");
        aboutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuActionPerformed(evt);
            }
        });
        aboutUsMenu.add(aboutMenu);

        adminControlMenuBar.add(aboutUsMenu);

        searchMenu.setText("Search");

        searchSellerMenu.setText("Search seller");
        searchSellerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSellerMenuActionPerformed(evt);
            }
        });
        searchMenu.add(searchSellerMenu);

        searchBuyerMenu.setText("Search buyer");
        searchBuyerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBuyerMenuActionPerformed(evt);
            }
        });
        searchMenu.add(searchBuyerMenu);

        adminControlMenuBar.add(searchMenu);

        carValueMenu.setText("Car value");

        jMenuItem11.setText("car reg for sale ");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        carValueMenu.add(jMenuItem11);

        jMenuItem12.setText("find true value");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        carValueMenu.add(jMenuItem12);

        adminControlMenuBar.add(carValueMenu);

        setJMenuBar(adminControlMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchSellerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSellerMenuActionPerformed
        new SearchSeller().setVisible(true);
    }//GEN-LAST:event_searchSellerMenuActionPerformed

    private void registerSellerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerSellerMenuActionPerformed
        new RegSeller().setVisible(true);
    }//GEN-LAST:event_registerSellerMenuActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
            new FindTrueValue().setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void updateAdminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAdminMenuActionPerformed
            new AdminUpdate().setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_updateAdminMenuActionPerformed

    private void registerAdminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAdminMenuActionPerformed
            new AdminRegister().setVisible(true);
     
        // TODO add your handling code here:
    }//GEN-LAST:event_registerAdminMenuActionPerformed

    private void addCarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarMenuActionPerformed
        new AddCar().setVisible(true);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_addCarMenuActionPerformed

    private void updateBuyerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBuyerMenuActionPerformed
            new UpdateBuyer().setVisible(true);
         
// TODO add your handling code here:
    }//GEN-LAST:event_updateBuyerMenuActionPerformed

    private void registerBuyerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBuyerMenuActionPerformed
            new RegBuyer().setVisible(true);
    }//GEN-LAST:event_registerBuyerMenuActionPerformed

    private void updateSellerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSellerMenuActionPerformed
            new UpdateSeller().setVisible(true);
    }//GEN-LAST:event_updateSellerMenuActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
            new carregsale().setVisible(true);
            
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void aboutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuActionPerformed
            new AboutUs().setVisible(true);
    }//GEN-LAST:event_aboutMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new EnquiryCar().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void searchBuyerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBuyerMenuActionPerformed
           new SearchBuyer().setVisible(true);
    }//GEN-LAST:event_searchBuyerMenuActionPerformed

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
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenu;
    private javax.swing.JMenu aboutUsMenu;
    private javax.swing.JMenuItem addCarMenu;
    private javax.swing.JMenuBar adminControlMenuBar;
    private javax.swing.JMenu adminMenu;
    private javax.swing.JMenu buyerMenu;
    private javax.swing.JMenu carValueMenu;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem registerAdminMenu;
    private javax.swing.JMenuItem registerBuyerMenu;
    private javax.swing.JMenuItem registerSellerMenu;
    private javax.swing.JMenuItem searchBuyerMenu;
    private javax.swing.JMenu searchMenu;
    private javax.swing.JMenuItem searchSellerMenu;
    private javax.swing.JMenu sellerMenu;
    private javax.swing.JMenuItem updateAdminMenu;
    private javax.swing.JMenuItem updateBuyerMenu;
    private javax.swing.JMenuItem updateSellerMenu;
    // End of variables declaration//GEN-END:variables
}
