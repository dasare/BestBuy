/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryClasses;

import DecoratorClasses.*;
import Interfaces.*;
import AddOnClasses.*;
import storePurchasedItems.*;
import TaxCompClasses.*;
import AbstractClasses.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author dasare
 */
public class ReceiptFactory {

    StoreHeader storeHeader;
    TaxComputationMethod taxComp;
    private TaxComputationMethod[] taxComputationObjs = {new MDTaxComputation()};//tax comp objects for each state
    //private AddOn addOns;//secondary heading, rebate and coupon addons(hardcoded)
    private final AddOn[] addon = {new HolidayGreeting(), new Rebate1406(), new Coupon100Get10Percent()};

    public ReceiptFactory() throws FileNotFoundException {
        taxComputationObjs = new TaxComputationMethod[10];
        this.taxComputationObjs = new TaxComputationMethod[]{new MDTaxComputation(), new CaliTaxComputation(), new MassTaxComputation()};

        // constructor
        //Store Header info array
        String[] sHeader;
        sHeader = new String[5];
        storeHeader = new StoreHeader(sHeader[0], sHeader[1], sHeader[2], sHeader[3], sHeader[4]);
        if (sHeader[1].equals("MD")) {
            taxComp = this.taxComputationObjs[0];
        } else if (sHeader[1].equals("CA")) {
            taxComp = this.taxComputationObjs[1];
        } else {
            taxComp = this.taxComputationObjs[2];
        }

//        File file = new File("");
//        Scanner in = new Scanner(file);
//
//        while (in.hasNextLine()) {
//            System.out.println(in.nextLine());
//        }
//        in.close();
        File file = new File("/Users/dasare/Documents/Senior Year of Towson/COSC 436/Assignment 4(BestBuy)/BestBuy/src/AbstractClasses/MdConfigFile");
        Scanner in = new Scanner(file);
        in.useDelimiter("\\Z");
        System.out.println(in.next());

    }

    public Receipt getReceipt(PurchasedItems items, String date) {
        double tax;
        double includeTax;
        double excludeTax;
        BasicReceipt br = new BasicReceipt(items, date);
        br.setStoreHeader(storeHeader);
        br.setTaxComputationMethod(taxComp);

        Decorator d = new PreDecorator(br, addon[0]);
        for (int i = 0; i <= 2; i++) {

            if (addon[i].applies(items)) {
                if (i == 0);
                d = new PreDecorator(br, addon[i]);
                d.printReceipt();

                //subtotal(before tax)
                excludeTax = items.getTotalCost();
                System.out.println("Subtotal: " + excludeTax);
                System.out.println();
                //Shows total cost(including tax)
                includeTax = taxComp.computeTax(items, date);
                System.out.println("Total:" + includeTax);
                System.out.println();
                //Displays tax amount
                tax = includeTax - excludeTax;
                System.out.println("Tax Amount: " + tax);
                System.out.println();

            } else {
                d = new PostDecorator(br, addon[i]);

            }
            d.printReceipt();

        }
        return d;

    }
}
