/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Organization;
import finalprojectBackend.Enterprise.EnterpriseClass;
import finalprojectBackend.Enterprise.NGO.Manager;
import finalprojectBackend.Enterprise.NGO.Caretaker;
import finalprojectBackend.Enterprise.NGO.Recepient;
import finalprojectBackend.Enterprise.Analytics.Analyst;
import finalprojectBackend.Enterprise.SupplyChain.DeliveryAgent;
/**
 *
 * @author sneha
 * This is a Java Class for Donation Assignment 
 */
public class AssignmentDonation {
    
    public String userId;
    public Manager donManager;
    public Manager recManager;
    public Recepient recRecepient;
    public Person donRecepient;
    public Caretaker caretaker;
    public EnterpriseClass donEnterpriseClass;
    public EnterpriseClass recEnterpriseClass;
    public String item;
    public String category;
    public String EntityName;
    public String statusDonation;
    public DeliveryAgent deliveryAgent;
    public Analyst analyst;
    private String reportDonation;
    private String comm;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Manager getDonManager() {
        return donManager;
    }

    public void setDonManager(Manager donManager) {
        this.donManager = donManager;
    }

    public Manager getRecManager() {
        return recManager;
    }

    public void setRecManager(Manager recManager) {
        this.recManager = recManager;
    }

    public Recepient getRecRecepient() {
        return recRecepient;
    }

    public void setRecRecepient(Recepient recRecepient) {
        this.recRecepient = recRecepient;
    }

    public Person getDonRecepient() {
        return donRecepient;
    }

    public void setDonRecepient(Person donRecepient) {
        this.donRecepient = donRecepient;
    }

    public Caretaker getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    public EnterpriseClass getDonEnterpriseClass() {
        return donEnterpriseClass;
    }

    public void setDonEnterpriseClass(EnterpriseClass donEnterpriseClass) {
        this.donEnterpriseClass = donEnterpriseClass;
    }

    public EnterpriseClass getRecEnterpriseClass() {
        return recEnterpriseClass;
    }

    public void setRecEnterpriseClass(EnterpriseClass recEnterpriseClass) {
        this.recEnterpriseClass = recEnterpriseClass;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEntityName() {
        return EntityName;
    }

    public void setEntityName(String EntityName) {
        this.EntityName = EntityName;
    }

    public String getStatusDonation() {
        return statusDonation;
    }

    public void setStatusDonation(String statusDonation) {
        this.statusDonation = statusDonation;
    }

    public DeliveryAgent getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    public Analyst getAnalyst() {
        return analyst;
    }

    public void setAnalyst(Analyst analyst) {
        this.analyst = analyst;
    }

    public String getReportDonation() {
        return reportDonation;
    }

    public void setReportDonation(String reportDonation) {
        this.reportDonation = reportDonation;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
}
