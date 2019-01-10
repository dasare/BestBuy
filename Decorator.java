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
public abstract class Decorator implements Receipt {

    private Receipt trailer;
    public AddOn a;//may need to be private.// check predecorator class...printMethod

    public Decorator(Receipt r, AddOn a) {
        trailer = r;
        this.a = a;
    }

    protected void callTrailer() {
        trailer.printReceipt();
    }

    public abstract void printReceipt();
}
