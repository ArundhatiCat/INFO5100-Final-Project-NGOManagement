/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.SupplyChain;

import finalprojectBackend.Enterprise.EnterpriseClass;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class Logistics extends EnterpriseClass {
    
    private ArrayList<DeliveryAgent> deliveryAgent;
    private ArrayList<DeliveryVehicle> deliveryVehicle;

    public Logistics(String addr, String pName, String password, String nameEnterprise, String registeredNumber) {
        super(addr, pName, password, nameEnterprise, registeredNumber);
    }

    public ArrayList<DeliveryAgent> getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(ArrayList<DeliveryAgent> deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    public ArrayList<DeliveryVehicle> getDeliveryVehicle() {
        return deliveryVehicle;
    }

    public void setDeliveryVehicle(ArrayList<DeliveryVehicle> deliveryVehicle) {
        this.deliveryVehicle = deliveryVehicle;
    }
}
