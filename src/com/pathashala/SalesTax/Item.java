package com.pathashala.SalesTax;

import java.util.Arrays;

public class Item {
    String input;
    String itemName;
    int itemQuantity;
    double itemPrice;
    private double tax;
    private double sellingPrice;
    String inputArray[];
    public Item(String input) {
        this.input = input;
       inputArray = input.split(" ");
        itemQuantity = Integer.parseInt(inputArray[0]);
        itemName = "";
        for(int i = 1 ; i < inputArray.length -2 ; i++) {
            itemName += " "+ inputArray[i];
        }
        itemPrice = Double.parseDouble(inputArray[inputArray.length-1]);
        tax = 0.0;
        sellingPrice = itemPrice;
    }

    public String displayOutput() {
        String formattedItemPrice = String.format("%.2f", sellingPrice);
       return itemQuantity + "" + itemName + ": "+ formattedItemPrice;
    }
    public void computeTotalCost( ) {
        if(Arrays.asList(inputArray).contains("imported")){
            tax += 0.05;
        }
        if (Arrays.asList(inputArray).contains("book")||Arrays.asList(inputArray).contains("chocolates")) {
            tax += 0.0;
        } else {
            tax += 0.10;
        }
        sellingPrice = itemPrice * (1 + tax);
    }


}
