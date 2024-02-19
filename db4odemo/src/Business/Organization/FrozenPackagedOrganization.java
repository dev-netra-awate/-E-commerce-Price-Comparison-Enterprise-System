/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.FrozenPackagedRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tarushukla
 */
public class FrozenPackagedOrganization extends Organization{
    
    public FrozenPackagedOrganization(String OrgName, String OrgAddress, String OrgCity, String OrgCountry, Integer OrgZipCode, String OrgEmail, String OrgPhone) {
        super(Organization.Type.FrozenPackaged.getValue(), OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FrozenPackagedRole());
        return roles;   
    }
    
}
