/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddOnClasses;
import Interfaces.*;
import DecoratorClasses.*;
import FactoryClasses.*;
import storePurchasedItems.*;
import TaxCompClasses.*;

/**
 *
 * @author dasare
 */
public class HolidayGreeting implements SecondaryHeading {
    public boolean applies(PurchasedItems items){
        return true; //SecondaryHeading decorators always applied
    }
    
    public String getLines(){
        return "* Happy Holidays from Best Buy";
    }
}
