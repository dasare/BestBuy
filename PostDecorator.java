/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorClasses;

import Interfaces.*;
import AddOnClasses.*;
import FactoryClasses.*;
import storePurchasedItems.*;
import TaxCompClasses.*;
import AbstractClasses.*;

/**
 *
 * @author dasare
 */
public class PostDecorator extends Decorator {

    public PostDecorator(Receipt r, AddOn a) {
        super(r, a);
    }

    @Override
    public void printReceipt() {
        callTrailer();
        System.out.println(a.getLines());

    }
}
