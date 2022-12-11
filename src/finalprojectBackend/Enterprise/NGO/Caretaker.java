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
public class Caretaker extends Person{
    
    private String NGOName;
    
    public String getNGOName() {
        return NGOName;
    }

    public void setNGOName(String NGOName) {
        this.NGOName = NGOName;
    }
    
    
    public Caretaker(String pName, String pwd, String Iduser, String NamePerson, String addr, String pgender, String contactNumber, Date dob, String NGOName) {
        super(pName, pwd, Iduser, NamePerson, addr, pgender, contactNumber, dob);
        this.NGOName = NGOName;
    }

}
