package com.pathashala.SalesTax;

public class NonImportedItem extends Item implements Items {

    public NonImportedItem(String input) {
        super(input);
    }

    @Override
    public double getTax() {
        return 0;
    }
}
