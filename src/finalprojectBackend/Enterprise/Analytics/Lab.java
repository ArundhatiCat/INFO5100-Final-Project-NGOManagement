/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.Analytics;

import finalprojectBackend.Enterprise.EnterpriseClass;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class Lab extends EnterpriseClass{
    
    private ArrayList<Analyst> analyst;
    
    public Lab(String addr, String pName, String password, String nameEnterprise, String registeredNumber) {
        super(addr, pName, password, nameEnterprise, registeredNumber);
        this.analyst = new ArrayList();
    }

    public ArrayList<Analyst> getAnalyst() {
        return analyst;
    }

    public void setAnalyst(ArrayList<Analyst> analyst) {
        this.analyst = analyst;
    }
}

