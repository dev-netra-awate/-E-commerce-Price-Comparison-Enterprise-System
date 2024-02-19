/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ItemCatalogue;

import java.util.ArrayList;

/**
 *
 * @author tarushukla
 */
public class ItemsDirectory {
    private ArrayList<Items> itemsList;

    public ItemsDirectory() {
        this.itemsList = new ArrayList<Items>();
    }

    public ArrayList<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Items> itemsList) {
        this.itemsList = itemsList;
    }
    
    public Items addItem(String name, String desc, String price, int quantity, String state, String sellertailorname, String services){
        Items item = new Items(name, desc, price, quantity, state, sellertailorname, services);
        itemsList.add(item);
        return item;
    }

    public void deleteItem(Items item){
        itemsList.remove(item);
    }
    
    public Items getItem(String name){
        for(Items i : itemsList){
            if(i.getItemname().equalsIgnoreCase(name)){
                return i;
            }
        }
        return null;
    }
}
