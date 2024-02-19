/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;
//import com.github.javafaker.Faker;
import Business.Orders.Orders;
import com.github.javafaker.Faker;
import java.util.ArrayList;

/**
 *
 * @author harold
 * @author tarushukla
 */
public class Customer {

     private String customername ; 
    private String customerphone;
    private int customerage;
    private String customerstreetaddress;
    private String customercountry;
    private String customercity;
    private int customerzipcode;
    private String customeremail;
    private String customerusername;
    private String customerpassword;
    private int id;
    private static int count = 1000;
    private ArrayList<Orders> orderslist;
    public Customer(String customername, String customerphone, int customerage, String customerstreetaddress, String customeremail, String customerusername, String customerpassword, String customercountry, String customercity, int customerzipcode) {
        this.customername = customername;
        this.customerphone = customerphone;
        this.customerage = customerage;
        this.customerstreetaddress = customerstreetaddress;
        this.customeremail = customeremail;
        this.customerusername = customerusername;
        this.customerpassword = customerpassword;
        this.customercountry = customercountry;
        this.customercity = customercity;
        this.customerzipcode = customerzipcode;
        this.orderslist = new ArrayList<Orders>();
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Orders> getOrderslist() {
        return orderslist;
    }

    public void setOrderslist(ArrayList<Orders> orderslist) {
        this.orderslist = orderslist;
    }
    
    public void newOrderslist(){
        this.orderslist = new ArrayList<Orders>();
    }
    
    public String getcustomerEmail() {
        return customeremail;
    }

    public void setcustomerEmail(String customeremail) {
        this.customeremail = customeremail;
    }

    public String getcustomerPassword() {
        return customerpassword;
    }

    public void setcustomerPassword(String customerpassword) {
        this.customerpassword = customerpassword;
    }
    
    public String getcustomerName() {
         System.out.println(customername);
        return customername;
       
    }

    public void setcustomerName(String customername) {
        this.customername = customername;
    }

    public String getcustomerPhone() {
        return customerphone;
    }

    public void setcustomerPhone(String customerphone) {
        this.customerphone = customerphone;
    }

    public int getcustomerAge() {
        return customerage;
    }

    public void setcustomerAge(int customerage) {
        this.customerage = customerage;
    }

    public String getcustomerStreetAddress() {
        return customerstreetaddress;
    }

    public void setcustomerStreetAddress(String customerstreetaddress) {
        this.customerstreetaddress = customerstreetaddress;
    }

    public String getcustomerUsername() {
        return customerusername;
    }

    public void setcustomerUsername(String customerusername) {
        this.customerusername = customerusername;
    }

    public String getcustomerCountry() {
        return customercountry;
    }

    public void setcustomerCountry(String customercountry) {
        this.customercountry = customercountry;
    }

    public String getcustomerCity() {
        return customercity;
    }

    public void setcustomerCity(String customercity) {
        this.customercity = customercity;
    }

    public int getcustomerZipcode() {
        return customerzipcode;
    }

    public void setcustomerZipcode(int customerzipcode) {
        this.customerzipcode = customerzipcode;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    @Override
    public String toString() {
        return customerusername;
    }
    
}


