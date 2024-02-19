/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tarushukla
 */
public class ClothingEnterprise extends Enterprise {
    
    public ClothingEnterprise(String OrgName,String OrgAddress, String OrgCity, String OrgCountry, Integer OrgZipCode, String OrgEmail, String OrgPhone) {
        super(OrgName, EnterpriseType.Clothing, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
    }
 @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
