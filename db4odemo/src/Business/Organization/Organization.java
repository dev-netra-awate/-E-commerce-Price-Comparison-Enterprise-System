/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Orders.Orders;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.ServiceWorkRequest;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tarushukla
 */
public abstract class Organization {
    private String OrgName;
    private String OrgPhone;
    private String OrgAddress;
    private String OrgCountry;
    private String OrgCity;
    private Integer OrgZipCode;
    private String OrgEmail;
    private String type;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private CustomerDirectory customerdirectory;
    private UserAccountDirectory userAccountDirectory;
    private ItemsDirectory itemsDirectory;
    private ArrayList<Orders> ordersList;
    private ArrayList<Orders> deliveryOrderList;
    private ArrayList<Orders> inventoryOrderList;
    private ArrayList<ServiceWorkRequest> requestList;
    private int OrgID;
    

    
    public enum Type{
        Admin("Admin Organization"), BuyCar("Buy Car"), RentCar("Rent Car"), CarRideServices("Car Ride Services"), ReadyMadeClothes("Ready Made Clothes"), BuyFabric("Buy Fabric"), TailorService("Tailor Service"), ElectronicKit("Electronic Kit"), SpareParts("Spare Parts"), Accessories("Accessories"), Restaurant("Restaurant"), VeggiesFruits("Veggies Or Fruits"), FrozenPackaged("Frozen or Packaged"), Medicine("Medicine"), DoctorsTherapists("Doctors or Therapists"), Hospitals("Hospital"), InsurancePlanService("Insurance Plan Service");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
      public Organization(String OrgType, String OrgName, String OrgAddress, String OrgCity, String OrgCountry, Integer OrgZipCode, String OrgEmail, String OrgPhone) {
        this.OrgName = OrgName;
        this.type = type;
        this.OrgAddress = OrgAddress;
        this.OrgEmail = OrgEmail;
        this.OrgCountry = OrgCountry;
        this.OrgCity = OrgCity;
        this.OrgZipCode = OrgZipCode;
        this.OrgPhone = OrgPhone;
        workQueue = new WorkQueue();
         employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        customerdirectory = new CustomerDirectory();
        itemsDirectory = new ItemsDirectory();
        ordersList = new ArrayList<Orders>();
        deliveryOrderList = new ArrayList<Orders>();
        inventoryOrderList = new ArrayList<Orders>();
        requestList = new ArrayList<ServiceWorkRequest>();
        OrgID = gen();
        
    }
      public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
    public abstract ArrayList<Role> getSupportedRole();

    public ArrayList<ServiceWorkRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<ServiceWorkRequest> requestList) {
        this.requestList = requestList;
    }
    
    public void newRequestList(){
        this.requestList = new ArrayList<ServiceWorkRequest>();
    }
    public String getType() {
        return type;
    }

    public ArrayList<Orders> getDeliveryOrderList() {
        return deliveryOrderList;
    }

    public void setDeliveryOrderList(ArrayList<Orders> deliveryOrderList) {
        this.deliveryOrderList = deliveryOrderList;
    }
    
    public void newDeliveryOrdersList(){
        this.deliveryOrderList = new ArrayList<Orders>();
    }
    
    public void newInvetoryOrdersList(){
        this.inventoryOrderList = new ArrayList<Orders>();
    }

    public ArrayList<Orders> getInventoryOrderList() {
        return inventoryOrderList;
    }

    public void setInventoryOrderList(ArrayList<Orders> inventoryOrderList) {
        this.inventoryOrderList = inventoryOrderList;
    }
    
    
    
    public void newordersList(){
        this.ordersList = new ArrayList<Orders>();
    }
    
    public ArrayList<Orders> getOrders() {
        return ordersList;
    }

    public void setOrders(ArrayList<Orders> ordersList) {
        this.ordersList = ordersList;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public ItemsDirectory getItemsDirectory() {
        return itemsDirectory;
    }

public void setItemsDirectory(ItemsDirectory itemsDirectory) {
        this.itemsDirectory = itemsDirectory;
    }
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public CustomerDirectory getCustomerdirectory() {
        if(customerdirectory == null){
            customerdirectory = new CustomerDirectory();
        }
        return customerdirectory;
    }

    public void setCustomerdirectory(CustomerDirectory customerdirectory) {
        this.customerdirectory = customerdirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
  

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    public String getOrgPhone() {
        return OrgPhone;
    }

    public void setOrgPhone(String OrgPhone) {
        this.OrgPhone = OrgPhone;
    }

    public String getOrgAddress() {
        return OrgAddress;
    }

    public void setOrgAddress(String OrgAddress) {
        this.OrgAddress = OrgAddress;
    }

    public String getOrgCountry() {
        return OrgCountry;
    }

    public void setOrgCountry(String OrgCountry) {
        this.OrgCountry = OrgCountry;
    }

    public String getOrgCity() {
        return OrgCity;
    }

    public void setOrgCity(String OrgCity) {
        this.OrgCity = OrgCity;
    }

    public Integer getOrgZipCode() {
        return OrgZipCode;
    }

    public void setOrgZipCode(Integer OrgZipCode) {
        this.OrgZipCode = OrgZipCode;
    }

    public String getOrgEmail() {
        return OrgEmail;
    }

    public void setOrgEmail(String OrgEmail) {
        this.OrgEmail = OrgEmail;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getOrgID() {
        return OrgID;
    }

    public void setOrgID(int OrgID) {
        this.OrgID = OrgID;
    }
    @Override
    public String toString() {
        return OrgName;
    }
  
}

