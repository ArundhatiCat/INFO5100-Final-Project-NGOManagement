/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.NGO;

import finalprojectBackend.Organization.Person;
import java.util.Date;

/**
 *
 * @author sneha
 */
public class Recepient extends Person {
    
    private String remarks;
    private String NGOName;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getNGOName() {
        return NGOName;
    }

    public void setNGOName(String NGOName) {
        this.NGOName = NGOName;
    }
    
    
    public Recepient(String pName, String pwd, String Iduser, String NamePerson, String addr, String pgender, String phoneNumber, Date dob, String remarks, String NGOName) {
        super(pName, pwd, Iduser, NamePerson, addr, pgender, phoneNumber, dob);
        this.remarks = remarks;
        this.NGOName = NGOName;
    }
}
