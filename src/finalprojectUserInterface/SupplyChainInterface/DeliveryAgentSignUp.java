/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.SupplyChainInterface;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;

import finalprojectBackend.Enterprise.SupplyChain.DeliveryAgent;
import finalprojectBackend.Enterprise.SupplyChain.DeliveryVehicle;

import finalprojectUserInterface.MainJFrameForm;
import java.awt.Color;

import java.util.Date;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author sneha
 */
public class DeliveryAgentSignUp extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAgentSignUp
     */
    
    Random rand = new Random();
    
    
    boolean ValidationStatus = true;
    boolean validationCheck = true;
    
    MainJFrameForm MainLoginPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    
    public DeliveryAgentSignUp(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        
        for(DeliveryVehicle h: operatingSystem.getDeliveryVehicleDirectory()){
            String s = h.getDvehiclenum()+"| " + h.getDvehiclename()+" | "+ h.getDvehicletype();
            veh_cmb.addItem(s);
        }
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
        da_title = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        unmae_lbl = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        uname_txt = new javax.swing.JTextField();
        pwd_lbl = new javax.swing.JLabel();
        pwd_txt = new javax.swing.JPasswordField();
        add_lbl = new javax.swing.JLabel();
        add_txt = new javax.swing.JTextField();
        city_lbl = new javax.swing.JLabel();
        city_txt = new javax.swing.JTextField();
        state_lbl = new javax.swing.JLabel();
        zipcode_lbl = new javax.swing.JLabel();
        state_txt = new javax.swing.JTextField();
        zip_txt = new javax.swing.JTextField();
        back_btn = new javax.swing.JButton();
        gen_lbl = new javax.swing.JLabel();
        signup_btn = new javax.swing.JButton();
        num_lbl = new javax.swing.JLabel();
        gen_cmb = new javax.swing.JComboBox<>();
        dob_lbl = new javax.swing.JLabel();
        num_txt = new javax.swing.JTextField();
        vehnum_lbl = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        veh_cmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        da_title.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        da_title.setForeground(new java.awt.Color(0, 51, 51));
        da_title.setText("Create Delivery Agent Profile");
        jPanel1.add(da_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        name_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name_lbl.setText("Name:");
        jPanel1.add(name_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, 20));

        unmae_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unmae_lbl.setText("Username:");
        jPanel1.add(unmae_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));
        jPanel1.add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 216, -1));
        jPanel1.add(uname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 216, -1));

        pwd_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pwd_lbl.setText("Password:");
        jPanel1.add(pwd_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, 20));
        jPanel1.add(pwd_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 216, -1));

        add_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_lbl.setText("Address:");
        jPanel1.add(add_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));
        jPanel1.add(add_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 216, -1));

        city_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        city_lbl.setText("City:");
        jPanel1.add(city_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));
        jPanel1.add(city_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 216, -1));

        state_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        state_lbl.setText("State:");
        jPanel1.add(state_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        zipcode_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zipcode_lbl.setText("Zip Code:");
        jPanel1.add(zipcode_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        state_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state_txtActionPerformed(evt);
            }
        });
        jPanel1.add(state_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 216, -1));
        jPanel1.add(zip_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 215, -1));

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 659, 87, 40));

        gen_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gen_lbl.setText("Gender:");
        jPanel1.add(gen_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, 20));

        signup_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signup_btn.setText("Sign Up");
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });
        jPanel1.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 659, 87, 40));

        num_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        num_lbl.setText("Phone no.:");
        jPanel1.add(num_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        gen_cmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gen_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(gen_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 216, -1));

        dob_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dob_lbl.setText("Date of Birth:");
        jPanel1.add(dob_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, 30));
        jPanel1.add(num_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 216, -1));

        vehnum_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vehnum_lbl.setText("Vehicle:");
        jPanel1.add(vehnum_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, -1, 20));
        jPanel1.add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 216, 27));

        veh_cmb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(veh_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, 216, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1482, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        // TODO add your handling code here:
        
        try {
            if(EmpytyFieldValidation())
            {
                if(RegexValidation())
                {
                    String address = add_txt.getText() + "," + city_txt.getText() + "," + state_txt.getText() + "," + zip_txt.getText();
                    int id = rand.nextInt(99);
                    

                    DeliveryAgent handler = new DeliveryAgent(uname_txt.getText(), pwd_txt.getText(), String.valueOf(id), name_txt.getText(), address,gen_cmb.getSelectedItem().toString(), num_txt.getText(), new Date(),operatingSystem.getDeliveryVehicleByNumber(veh_cmb.getSelectedItem().toString()));
                    System.out.println("handler " + handler.getDeliveryVehicle().getDvehiclename());
                    operatingSystem.addDelieveryAgent(handler);
                    dB4OUtility.storeSystem(operatingSystem);

                    MainJFrameForm suc = new MainJFrameForm();
                    ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
                    suc.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Data Cant be empty. Please check over the red fields to know more.");
                ValidationStatus=true;
            }
        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_signup_btnActionPerformed

    private void state_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state_txtActionPerformed

    private boolean RegexValidation() {
    if(!name_txt.getText().matches("^[a-zA-Z ]+$"))
        {
            name_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            name_txt.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(!num_txt.getText().matches("^[0-9]{10}$"))
        {
            num_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            num_txt.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }


        if(!zip_txt.getText().matches("^[0-9]{5}$"))
        {
            zip_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            zip_txt.setToolTipText("Please enter a 5 digit number");
            validationCheck=false;
        }


        return validationCheck;


    }   


    private boolean EmpytyFieldValidation() {

        if(name_txt.getText().equals(null) || name_txt.getText().trim().isEmpty() )
        {
            name_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            name_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!name_txt.getText().equals(null) && !name_txt.getText().trim().isEmpty() )
        {
            name_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(state_txt.getText().equals(null) || state_txt.getText().trim().isEmpty() )
        {
            state_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            state_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!state_txt.getText().equals(null) && !state_txt.getText().trim().isEmpty() )
        {
            state_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(pwd_txt.getText().equals(null) || pwd_txt.getText().trim().isEmpty() )
        {
            pwd_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            pwd_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!pwd_txt.getText().equals(null) && !pwd_txt.getText().trim().isEmpty() )
        {
            pwd_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        
        if(add_txt.getText().equals(null) || add_txt.getText().trim().isEmpty() )
        {
            add_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            add_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!add_txt.getText().equals(null) && !add_txt.getText().trim().isEmpty() )
        {
            add_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(city_txt.getText().equals(null) || city_txt.getText().trim().isEmpty() )
        {
            city_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            city_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!city_txt.getText().equals(null) && !city_txt.getText().trim().isEmpty() )
        {
            city_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(state_txt.getText().equals(null) || state_txt.getText().trim().isEmpty() )
            {
                state_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                state_txt.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!state_txt.getText().equals(null) && !state_txt.getText().trim().isEmpty() )
        {
            state_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(zip_txt.getText().equals(null) || zip_txt.getText().trim().isEmpty() )
            {
                zip_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                zip_txt.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!zip_txt.getText().equals(null) && !zip_txt.getText().trim().isEmpty() )
        {
            zip_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(num_txt.getText().equals(null) || num_txt.getText().trim().isEmpty() )
            {
                num_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                num_txt.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!num_txt.getText().equals(null) && !num_txt.getText().trim().isEmpty() )
        {
            num_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }



        if(txt_dob.getText().equals(null) || txt_dob.getText().trim().isEmpty() )
            {
                txt_dob.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                txt_dob.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!txt_dob.getText().equals(null) && !txt_dob.getText().trim().isEmpty() )
        {
            txt_dob.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(uname_txt.getText().equals(null) || uname_txt.getText().trim().isEmpty() )
            {
                uname_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                uname_txt.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!uname_txt.getText().equals(null) && !uname_txt.getText().trim().isEmpty() )
        {
            uname_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return ValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_lbl;
    private javax.swing.JTextField add_txt;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel city_lbl;
    private javax.swing.JTextField city_txt;
    private javax.swing.JLabel da_title;
    private javax.swing.JLabel dob_lbl;
    private javax.swing.JComboBox<String> gen_cmb;
    private javax.swing.JLabel gen_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel num_lbl;
    private javax.swing.JTextField num_txt;
    private javax.swing.JLabel pwd_lbl;
    private javax.swing.JPasswordField pwd_txt;
    private javax.swing.JButton signup_btn;
    private javax.swing.JLabel state_lbl;
    private javax.swing.JTextField state_txt;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField uname_txt;
    private javax.swing.JLabel unmae_lbl;
    private javax.swing.JComboBox<String> veh_cmb;
    private javax.swing.JLabel vehnum_lbl;
    private javax.swing.JTextField zip_txt;
    private javax.swing.JLabel zipcode_lbl;
    // End of variables declaration//GEN-END:variables
}
