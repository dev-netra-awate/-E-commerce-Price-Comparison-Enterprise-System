/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author tarushukla
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String OrgName, String OrgAddress, String OrgCity, String OrgCountry, Integer OrgZipCode, String OrgEmail, String OrgPhone){
        Organization organization = null;
        if (type.getValue().equals(Type.BuyCar.getValue())){
            organization = new BuyCarOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.RentCar.getValue())){
            organization = new RentCarOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CarRideServices.getValue())){
            organization = new CarRideServicesOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ReadyMadeClothes.getValue())){
            organization = new ReadyMadeClothesOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BuyFabric.getValue())){
            organization = new BuyFabricOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TailorService.getValue())){
            organization = new TailorServiceOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ElectronicKit.getValue())){
            organization = new ElectronicKitOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SpareParts.getValue())){
            organization = new SparePartsOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Accessories.getValue())){
            organization = new AccessoriesOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Restaurant.getValue())){
            organization = new RestaurantOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.VeggiesFruits.getValue())){
            organization = new VeggiesFruitsOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FrozenPackaged.getValue())){
            organization = new FrozenPackagedOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Medicine.getValue())){
            organization = new MedicineOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.DoctorsTherapists.getValue())){
            organization = new DoctorsTherapistsOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Hospitals.getValue())){
            organization = new HospitalsOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InsurancePlanService.getValue())){
            organization = new InsurancePlanServiceOrganization(OrgName, OrgAddress, OrgCity, OrgCountry, OrgZipCode, OrgEmail, OrgPhone);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void removeOrganization(Organization org){
        organizationList.remove(org);
    }
    
    public Organization getOrganization(String name){
        for(Organization o : organizationList){
            if(o.getOrgName().equalsIgnoreCase(name)){
                return o;
            }
        }
        return null;
    }
}
