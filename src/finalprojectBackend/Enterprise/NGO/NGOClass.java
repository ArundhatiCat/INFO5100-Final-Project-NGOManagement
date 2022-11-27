/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.NGO;

import finalprojectBackend.Enterprise.EnterpriseClass;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class NGOClass extends EnterpriseClass {

    private ArrayList<Manager> managerDirectory;
    private ArrayList<Caretaker> caretakerDirectory;
    private ArrayList<Recepient> recepientDirectory;

    public NGOClass(String addr, String pName, String password, String nameEnterprise, String registeredNumber) {
        super(addr, pName, password, nameEnterprise, registeredNumber);

        this.managerDirectory = new ArrayList();
        this.caretakerDirectory = new ArrayList();
        this.recepientDirectory = new ArrayList();

    }

    public ArrayList<Manager> getManagerDirectory() {
        return managerDirectory;
    }

    public void setManagerDirectory(ArrayList<Manager> managerDirectory) {
        this.managerDirectory = managerDirectory;
    }

    public ArrayList<Caretaker> getCaretakerDirectory() {
        return caretakerDirectory;
    }

    public void setCaretakerDirectory(ArrayList<Caretaker> caretakerDirectory) {
        this.caretakerDirectory = caretakerDirectory;
    }

    public ArrayList<Recepient> getRecepientDirectory() {
        return recepientDirectory;
    }

    public void setRecepientDirectory(ArrayList<Recepient> recepientDirectory) {
        this.recepientDirectory = recepientDirectory;
    }

    public void addCaretaker(Caretaker caretaker) {
        caretakerDirectory.add(caretaker);
    }

    public void addReceiver(Recepient receiver) {
        recepientDirectory.add(receiver);
    }
    
    public void addManager(Manager doc) {
        managerDirectory.add(doc);
    }
}
