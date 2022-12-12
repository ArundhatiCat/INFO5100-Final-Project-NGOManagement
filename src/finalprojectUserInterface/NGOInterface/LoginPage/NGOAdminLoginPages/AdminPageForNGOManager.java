/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.NGOInterface.LoginPage.NGOAdminLoginPages;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.NGO.NGOClass;
import finalprojectBackend.Enterprise.NGO.Manager;
import finalprojectUserInterface.MainJFrameForm;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author sneha
 */
public class AdminPageForNGOManager extends javax.swing.JPanel {

    /**
     * Creates new form AdminPageForNGOManager
     */
    MainJFrameForm MainLoginPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    NGOClass ngo;

    public AdminPageForNGOManager(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, NGOClass h) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.ngo = h;
        populateManagerTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_1 = new javax.swing.JTable();
        manager_lbl = new javax.swing.JLabel();
        delete_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "User Name", "Department ", "Address"
            }
        ));
        jScrollPane1.setViewportView(table_1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 97, 820, 209));

        manager_lbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        manager_lbl.setText("Manage NGO Managers");
        add(manager_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        delete_btn.setBackground(new java.awt.Color(255, 102, 102));
        delete_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 130, 50));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) table_1.getModel();
        String doctorUName = model.getValueAt(selectedRow, 1).toString();
        System.out.println(" manager uname: " + doctorUName);
        operatingSystem.deleteManagerUser(doctorUName);
        dB4OUtility.storeSystem(operatingSystem);
        populateManagerTable();
    }//GEN-LAST:event_delete_btnActionPerformed

    private void populateManagerTable() {
        DefaultTableModel model = (DefaultTableModel) table_1.getModel();
        model.setRowCount(0);

        for (Manager d : operatingSystem.getManagerDirectory()) {

            if (d.getNGOName().equals(ngo.getNameEnterprise())) {
                Object[] row = new Object[5];
                row[0] = d.getNamePerson();
                row[1] = d.getpName();
                row[2] = d.getManagerDept();
                row[3] = d.getAddr();
                model.addRow(row);

            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manager_lbl;
    private javax.swing.JTable table_1;
    // End of variables declaration//GEN-END:variables
}
