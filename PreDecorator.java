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
//displays text at top of a receipt
public class PreDecorator extends Decorator {
    
    public PreDecorator(Receipt r, AddOn a){
        super(r,a);
    }
    
    public void printReceipt(){
            System.out.println(a.getLines());
            callTrailer();
    }
}
