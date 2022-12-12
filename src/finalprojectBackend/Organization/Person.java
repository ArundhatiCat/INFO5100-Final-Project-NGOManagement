/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Organization;

import java.util.Date;

/**
 *
 * @author sneha
 */
public class Person {  
    
    

private String pName;
private String pwd;
private String idUser;
private String namePerson;
private String addr;
private String pgender;
private String contactNumber;
private Date dob;

    public Person(String pName, String pwd, String Id, String NamePerson, String addr, String pgender, String contactNumber, Date dob) {
        this.pName = pName;
        this.pwd = pwd;
        this.idUser = Id;
        this.namePerson = NamePerson;
        this.addr = addr;
        this.pgender = pgender;
        this.contactNumber = contactNumber;
        this.dob = dob;
    }

    

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }    

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    
}
