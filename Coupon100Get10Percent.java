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
public class Coupon100Get10Percent implements Coupon {

    public boolean applies(PurchasedItems items) {
        return items.getTotalCost() >= 100;
    }

    public String getLines() {
        return "You've spent more than $100. Take this coupon for 10% off your next purchase ";
    }
}
