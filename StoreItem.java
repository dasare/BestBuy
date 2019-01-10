/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storePurchasedItems;

import Interfaces.*;
import AddOnClasses.*;
import DecoratorClasses.*;
import FactoryClasses.*;
import TaxCompClasses.*;

/**
 *
 * @author dasare
 */
public class StoreItem {

    private String itemCode;
    private String itemDescription;
    private String itemPrice;
// e.g., 3010
// e.g., Dell Laptop

    public StoreItem(String itemCode, String itemDescription, String itemPrice) 
    {
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }
    
    
// appropriate getters and setters  

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @param itemDescription the itemDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * @return the itemPrice
     */
    public String getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    public String toString(){
        return "Item Code: " + getItemCode() + "Item description" + getItemDescription() + "Price " + getItemPrice();
    }
}
