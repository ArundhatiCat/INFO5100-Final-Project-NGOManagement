/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.Administration;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.SupplyChain.DeliveryAgent;
import finalprojectBackend.Enterprise.SupplyChain.DeliveryVehicle;

import finalprojectUserInterface.MainJFrameForm;

/**
 *
 * @author sneha
 */
public class ManageTransport extends javax.swing.JPanel {

    /**
     * Creates new form ManageTransport
     */
    MainJFrameForm MainLoginPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;

    public ManageTransport(MainJFrameForm MainLoginPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLoginPage = MainLoginPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        populateAgentTable();
        populateVehicleTable();
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
        jScrollPaneHandler = new javax.swing.JScrollPane();
        tblAgentDetails = new javax.swing.JTable();
        btnDeleteAgent = new javax.swing.JButton();
        jScrollPanevehicle = new javax.swing.JScrollPane();
        tblVehicleDetails = new javax.swing.JTable();
        btnDeleteVehicle = new javax.swing.JButton();
        lbl_deliveryAgent = new javax.swing.JLabel();
        lbl_deliveryVehicle = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        tblAgentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Contact", "ID"
            }
        ));
        jScrollPaneHandler.setViewportView(tblAgentDetails);

        btnDeleteAgent.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteAgent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeleteAgent.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAgent.setText("Delete");
        btnDeleteAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAgentActionPerformed(evt);
            }
        });

        tblVehicleDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Delivery Vehicle Number", "Delivery Vehicle Name", "Delivery Vehicle Type", "Description"
            }
        ));
        jScrollPanevehicle.setViewportView(tblVehicleDetails);

        btnDeleteVehicle.setBackground(new java.awt.Color(255, 102, 102));
        btnDeleteVehicle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeleteVehicle.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteVehicle.setText("Delete");
        btnDeleteVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVehicleActionPerformed(evt);
            }
        });

        lbl_deliveryAgent.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbl_deliveryAgent.setText("Delivery Agent Details");

        lbl_deliveryVehicle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbl_deliveryVehicle.setText("Delivery Vehicle Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPanevehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_deliveryAgent)
                    .addComponent(jScrollPaneHandler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_deliveryVehicle))
                .addContainerGap(424, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lbl_deliveryAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneHandler, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lbl_deliveryVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPanevehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAgentActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAgentDetails.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblAgentDetails.getModel();
        String deliveryAgentUName = model.getValueAt(selectedRow, 0).toString();
        System.out.println(" handler uname: " + deliveryAgentUName);
        operatingSystem.deleteDeliveryAgent(deliveryAgentUName);
        dB4OUtility.storeSystem(operatingSystem);
        populateAgentTable();
    }//GEN-LAST:event_btnDeleteAgentActionPerformed

    private void btnDeleteVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVehicleActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVehicleDetails.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVehicleDetails.getModel();
        String deliveryVehicleNumber = model.getValueAt(selectedRow, 0).toString();
        System.out.println(" vehicle uname: " + deliveryVehicleNumber);
        operatingSystem.deleteDeliveryVehicle(deliveryVehicleNumber);
        dB4OUtility.storeSystem(operatingSystem);
        populateVehicleTable();
    }//GEN-LAST:event_btnDeleteVehicleActionPerformed

    private void populateAgentTable() {
        DefaultTableModel model = (DefaultTableModel) tblAgentDetails.getModel();
        model.setRowCount(0);

        for (DeliveryAgent d : operatingSystem.getDelieveryAgentDirectory()) {

            Object[] row = new Object[5];
            row[0] = d.getpName();
            row[1] = d.getNamePerson();
            row[2] = d.getContactNumber();
            row[3] = d.getIdUser();
            model.addRow(row);

        }

    }

    private void populateVehicleTable() {
        DefaultTableModel model = (DefaultTableModel) tblVehicleDetails.getModel();
        model.setRowCount(0);

        for (DeliveryVehicle d : operatingSystem.getDeliveryVehicleDirectory()) {

            Object[] row = new Object[5];
            row[0] = d.getDvehiclenum();
            row[1] = d.getDvehiclename();
            row[2] = d.getDvehicletype();
            row[3] = d.getDvehicaldescription();
            model.addRow(row);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAgent;
    private javax.swing.JButton btnDeleteVehicle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneHandler;
    private javax.swing.JScrollPane jScrollPanevehicle;
    private javax.swing.JLabel lbl_deliveryAgent;
    private javax.swing.JLabel lbl_deliveryVehicle;
    private javax.swing.JTable tblAgentDetails;
    private javax.swing.JTable tblVehicleDetails;
    // End of variables declaration//GEN-END:variables
}
