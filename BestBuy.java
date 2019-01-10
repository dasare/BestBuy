/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestbuy;

import AbstractClasses.*;
import Interfaces.*;
import AddOnClasses.*;
import DecoratorClasses.*;
import FactoryClasses.*;
import storePurchasedItems.*;
import TaxCompClasses.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author dasare
 */
public class BestBuy {
//structural, behavioral, creational

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        String date = "";
        PurchasedItems boughtItems = new PurchasedItems();
        ReceiptFactory factory = new ReceiptFactory();
        cashRegister(factory);

    }

    public static void cashRegister(ReceiptFactory receipt) throws FileNotFoundException {

        PurchasedItems boughtItems = new PurchasedItems();
        int choice;
        StoreItem[] items = {new StoreItem("123", "Xbox One", "200.00"),
            new StoreItem("256", "Macbook Pro 13 inch Retina", "1900"),
            new StoreItem("687", "Bose Soundlink Mini", "150.00")};

        ReceiptFactory rf = new ReceiptFactory();
        Scanner usrDate = new Scanner(System.in);
        //PurchasedItems items = new PurchasedItems();
        String date = "";
        ReceiptFactory factory = new ReceiptFactory();

        Scanner in = new Scanner(System.in);

        do {
            viewInterface();
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter date: "
                            + "(format - Month Day. ex: December 27");
                    date = usrDate.nextLine();
                    factory = new ReceiptFactory();
                    boughtItems = new PurchasedItems();
                    break;

                case 2:
                    displayPurchasedItems(items);
                    int addNewItem = in.nextInt();
                    boughtItems.addItem(items[addNewItem]);
                    break;

                case 3:

                    Receipt myReceipt = receipt.getReceipt(boughtItems, date);
                    break;
            }
        } while (choice != 0);

    }

    public static void viewInterface() {
        System.out.println("1- Start New receipt");
        System.out.println("2- Add Items");
        System.out.println("3- Display Receipt");

    }

    public static void displayPurchasedItems(StoreItem[] itemList) {
        for (int i = 0; i < itemList.length; i++) {
            System.out.println((i + 1) + ") " + itemList[i].toString());
        }

    }
}

//        // 2. Creates a PurchasedItems object (selections made by user)
//        StoreItem[] items = {new StoreItem("123", "Xbox One", "200.00"),
//            new StoreItem("256", "Macbook Pro 13 inch Retina", "1900"), new StoreItem("687", "Bose Soundlink Mini", "150.00")};
//        String date = "";
//        PurchasedItems purchased = new PurchasedItems();
//
//        int choice;
//        Scanner usrDate = new Scanner(System.in);
//        //PurchasedItems items = new PurchasedItems();
//        String date = "";
//        ReceiptFactory factory = new ReceiptFactory();
//        Receipt receipt;
//        receipt = factory.getReceipt(items, date);
//
//        Scanner in = new Scanner(System.in);
//
//        do {
//            viewInterface();
//            choice = in.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Please enter date: "
//                            + "(format - Month Day. ex: August 19");
//                    date = usrDate.nextLine();
//                    factory = new ReceiptFactory();
//                    items = new PurchasedItems();
//                    break;
//
//                case 2:
//                    display(listItems);
//                    int addNewItem = in.nextInt();
//                    items.addItem(listItems[addNewItem]);
//                    break;
//
//                case 3:
//
//                    receipt = factory.getReceipt(items, date);
//                    receipt.printReceipt();
//                    break;
//            }
//        } while (choice != 0);
//
//    }
//    //StoreItem newItem = new StoreItem();
//
//// 3. Constructs a ReceiptFactory object.
//// 3. Prompts user for items to purchase, storing each in PurchasedItems.
//// 4. Calls the getReceipt method of the factory to obtain constructed receipt. // 5. Prints receipt by call to method prtReceipt.
//// get receipt date
//// (prompt user for current date)
//// display all available store items to user (to be implemented)
//// get all user selections (to be implemented)
//    
//    
//        
//        }
//    }

