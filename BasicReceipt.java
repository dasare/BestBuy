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
import AbstractClasses.*;

/**
 *
 * @author dasare
 */
public class BasicReceipt implements Receipt {

    private StoreHeader storeHeader; // street address, state code, phone number, store number private TaxComputationMethod tc;
    private String date; // may also be a String type
    private PurchasedItems items;
    private TaxComputationMethod tc;

    public BasicReceipt(PurchasedItems items, String date) { // Date may also be a String type
        this.items = items;
        this.date = date;
    }

    public void setStoreHeader(StoreHeader h) {
        storeHeader = h;
    }

    public void setTaxComputationMethod(TaxComputationMethod tc) {
        this.tc = tc;
    }

    public void printReceipt() {
        System.out.println("Store: " + storeHeader.getStoreNum() + "\nState: "
                + storeHeader.getStateCode() + "\nPurchase Date: " + getDate() + "\nItems:" + items);
    }

    /**
     * @return the storeHeader
     */
    public StoreHeader getStoreHeader() {
        return storeHeader;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the items
     */
    public PurchasedItems getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(PurchasedItems items) {
        this.items = items;
    }

    /**
     * @return the tc
     */
    public TaxComputationMethod getTc() {
        return tc;
    }

}
