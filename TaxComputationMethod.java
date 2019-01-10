/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses;

import Interfaces.*;
import AddOnClasses.*;
import DecoratorClasses.*;
import FactoryClasses.*;
import storePurchasedItems.*;
import TaxCompClasses.*;

/**
 *
 * @author dasare
 */
public abstract class TaxComputationMethod {

    public abstract double computeTax(PurchasedItems items, String date);

    protected abstract boolean taxHoliday(String date);
}
