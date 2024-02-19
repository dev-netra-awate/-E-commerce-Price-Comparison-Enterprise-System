/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ItemCatalogue;

/**
 *
 * @author tarushukla
 */
public class Items {
    private String itemname;
    private String itemdesc;
    private String itemprice;
    private int itemquantity;
    private String itemstate;
    private String itemsellertailorname;
    private String itemservices;

    
    

    public Items(String itemname, String itemdesc, String itemprice, int itemquantity, String itemstate, String itemsellertailorname, String itemservices) {
       // public Items(String itemname, String itemdesc, String itemprice, int itemquantity) {
    
        this.itemname = itemname;
        this.itemdesc = itemdesc;
        this.itemprice = itemprice;
        this.itemquantity = itemquantity;
        this.itemstate = itemstate;
        this.itemsellertailorname = itemsellertailorname;
        this.itemservices = itemservices;
    }

    
      
    
    @Override
    public String toString() {
        return itemname;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc;
    }

    public String getItemprice() {
        return itemprice;
    }

    public void setItemprice(String itemprice) {
        this.itemprice = itemprice;
    }

    public int getItemquantity() {
        return itemquantity;
    }

    public void setItemquantity(int itemquantity) {
        this.itemquantity = itemquantity;
    }

    public String getItemstate() {
        return itemstate;
    }

    public void setItemstate(String itemstate) {
        this.itemstate = itemstate;
    }

    public String getItemsellertailorname() {
        return itemsellertailorname;
    }

    public void setItemsellertailorname(String itemsellertailorname) {
        this.itemsellertailorname = itemsellertailorname;
    }

    public String getItemservices() {
        return itemservices;
    }

    public void setItemservices(String itemservices) {
        this.itemservices = itemservices;
    }
    
    
}
