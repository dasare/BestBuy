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
public class StoreHeader {

    private String streetAddr;
    private String zip;
    private String stateCode;
    private String phoneNum;
    private String storeNum;
    // e.g., #1004

    public StoreHeader(String streetAddr, String zip, String stateCode, String phoneNum, String storeNum) {
        this.phoneNum = phoneNum;
        this.zip = zip;
        this.stateCode = stateCode;
        this.storeNum = storeNum;
        this.streetAddr = streetAddr;
    }

    /**
     * @return the streetAddr
     */
    public String getStreetAddr() {
        return streetAddr;
    }

    /**
     * @param streetAddr the streetAddr to set
     */
    public void setStreetAddr(String streetAddr) {
        this.streetAddr = streetAddr;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStateCode() {
        return stateCode;
    }

    /**
     * @param stateCode the stateCode to set
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * @return the phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum the phoneNum to set
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * @return the storeNum
     */
    public String getStoreNum() {
        return storeNum;
    }

    /**
     * @param storeNum the storeNum to set
     */
    public void setStoreNum(String storeNum) {
        this.storeNum = storeNum;
    }

    public String toString() {
        return "Address " + getStreetAddr() + "Zip " + getZip() + "State Code " + getStateCode()
                + "Phone Num " + getPhoneNum() + "Store Num " + getStoreNum();

    }
}
