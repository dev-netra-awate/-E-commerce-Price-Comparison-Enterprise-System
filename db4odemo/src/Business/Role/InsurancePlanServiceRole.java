/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ItemCatalogue.Items;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InsurancePlanService.InsurancePlanServiceWorkAreaJPanel;

/**
 *
 * @author NetrA
 */
public class InsurancePlanServiceRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business ) {
        return new InsurancePlanServiceWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business );
    }
}