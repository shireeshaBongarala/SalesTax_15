package com.pathashala.SalesTax;



import java.util.ArrayList;
import java.util.Scanner;

public class SalesTax {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        double costPrice = 0.0;
        double sellingPrice = 0.0;
        ArrayList<Item> itemArrayList = new ArrayList<>() ;

        System.out.print("Enter no. of items");
        int numberOfItems = scanner.nextInt();

        for(int i = 0;i < numberOfItems;i++ ) {
            Scanner scannerForItem = new Scanner(System.in);
            String line = scannerForItem.nextLine();
            Item item = new Item(line);
            itemArrayList.add(item);
            item.computeTotalCost();
            costPrice += item.getItemPrice();
            sellingPrice += item.getSellingPrice();
        }

       for(Item item : itemArrayList){
           System.out.println(item.displayOutput());
       }
        System.out.println("Sales Tax:"+String.format("%.2f", (sellingPrice - costPrice)));
        System.out.println("Total:" + String.format("%.2f",sellingPrice));

    }
}

