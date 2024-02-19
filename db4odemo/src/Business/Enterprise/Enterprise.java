/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author tarushukla
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
         Clothing("Clothing"), HealthCare("HealthCare"), Electronics("Electronics"), FoodProducts("FoodProducts"),Transport("Transport");
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

   

    public Enterprise(String OrgName,EnterpriseType type, String OrgAddress, String OrgCity, String OrgCountry, Integer OrgZipCode, String OrgEmail, String OrgPhone){
        super(type.toString(), OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        
    }
}
