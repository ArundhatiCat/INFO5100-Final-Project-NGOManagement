/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.SupplyChain;

import finalprojectBackend.Organization.Person;
import java.util.Date;

/**
 *
 * @author sneha
 */
public class DeliveryAgent extends Person {
    
    private DeliveryVehicle deliveryVehicle;
    
    public DeliveryAgent(String pName, String pwd, String Iduser, String NamePerson, String addr, String pgender, String contactNumber, Date dob, DeliveryVehicle dvehicle) {
        super(pName, pwd, Iduser, NamePerson, addr, pgender, contactNumber, dob);
        this.deliveryVehicle = dvehicle;
    }

    public DeliveryVehicle getDeliveryVehicle() {
        return deliveryVehicle;
    }

    public void setDeliveryVehicle(DeliveryVehicle deliveryVehicle) {
        this.deliveryVehicle = deliveryVehicle;
    }
}
