/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.OperatingSystem;

import finalprojectBackend.Directories.EnterpriseDirectories.NGODirectory;
import finalprojectBackend.Enterprise.DonationCentre.UserDonor;
import finalprojectBackend.Enterprise.DonationCentre.BankDonor;
import finalprojectBackend.Enterprise.NGO.Manager;
import finalprojectBackend.Enterprise.NGO.NGOClass;
import finalprojectBackend.Enterprise.NGO.Caretaker;
import finalprojectBackend.Enterprise.NGO.Recepient;
import finalprojectBackend.Enterprise.Analytics.Analyst;
import finalprojectBackend.Enterprise.SupplyChain.DeliveryAgent;
import finalprojectBackend.Enterprise.SupplyChain.DeliveryVehicle;
import finalprojectBackend.Organization.AssignmentDonation;
import finalprojectBackend.Organization.Person;
import java.util.ArrayList;

/**
 *
 * @author sneha
 * This is class for all functional methods of the Application
 */
public class OperatingSystem {
    
    private static OperatingSystem os;
    private NGODirectory NGODirectory;
    private ArrayList<Manager> managerDirectory;
    private ArrayList<UserDonor> userDonorDirectory;
    private ArrayList<BankDonor> bankDonorDirectory;
    private ArrayList<Caretaker> caretakerDirectory;
    private ArrayList<Recepient> recepientDirectory;
    private ArrayList<AssignmentDonation> assignmentDonationList;
    private ArrayList<DeliveryAgent> delieveryAgentDirectory;
    private ArrayList<DeliveryVehicle> deliveryVehicleDirectory;
    private ArrayList<Analyst> analystDirectory;
    
    public OperatingSystem() {
        this.NGODirectory = new NGODirectory();
        this.managerDirectory = new ArrayList();
        this.userDonorDirectory = new ArrayList();
        this.bankDonorDirectory = new ArrayList();
        this.caretakerDirectory = new ArrayList();
        this.recepientDirectory = new ArrayList();
        this.assignmentDonationList = new ArrayList();
        this.delieveryAgentDirectory = new ArrayList();
        this.deliveryVehicleDirectory = new ArrayList();
        this.analystDirectory = new ArrayList();
    }
    
    public static OperatingSystem getInstance() {
        if (os == null) {
            os = new OperatingSystem();
        }
        return os;
    }

    public static OperatingSystem getOs() {
        return os;
    }

    public static void setOs(OperatingSystem os) {
        OperatingSystem.os = os;
    }

    public NGODirectory getNGODirectory() {
        return NGODirectory;
    }

    public void setNGODirectory(NGODirectory NGODirectory) {
        this.NGODirectory = NGODirectory;
    }
    
    public void addNGO(NGOClass ngo) {
        System.out.println("addHospital() in ecosystem: " + ngo.getNameEnterprise());
        NGODirectory.addNGO(ngo);
    }

    public ArrayList<Manager> getManagerDirectory() {
        return managerDirectory;
    }

    public void setManagerDirectory(ArrayList<Manager> managerDirectory) {
        this.managerDirectory = managerDirectory;
    }

    public ArrayList<UserDonor> getUserDonorDirectory() {
        return userDonorDirectory;
    }

    public void setUserDonorDirectory(ArrayList<UserDonor> userDonorDirectory) {
        this.userDonorDirectory = userDonorDirectory;
    }

    public ArrayList<BankDonor> getBankDonorDirectory() {
        return bankDonorDirectory;
    }

