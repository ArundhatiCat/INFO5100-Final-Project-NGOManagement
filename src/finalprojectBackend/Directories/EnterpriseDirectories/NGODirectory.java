/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Directories.EnterpriseDirectories;

import finalprojectBackend.Enterprise.NGO.NGOClass;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class NGODirectory {
    
    private ArrayList<NGOClass> listOfNGO;
 
    public NGODirectory(){
        listOfNGO = new ArrayList();
    }

    public void addNGO(NGOClass ngo) {
        listOfNGO.add(ngo);
    }

    public void removeNGO(String ngoId) {

        for (NGOClass ngo : listOfNGO) {
            if (ngo.getRegisteredNumber() == ngoId) {
                listOfNGO.remove(ngo);
            }
        }
    }
    
    public NGOClass findNGO(String ngoName) {
        System.out.println("SearchNGO() "+ngoName);
        for (NGOClass ngo : listOfNGO) {
            if (ngo.getNameEnterprise() == ngoName) {
                return ngo;
            }
        }
        return null;
    } 
    
    public ArrayList<NGOClass> getListOfNGO() {
        return listOfNGO;
    }

    public void setListOfNGO(ArrayList<NGOClass> listOfNGO) {
        this.listOfNGO = listOfNGO;
    }
  
}
