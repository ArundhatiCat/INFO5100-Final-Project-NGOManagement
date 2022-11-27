/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.Analytics;

import finalprojectBackend.Organization.Person;
import java.util.Date;

/**
 *
 * @author sneha
 */
public class Analyst extends Person {
    
    private String nameOfLab;
    
    public Analyst(String pName, String pwd, String Iduser, String NamePerson, String addr, String pgender, String contantNumber, Date dob, String nameOfLab) {
        super(pName, pwd, Iduser, NamePerson, addr, pgender, contantNumber, dob);
        this.nameOfLab = nameOfLab;
    }

    public String getNameOfLab() {
        return nameOfLab;
    }

    public void setNameOfLab(String nameOfLab) {
        this.nameOfLab = nameOfLab;
    }
}

