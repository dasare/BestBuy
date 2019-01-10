/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxCompClasses;

import AbstractClasses.*;
import AddOnClasses.*;
import Interfaces.*;
import storePurchasedItems.*;

/**
 *
 * @author dasare
 */
public class CaliTaxComputation extends TaxComputationMethod {

    @Override
    public double computeTax(PurchasedItems items, String date) {

        return ((items.getTotalCost() * .075) + items.getTotalCost());

    }

    @Override
    protected boolean taxHoliday(String date) {
        return false;
    }

}
