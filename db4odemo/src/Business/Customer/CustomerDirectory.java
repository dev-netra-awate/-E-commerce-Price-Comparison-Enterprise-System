/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
        private ArrayList<Customer> customerDir;

    public CustomerDirectory() {
        customerDir = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDir() {
        return customerDir;
    }

    public void setCustomerDir(ArrayList<Customer> customerDir) {
        this.customerDir = customerDir;
    }
    
    public Customer newCustomer(String customername, String customerphone, int customerage, String customerstreetaddress, String customeremail, String customerusername, String customerpassword, String customercountry, String customercity, int customerzipcode){
        Customer customer = new Customer(customername, customerphone, customerage, customerstreetaddress, customeremail, customerusername, customerpassword, customercountry, customercity, customerzipcode);
        customerDir.add(customer);
        return customer;
    }
    
    public void deleteCustomer(Customer customer){
        customerDir.remove(customer);
    }
    
    public Customer findCustomer(String username){
        for(Customer c: customerDir){
            if(c.getcustomerUsername().equals(username)){
                return c;
            }
                
        }
        return null;
    }
    
    
}
