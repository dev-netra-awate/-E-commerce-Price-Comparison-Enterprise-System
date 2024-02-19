/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DoctorsTherapistsRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tarushukla
 */
public class DoctorsTherapistsOrganization extends Organization{
    
    public DoctorsTherapistsOrganization(String OrgName, String OrgAddress, String OrgCity, String OrgCountry, Integer OrgZipCode, String OrgEmail, String OrgPhone) {
        super(Organization.Type.DoctorsTherapists.getValue(), OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorsTherapistsRole());
        return roles;   
    }
    
}
