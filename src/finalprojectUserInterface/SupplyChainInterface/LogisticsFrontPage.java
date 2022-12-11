/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.SupplyChainInterface;

import javax.swing.JOptionPane;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.SupplyChain.DeliveryAgent;
import finalprojectBackend.Organization.AssignmentDonation;
import finalprojectUserInterface.SupplyChainInterface.LogisticsLoginPages.DelhiveryAgentLogin;

import finalprojectUserInterface.MainJFrameForm;

/**
 *
 * @author sneha
 */
public class LogisticsFrontPage extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsFrontPage
     */
    MainJFrameForm MainLoginPage;
    private DB4OUtility dB4OUtility;
    private OperatingSystem operatingSystem;

    public LogisticsFrontPage(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();

        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logistics_lbl = new javax.swing.JLabel();
        role_lbl = new javax.swing.JLabel();
        role_cmb = new javax.swing.JComboBox<>();
        unmae_lbl = new javax.swing.JLabel();
        uname_txt = new javax.swing.JTextField();
        pwd_lbl = new javax.swing.JLabel();
        pwd_txt = new javax.swing.JPasswordField();
        login_btn = new javax.swing.JButton();
        sigin_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 1551));

        jPanel1.setMaximumSize(new java.awt.Dimension(1700, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(1700, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logistics_lbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        logistics_lbl.setText("Logistics");
        jPanel1.add(logistics_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        role_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        role_lbl.setText("Role:");
        jPanel1.add(role_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        role_cmb.setEditable(true);
        role_cmb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        role_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivery Agent","Delivery Vehicle"}));
        role_cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                role_cmbActionPerformed(evt);
            }
        });
        jPanel1.add(role_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 197, -1));

        unmae_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unmae_lbl.setText("Username:");
        jPanel1.add(unmae_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        uname_txt.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jPanel1.add(uname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 197, -1));

        pwd_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pwd_lbl.setText("Password:");
        jPanel1.add(pwd_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        pwd_txt.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jPanel1.add(pwd_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 197, -1));

        login_btn.setBackground(new java.awt.Color(255, 204, 51));
        login_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 86, 40));

        sigin_btn.setBackground(new java.awt.Color(255, 204, 51));
        sigin_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sigin_btn.setText("Sign Up");
        sigin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigin_btnActionPerformed(evt);
            }
        });
        jPanel1.add(sigin_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/delivery-bgbg.jpeg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(2999, 1999));
        jLabel2.setMinimumSize(new java.awt.Dimension(2999, 1999));
        jLabel2.setPreferredSize(new java.awt.Dimension(2999, 2000));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2510, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1712, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1700, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1537, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void role_cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_role_cmbActionPerformed
        // TODO add your handling code here:
        System.out.println(role_cmb.getSelectedItem().toString());
        if (role_cmb.getSelectedItem().toString() == "Admin") {
            sigin_btn.setEnabled(false);
        } else {
            sigin_btn.setEnabled(true);
        }
    }//GEN-LAST:event_role_cmbActionPerformed

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        String role = role_cmb.getSelectedItem().toString();
        System.out.println(role);
        if (role_cmb.getSelectedItem().toString() == "Delivery Vehicle") {

            JOptionPane.showMessageDialog(this, "Vehicle not allow to login.");
        }

        //
        //        }
        if (role_cmb.getSelectedItem().toString() == "Delivery Agent") {
            
            DeliveryAgent ho = (DeliveryAgent) operatingSystem.loginAuthentication(uname_txt.getText(), pwd_txt.getText());
            System.out.println(ho.getNamePerson());
            if (ho == null) {
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            } else {
                DelhiveryAgentLogin ap = new DelhiveryAgentLogin(MainLoginPage, dB4OUtility, operatingSystem, ho);
                MainLoginPage.setContentPane(ap);
                MainLoginPage.invalidate();
                MainLoginPage.validate();
                return;
            }

        }
        //
        //        if (cmb_Role.getSelectedItem().toString() == "Patient") {
            //            DeliveryMan r = system.loginDeliveryMan(txtUsername.getText(), txtPassword.getText());
            //
            //            if (r == null) {
                //                JOptionPane.showMessageDialog(this, "Incorrect credential");
                //            } else {
                //                DeliverManMainPage delimp = new DeliverManMainPage(system, dB4OUtility, r);
                //                this.setContentPane(delimp);
                //                this.invalidate();
                //                this.validate();
                //                return;
                //            }
                //
                //        }

                //
                //            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
                //        } else if (!name_chk.getText().equals("") || !telenum_chk.getText().equals("") || !add_chk.getText().equals("") || !city_chk.getText().equals("")
                //            || !state_chk.getText().equals("") || !zip_chk.getText().equals("")) {
                //
                //            JOptionPane.showMessageDialog(this, "Invalid value(s) entered.");
                //        }
                //        else{
                //            Address add = new Address(txtAdd.getText(), txtCity.getText(), txtState.getText(), Integer.parseInt(txtZip.getText()));
                //
                //            Customer cus =new Customer(txtUsrName.getText(), txtPass.getText(), new CustomerRole(),txtNo.getText(), txtFullName.getText(), add);
                //            system.addCustomer(cus);
                //
                //            dB4OUtility.storeSystem(system);
                //            JOptionPane.showMessageDialog(this, "Customer information saved.");
                //            MainJFrame cust = new MainJFrame();
                //            ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
                //            cust.setVisible(true);
                //
                //        if (cmb_Role.getSelectedItem().toString() == "Hospital Admin") {
                //            if (txtUsername.getText().matches("a") && txtPassword.getText().matches("a")) {
                //                AdminPage adminpg = new AdminPage(system, dB4OUtility);
                //                this.setContentPane(adminpg);
                //                this.invalidate();
                //                this.validate();
                //                return;
                //            } else {
                //                JOptionPane.showMessageDialog(this, "Incorrect credential");
                //            }
            //        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void sigin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigin_btnActionPerformed
        // TODO add your handling code here:

        if (role_cmb.getSelectedItem().toString() == "Delivery Vehicle") {

            DelhiveryVehicleSignUp signveh = new DelhiveryVehicleSignUp(MainLoginPage, dB4OUtility, operatingSystem);
            //
            //            //suc.setVisible(true);
            MainLoginPage.setContentPane(signveh);
            ////            //             this.add(s);
            ////
            MainLoginPage.invalidate();
            MainLoginPage.validate();

        }

        if (role_cmb.getSelectedItem().toString() == "Delivery Agent") {
            // System.out.println("Hospital");
            DeliveryAgentSignUp s = new DeliveryAgentSignUp(MainLoginPage, dB4OUtility, operatingSystem);

            //suc.setVisible(true);
            MainLoginPage.setContentPane(s);
            //             this.add(s);

            MainLoginPage.invalidate();
            MainLoginPage.validate();

        }
    }//GEN-LAST:event_sigin_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel logistics_lbl;
    private javax.swing.JLabel pwd_lbl;
    private javax.swing.JPasswordField pwd_txt;
    private javax.swing.JComboBox<String> role_cmb;
    private javax.swing.JLabel role_lbl;
    private javax.swing.JButton sigin_btn;
    private javax.swing.JTextField uname_txt;
    private javax.swing.JLabel unmae_lbl;
    // End of variables declaration//GEN-END:variables
}
