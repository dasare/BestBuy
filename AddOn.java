/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import AddOnClasses.*;
import DecoratorClasses.*;
import FactoryClasses.*;
import storePurchasedItems.*;
import TaxCompClasses.*;

/**
 *
 * @author dasare
 */
public interface AddOn {// the type of added info to a BasicReceipt (e.g., greetings, rebates, coupons)
    public boolean applies(PurchasedItems items);
    public String getLines();
}
