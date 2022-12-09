/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.SupplyChainInterface;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.SupplyChain.DeliveryVehicle;

import finalprojectUserInterface.MainJFrameForm;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author sneha
 */
public class DelhiveryVehicleSignUp extends javax.swing.JPanel {

    /**
     * Creates new form DelhiveryVehicleSignUp
     */
    boolean ValidationStatus = true;
    
    MainJFrameForm MainLoginPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    
    public DelhiveryVehicleSignUp(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
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
        dv_profile = new javax.swing.JLabel();
        delvehicle_lbl = new javax.swing.JLabel();
        vehicle_txt = new javax.swing.JTextField();
        veh_num_lbl = new javax.swing.JLabel();
        vehnum_txt = new javax.swing.JTextField();
        veh_lbl = new javax.swing.JLabel();
        vehtype_txt = new javax.swing.JTextField();
        desc_lbl = new javax.swing.JLabel();
        vehdes_txt = new javax.swing.JTextField();
        back_btn = new javax.swing.JButton();
        sign_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dv_profile.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        dv_profile.setText("Create Delivery Vehicle Profile");
        jPanel1.add(dv_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        delvehicle_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delvehicle_lbl.setText("Vehicle Name:");
        jPanel1.add(delvehicle_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        jPanel1.add(vehicle_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 177, -1));

        veh_num_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        veh_num_lbl.setText("Vehicle Number:");
        jPanel1.add(veh_num_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPanel1.add(vehnum_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 177, -1));

        veh_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        veh_lbl.setText("Vehicle Type:");
        jPanel1.add(veh_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));
        jPanel1.add(vehtype_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 177, -1));

        desc_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        desc_lbl.setText("Description:");
        jPanel1.add(desc_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));
        jPanel1.add(vehdes_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 177, -1));

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 87, 40));

        sign_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sign_btn.setText("Sign Up");
        sign_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_btnActionPerformed(evt);
            }
        });
        jPanel1.add(sign_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 87, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 990, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 96, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void sign_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_btnActionPerformed
        // TODO add your handling code here:
        try {
            if(EmpytyFieldValidation())
            {
                DeliveryVehicle vehicle = new DeliveryVehicle(vehicle_txt.getText(),vehnum_txt.getText(),vehtype_txt.getText(),vehdes_txt.getText());

                operatingSystem.addDeliveryVehicle(vehicle);
                dB4OUtility.storeSystem(operatingSystem);

                MainJFrameForm suc = new MainJFrameForm();
                ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
                suc.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this,"Empty Field not allowed ! Please check the red fields");
                ValidationStatus=true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Vehicle is not registered ! Please check");
            ValidationStatus=true;
        }
      
        
        
        
        
    }//GEN-LAST:event_sign_btnActionPerformed

    private boolean EmpytyFieldValidation() {
    if(vehicle_txt.getText().equals(null) || vehicle_txt.getText().trim().isEmpty() )
    {
        vehicle_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        vehicle_txt.setToolTipText("This Field Cannot be empty");
        ValidationStatus= false;
    }
    if(!vehicle_txt.getText().equals(null) && !vehicle_txt.getText().trim().isEmpty() )
    {
        vehicle_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
    }

    if(vehnum_txt.getText().equals(null) || vehnum_txt.getText().trim().isEmpty() )
    {
        vehnum_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        vehnum_txt.setToolTipText("This Field Cannot be empty");
        ValidationStatus= false;
    }
    if(!vehnum_txt.getText().equals(null) && !vehnum_txt.getText().trim().isEmpty() )
    {
        vehnum_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
    }

    if(vehtype_txt.getText().equals(null) || vehtype_txt.getText().trim().isEmpty() )
    {
        vehtype_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        vehtype_txt.setToolTipText("This Field Cannot be empty");
        ValidationStatus= false;
    }
    if(!vehtype_txt.getText().equals(null) && !vehtype_txt.getText().trim().isEmpty() )
    {
        vehtype_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
    }
    


    if(vehdes_txt.getText().equals(null) || vehdes_txt.getText().trim().isEmpty() )
    {
        vehdes_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        vehdes_txt.setToolTipText("This Field Cannot be empty");
        ValidationStatus= false;
    }
    if(!vehdes_txt.getText().equals(null) && !vehdes_txt.getText().trim().isEmpty() )
    {
        vehdes_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
    }
    return ValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel delvehicle_lbl;
    private javax.swing.JLabel desc_lbl;
    private javax.swing.JLabel dv_profile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sign_btn;
    private javax.swing.JLabel veh_lbl;
    private javax.swing.JLabel veh_num_lbl;
    private javax.swing.JTextField vehdes_txt;
    private javax.swing.JTextField vehicle_txt;
    private javax.swing.JTextField vehnum_txt;
    private javax.swing.JTextField vehtype_txt;
    // End of variables declaration//GEN-END:variables
}
