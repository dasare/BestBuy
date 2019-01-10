/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxCompClasses;

import storePurchasedItems.*;
import AbstractClasses.*;
import AddOnClasses.*;
import Interfaces.*;
import storePurchasedItems.*;

/**
 *
 * @author dasare
 */
public class MassTaxComputation extends TaxComputationMethod{
        public double computeTax(PurchasedItems items, String date) {
        if (taxHoliday((date))) {
            return items.getTotalCost();
        } else {
            return ((items.getTotalCost() * .0625) + items.getTotalCost());
        }
    }

    @Override
    protected boolean taxHoliday(String date) {


        return date.equals("August 11") || date.equals("August 12");
    }
}
