/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ItemCatalogue.Items;
import Business.ItemCatalogue.ItemsDirectory;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{
  

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business ) {
            System.out.println(account.getUsername() + "role.jsvs");
        return new CustomerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business );
    }
    
    
    
}
