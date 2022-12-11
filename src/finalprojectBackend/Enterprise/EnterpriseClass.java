/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise;

/**
 *
 * @author sneha
 */
public class EnterpriseClass {
    private String addr;
    private String pName;
    private String password;
    private String nameEnterprise;
    private String registeredNumber;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameEnterprise() {
        return nameEnterprise;
    }

    public void setNameEnterprise(String nameEnterprise) {
        this.nameEnterprise = nameEnterprise;
    }

    public String getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(String registeredNumber) {
        this.registeredNumber = registeredNumber;
    }

    
    public EnterpriseClass(String addr, String pName, String password,String nameEnterprise, String registeredNumber) {
        this.addr = addr;
        this.pName = pName;
        this.password = password;
        this.nameEnterprise = nameEnterprise;
        this.registeredNumber = registeredNumber;
        
    }
}
