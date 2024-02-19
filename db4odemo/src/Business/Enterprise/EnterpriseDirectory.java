/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 * @author sakshi
 * @author tarushukla
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String OrgName, String OrgAddress, String OrgCity, String OrgCountry, Integer OrgZipCode, String OrgEmail, String OrgPhone, Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Clothing){
            enterprise = new ClothingEnterprise(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.HealthCare){
            enterprise = new HealthCareEnterprise(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Electronics){
            enterprise = new ElectronicsEnterprise(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Transport){
            enterprise = new TransportEnterprise(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.FoodProducts){
            enterprise = new FoodProductsEnterprise(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.Transport){
            enterprise = new FoodProductsEnterprise(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    public void removeEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
    
    public Enterprise getEnterprise(String name){
        for(Enterprise e : enterpriseList){
            if(e.getOrgName().equalsIgnoreCase(name)){
                return e;
            }
        }
        return null;
    }

}
