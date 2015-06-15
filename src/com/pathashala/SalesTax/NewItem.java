package com.pathashala.SalesTax;

import java.util.Arrays;

public class NewItem {
    String input;
    NewItem(String input){
        this.input = input;
    }

    public Items createItem(){
        String inputArray[] = input.split(" ");
        if(Arrays.asList(inputArray).contains("imported")) {
            return new ImportedItem(input);
        }
        return new NonImportedItem(input);
    }

}
