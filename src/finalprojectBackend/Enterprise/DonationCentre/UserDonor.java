/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.DonationCentre;
import finalprojectBackend.Organization.Person;
import java.util.Date;

/**
 *
 * @author sneha
 This Class holds all the functionalities for the UserDonor Person
 */
public class UserDonor extends Person{
    
    private String bankDonorName;
    
    public UserDonor(String udname, String ud_pwd, String userId, String pName, String addr, String pgender, String mobNumber, Date dateofbirth,String dbn) {
        super(udname, ud_pwd, userId, pName, addr, pgender, mobNumber, dateofbirth);
        this.bankDonorName = dbn;
    }

    public String getBankDonorName() {
        return bankDonorName;
    }

    public void setBankDonorName(String bankDonorName) {
        this.bankDonorName = bankDonorName;
    }
}
