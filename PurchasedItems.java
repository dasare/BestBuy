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
import java.util.*;

/**
 *
 * @author dasare
 */
public class PurchasedItems {

    private ArrayList<StoreItem> items;

    public PurchasedItems() {
        items = new ArrayList();
    }

    public void addItem(StoreItem item) {
        items.add(item);
    }

    public double getTotalCost() {
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            total += Double.parseDouble(items.get(i).getItemPrice());
        }
        return total;

    }

    public boolean containsItem(String itemCode) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemCode().equals(itemCode)) {
                return true;
            } else {

            }
        }
        return false;
    }
    
    public String toString(){
        return items.toString();
    }
}
