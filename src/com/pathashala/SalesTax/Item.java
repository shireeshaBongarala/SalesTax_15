package com.pathashala.SalesTax;

public class Item {
    String input;
    public Item(String input) {
        this.input = input;
    }

    public String displayOutput() {
        String inputArray [] = input.split(" ");
        return inputArray[0] + " " + inputArray[1] + ": "+inputArray[3] ;
    }
}
