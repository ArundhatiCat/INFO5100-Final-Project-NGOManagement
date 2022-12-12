/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.SupplyChain;

/**
 *
 * @author sneha
 */
public class DeliveryVehicle {
    private String dvehiclename;
    private String dvehiclenum;
    private String dvehicletype;
    private String dvehicaldescription;

    public String getDvehiclename() {
        return dvehiclename;
    }

    public void setDvehiclename(String dvehiclename) {
        this.dvehiclename = dvehiclename;
    }

    public String getDvehiclenum() {
        return dvehiclenum;
    }

    public void setDvehiclenum(String dvehiclenum) {
        this.dvehiclenum = dvehiclenum;
    }

    public String getDvehicletype() {
        return dvehicletype;
    }

    public void setDvehicletype(String dvehicletype) {
        this.dvehicletype = dvehicletype;
    }

    public String getDvehicaldescription() {
        return dvehicaldescription;
    }

    public void setDvehicaldescription(String dvehicaldescription) {
        this.dvehicaldescription = dvehicaldescription;
    }  
    

    public DeliveryVehicle(String dvehiclename, String dvehiclenum, String dvehicletype, String dvehicaldescription) {
        this.dvehiclename = dvehiclename;
        this.dvehiclenum = dvehiclenum;
        this.dvehicletype = dvehicletype;
        this.dvehicaldescription = dvehicaldescription;
    }
}