    public void setBankDonorDirectory(ArrayList<BankDonor> bankDonorDirectory) {
        this.bankDonorDirectory = bankDonorDirectory;
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

    public ArrayList<AssignmentDonation> getAssignmentDonationList() {
        return assignmentDonationList;
    }

    public void setAssignmentDonationList(ArrayList<AssignmentDonation> assignmentDonationList) {
        this.assignmentDonationList = assignmentDonationList;
    }

    public ArrayList<DeliveryAgent> getDelieveryAgentDirectory() {
        return delieveryAgentDirectory;
    }

    public void setDelieveryAgentDirectory(ArrayList<DeliveryAgent> delieveryAgentDirectory) {
        this.delieveryAgentDirectory = delieveryAgentDirectory;
    }

    public ArrayList<DeliveryVehicle> getDeliveryVehicleDirectory() {
        return deliveryVehicleDirectory;
    }

    public void setDeliveryVehicleDirectory(ArrayList<DeliveryVehicle> deliveryVehicleDirectory) {
        this.deliveryVehicleDirectory = deliveryVehicleDirectory;
    }

    public ArrayList<Analyst> getAnalystDirectory() {
        return analystDirectory;
    }

    public void setAnalystDirectory(ArrayList<Analyst> analystDirectory) {
        this.analystDirectory = analystDirectory;
    }
    
    public void addManager(Manager man) {
        try {
            managerDirectory.add(man);
        } catch (Exception e) {
            this.managerDirectory = new ArrayList();
            managerDirectory.add(man);
            e.printStackTrace();
        }
    }

    public void addCaretaker(Caretaker care) {
        try {
            caretakerDirectory.add(care);
        } catch (Exception e) {
            this.caretakerDirectory = new ArrayList();
            caretakerDirectory.add(care);
            e.printStackTrace();
        }
    }

    public void addReceiver(Recepient pat) {
        try {
            recepientDirectory.add(pat);
        } catch (Exception e) {
            this.recepientDirectory = new ArrayList();
            recepientDirectory.add(pat);
            e.printStackTrace();
        }
    }
    
    public void addDonationAssignment(AssignmentDonation newDonationAssignment) {
        try {
            assignmentDonationList.add(newDonationAssignment);

        } catch (Exception e) {
            this.assignmentDonationList = new ArrayList();
            assignmentDonationList.add(newDonationAssignment);
        }
    }

    public void donorAdd(UserDonor donorNew) {
        try {
            userDonorDirectory.add(donorNew);
        } catch (Exception e) {
            this.userDonorDirectory = new ArrayList();
            userDonorDirectory.add(donorNew);

        }
    }

    public void addBankDonar(BankDonor newBankDonor) {
        try {
            bankDonorDirectory.add(newBankDonor);
        } catch (Exception e) {
            this.bankDonorDirectory = new ArrayList();
            bankDonorDirectory.add(newBankDonor);
            e.printStackTrace();
        }
    }
    
    public void addDelieveryAgent(DeliveryAgent newdelieveryagent) {
        try {
            delieveryAgentDirectory.add(newdelieveryagent);
        } catch (Exception e) {
            this.delieveryAgentDirectory = new ArrayList();
            delieveryAgentDirectory.add(newdelieveryagent);

        }
    }

    public void addDeliveryVehicle(DeliveryVehicle newDeliveryVehicle) {
        try {
            deliveryVehicleDirectory.add(newDeliveryVehicle);
        } catch (Exception e) {
            this.deliveryVehicleDirectory = new ArrayList();
            deliveryVehicleDirectory.add(newDeliveryVehicle);

        }
    }

    public void addAnalyst(Analyst newAnalyst) {
        try {
            analystDirectory.add(newAnalyst);
        } catch (Exception e) {
            this.analystDirectory = new ArrayList();
            analystDirectory.add(newAnalyst);
        }
    }
    
    public Object loginAuthentication(String IdUser, String pwd) {

        for (Manager m : managerDirectory) {
            System.out.println("LoginCheck(manager): " + m.getpName() + " " + m.getPwd());
            if (m.getpName().equals(IdUser) && m.getPwd().equals(pwd)) {
                return m;
            }
        }
        for (NGOClass ngo : NGODirectory.getListOfNGO()) {
            System.out.println("LoginCheck(ngo): " + ngo.getpName() + " " + ngo.getPassword());
            if (ngo.getpName().equals(IdUser) && ngo.getPassword().equals(pwd)) {
                System.out.println("LoginCheck(): matched");
                return ngo;
            }
        }

        for (Recepient r : recepientDirectory) {
            System.out.println("LoginCheck(doc): " + r.getpName() + " " + r.getPwd());
            if (r.getpName().equals(IdUser) && r.getPwd().equals(pwd)) {
                return r;
            }
        }

       
        for (BankDonor donbank : bankDonorDirectory) {
            if (donbank.getpName().equals(IdUser) && donbank.getPassword().equals(pwd)) {
                return donbank;
            }
        }
        for (DeliveryAgent da : delieveryAgentDirectory) {
            System.out.println("LoginCheck(da): " + da.getpName() + " " + da.getPwd());
            if (da.getpName().equals(IdUser) && da.getPwd().equals(pwd)) {
                System.out.println("LoginCheck(da): successful" + da.getpName() + " " + da.getPwd());
                return da;
            }
        }

        for (Analyst ana : analystDirectory) {
            if (ana.getpName().equals(IdUser) && ana.getPwd().equals(pwd)) {
                return ana;
            }
        }

        for (UserDonor dondon : userDonorDirectory) {
            if (dondon.getpName().equals(IdUser) && dondon.getPwd().equals(pwd)) {
                return dondon;
            }
        }
        return null;
    }

    public void deleteManagerUser(String managerUserName) {
        for (Manager m : managerDirectory) {
            if (m.getpName().equals(managerUserName)) {
                managerDirectory.remove(m);
                return;
            }
        }
    }

    public void deleteCaretakerUser(String CaretakerUserName) {
        for (Caretaker c : caretakerDirectory) {
            if (c.getpName().equals(CaretakerUserName)) {
                caretakerDirectory.remove(c);
                return;
            }
        }
    }

    public void deleteReceiver(String RecieverUserName) {
        for (Recepient r : recepientDirectory) {
            if (r.getpName().equals(RecieverUserName)) {
                recepientDirectory.remove(r);
                return;
            }
        }
    }
    
    public void deleteByUserNameDonor(String UserNamemanager) {
        for (UserDonor d : userDonorDirectory) {
            if (d.getpName().equals(UserNamemanager)) {
                userDonorDirectory.remove(d);
                return;
            }
        }
    }
    
    public void deleteBankDonor(String bankDonorUName) {
        for (BankDonor d : bankDonorDirectory) {
            System.out.println("donorb " + d.getpName());
            if (d.getpName().equals(bankDonorUName)) {
                System.out.println("found");
                bankDonorDirectory.remove(d);
                return;
            }
        }
    }
    
    public void donorDelete(String nameDonor) {
        for (UserDonor d : userDonorDirectory) {
            if (d.getpName().equals(nameDonor)) {
                userDonorDirectory.remove(d);
                return;
            }
        }
    }

    public void deleteDeliveryAgent(String DAname) {
        for (DeliveryAgent d : delieveryAgentDirectory) {
            if (d.getpName().equals(DAname)) {
                delieveryAgentDirectory.remove(d);
                return;
            }
        }
    }

    public void deleteDeliveryVehicle(String deliveryVehicleNumber) {
        for (DeliveryVehicle d : deliveryVehicleDirectory) {
            if (d.getDvehiclenum().equals(deliveryVehicleNumber)) {
                deliveryVehicleDirectory.remove(d);
                return;
            }
        }
    }
    
    public Manager getManagerByUserName(String nameUser) {
        for (Manager m : managerDirectory) {
            if (m.getpName().equals(nameUser)) {
                return m;
            }
        }
        return null;
    }

    public Person getReceiverByUserName(String ReceiverUserName) {
        for (Recepient r : recepientDirectory) {
            if (r.getpName().equals(ReceiverUserName)) {
                return r;
            }
        }
        for (UserDonor r : userDonorDirectory) {
            if (r.getpName().equals(ReceiverUserName)) {
                return r;
            }
        }
        return null;
    }

    public DeliveryVehicle getDeliveryVehicleByNumber(String deliveryvehicleNo) {
        for (DeliveryVehicle dv : deliveryVehicleDirectory) {
            if (dv.getDvehiclenum().matches(deliveryvehicleNo.substring(0, deliveryvehicleNo.indexOf("|")))) {
                return dv;
            }
        }
        return null;
    }
    
    private DeliveryAgent getDeliveryAgentByUserName(String daUserName) {
        for (DeliveryAgent da : delieveryAgentDirectory) {
            if (da.getpName().toLowerCase().equals(daUserName.toLowerCase())) {
                return da;
            }
        }
        return null;
    }

    private Analyst getAnalystByUserName(String analystUserName) {
        for (Analyst a : analystDirectory) {
            if (a.getpName().equals(analystUserName)) {
                return a;
            }
        }
        return null;
    } 
    
    public void requesting(String Entity, String deliveryagent, String analyst, NGOClass record, String manager, String recordreceiver) {
        DeliveryAgent del = getDeliveryAgentByUserName(deliveryagent);
        Analyst ana = getAnalystByUserName(analyst);
        Manager man = getManagerByUserName(manager);
        Recepient re = (Recepient) getReceiverByUserName(recordreceiver);
        for (AssignmentDonation ad : assignmentDonationList) {
            try {
                if (ad.getUserId().equals(Entity)) {
                    ad.setDeliveryAgent(del);
                    ad.setAnalyst(ana);
                    ad.setRecEnterpriseClass(record);
                    ad.setRecManager(man);
                    ad.setRecRecepient(re);
                    ad.setStatusDonation("Requested");
                    return;
                }
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
    }
    
}
