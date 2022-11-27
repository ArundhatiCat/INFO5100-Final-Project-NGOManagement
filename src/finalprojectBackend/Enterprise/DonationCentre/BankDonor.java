/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.DonationCentre;
import finalprojectBackend.Enterprise.EnterpriseClass;
import java.util.ArrayList;

/**
 *
 * @author sneha
 This Class holds all the functionalities for the BankDonor User
 */
public class BankDonor extends EnterpriseClass {
    
    private ArrayList<UserDonor> donor;
    private ArrayList<Category> category;
    private ArrayList<Item> item;

    public BankDonor(String addr, String pName, String password, String nameEnterprise, String registeredNumber) {
        super(addr, pName, password, nameEnterprise, registeredNumber);

        this.donor = new ArrayList();
        this.category = new ArrayList();
        this.item = new ArrayList();
    }

    public ArrayList<UserDonor> getDonor() {
        return donor;
    }

    public void setDonor(ArrayList<UserDonor> donor) {
        this.donor = donor;
    }

    public ArrayList<Category> getCategory() {
        return category;
    }

    public void setCategory(ArrayList<Category> category) {
        this.category = category;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

}
