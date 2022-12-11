/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Components;

/**
 *
 * @author sneha
 */
public class LocationBook {
    
    private String addrLine1;
    private String addrLine2;
    private int unitNo;
    private String cityName;
    private String stateName;
    private int pincode;
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public int getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(int unitNo) {
        this.unitNo = unitNo;
    }

    public LocationBook(String addrLine1, String addrLine2, int unitNo, String cityName) {
        this.addrLine1 = addrLine1;
        this.addrLine2 = addrLine2;
        this.unitNo = unitNo;
        this.cityName = cityName;

    }
}
