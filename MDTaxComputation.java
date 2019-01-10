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
public class MDTaxComputation extends TaxComputationMethod {

    public double computeTax(PurchasedItems items, String date) {
        if (taxHoliday((date))) {
            return items.getTotalCost();
        } else {
            return ((items.getTotalCost() * .06) + items.getTotalCost());
        }
    }

    @Override
    protected boolean taxHoliday(String date) {
//        //find dates for tax free week in MD
//        if(date == "4" || date == "3")
//        {
//            return true;
//        }
//        else 
//            return false;
//    }

        return date.equals("August 14") || date.equals("August 15") || date.equals("August 16")
                || date.equals("August 17") || date.equals("August 18") || date.equals("August 19") || date.equals("August 20");
    }

}
