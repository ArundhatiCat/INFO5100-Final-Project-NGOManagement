/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.AnalyticsInterface.LabLoginPages;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Organization.AssignmentDonation;
import finalprojectBackend.Enterprise.Analytics.Analyst;

import finalprojectUserInterface.MainJFrameForm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sneha
 */
public class LabAnalystSignin extends javax.swing.JPanel {

    /**
     * Creates new form LabAnalystSignin
     */
    MainJFrameForm MainLoginPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    Analyst t;
    
    public LabAnalystSignin(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, Analyst t) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.t = t;
        populateTable(t.getpName());
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
        LabAnalystTitle = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtcat = new javax.swing.JTextField();
        txtreport = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        lblReport = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        categorylbl = new javax.swing.JLabel();
        btn_report = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_comm = new javax.swing.JButton();
        btn_catsearch = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        LabAnalystTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LabAnalystTitle.setText(" Analyst Login");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcatActionPerformed(evt);
            }
        });

        txtreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreportActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Category", "Item name", "Status", "Donor Enterprise", "Receiver Enterprise", "Receiver Name", "Donor name", "Report", "ID"
            }
        ));
        jScrollPane1.setViewportView(table1);

        lblReport.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblReport.setText("Report:");

        lblname.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblname.setText("Name:");

        categorylbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        categorylbl.setText("Category:");

        btn_report.setBackground(new java.awt.Color(255, 102, 102));
        btn_report.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_report.setForeground(new java.awt.Color(255, 255, 255));
        btn_report.setText("Add Report");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(255, 204, 204));
        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_comm.setBackground(new java.awt.Color(255, 102, 102));
        btn_comm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_comm.setForeground(new java.awt.Color(255, 255, 255));
        btn_comm.setText("Search by Item Name");
        btn_comm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commActionPerformed(evt);
            }
        });

        btn_catsearch.setBackground(new java.awt.Color(255, 102, 102));
        btn_catsearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_catsearch.setForeground(new java.awt.Color(255, 255, 255));
        btn_catsearch.setText("Search by Category");
        btn_catsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_catsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblReport)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                    .addComponent(txtreport, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblname)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(categorylbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(128, 128, 128)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_comm)
                                .addComponent(btn_catsearch)
                                .addComponent(btn_report)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(344, 344, 344)
                            .addComponent(LabAnalystTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LabAnalystTitle)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReport))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblname)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_report)
                        .addGap(18, 18, 18)
                        .addComponent(btn_comm)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categorylbl)
                    .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_catsearch))
                .addGap(63, 63, 63)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcatActionPerformed

    private void txtreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreportActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        // TODO add your handling code here:
        int selectedRow = table1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a row to add report");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        String id = model.getValueAt(selectedRow, 9).toString();
        //System.out.println("column count " + selectedRow);

        for (AssignmentDonation c : operatingSystem.getAssignmentDonationList()) {
            try {
                if (c.getUserId().equals(id)) {
                    c.setReportDonation(txtreport.getText().toString());
                }
            } catch (Exception e) {

            }
        }

        dB4OUtility.storeSystem(operatingSystem);
        populateTable(t.getpName());
    }//GEN-LAST:event_btn_reportActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_commActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commActionPerformed
        // TODO add your handling code here:
        populateTableName(txtname.getText().toLowerCase().toString());
    }//GEN-LAST:event_btn_commActionPerformed

    private void btn_catsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_catsearchActionPerformed
        // TODO add your handling code here:
        populateTableBlood(txtcat.getText().toLowerCase().toString());
    }//GEN-LAST:event_btn_catsearchActionPerformed

  
    private void populateTable(String name) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (AssignmentDonation a : operatingSystem.getAssignmentDonationList()) {
            
            try{
            if (a.getAnalyst().getpName().matches(name)) {
                Object[] row = new Object[10];
                row[0] = a.getItem();
                row[1] = a.getCategory();
                row[2] = a.getEntityName();
                row[3] = a.getStatusDonation();
                try {
                    row[4] = a.getDonEnterpriseClass().getNameEnterprise();
                } catch (Exception e) {

                }

                try {
                    row[5] = a.getRecEnterpriseClass().getNameEnterprise();
                } catch (Exception e) {

                }
                try {
                    row[6] = a.getRecRecepient().getNamePerson();
                } catch (Exception e) {

                }
                try {
                    row[7] = a.getDonRecepient().getNamePerson();
                } catch (Exception e) {

                }
                row[8] = a.getReportDonation();
                row[9] = a.getUserId();

                model.addRow(row);
            }
            }catch(Exception e){
                
            }

        }

    }
      
    private void populateTableBlood(String name) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (AssignmentDonation a : operatingSystem.getAssignmentDonationList()) {

            if (a.getCategory().toLowerCase().contains(name)) {
                Object[] row = new Object[10];
                row[0] = a.getItem();
                row[1] = a.getCategory();
                row[2] = a.getEntityName();
                row[3] = a.getStatusDonation();
                try {
                    row[4] = a.getDonEnterpriseClass().getNameEnterprise();
                } catch (Exception e) {

                }

                try {
                    row[5] = a.getRecEnterpriseClass().getNameEnterprise();
                } catch (Exception e) {

                }
                try {
                    row[6] = a.getRecRecepient().getNamePerson();
                } catch (Exception e) {

                }
                try {
                    row[7] = a.getDonRecepient().getNamePerson();
                } catch (Exception e) {

                }
                row[8] = a.getReportDonation();
                row[9] = a.getUserId();
                model.addRow(row);
            }

        }

    }

    private void populateTableName(String name) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (AssignmentDonation d : operatingSystem.getAssignmentDonationList()) {

            if (d.getEntityName().toLowerCase().contains(name)) {
                Object[] row = new Object[10];
                row[0] = d.getItem();
                row[1] = d.getCategory();
                row[2] = d.getEntityName();
                row[3] = d.getStatusDonation();
                try {
                    row[4] = d.getDonEnterpriseClass().getNameEnterprise();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getRecEnterpriseClass().getNameEnterprise();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getRecRecepient().getNamePerson();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonRecepient().getNamePerson();
                } catch (Exception e) {

                }

                row[8] = d.getReportDonation();
                row[9] = d.getUserId();
                model.addRow(row);
            }

        }

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabAnalystTitle;
    private javax.swing.JButton btn_catsearch;
    private javax.swing.JButton btn_comm;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_report;
    private javax.swing.JLabel categorylbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblname;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtcat;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtreport;
    // End of variables declaration//GEN-END:variables
}
