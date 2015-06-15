package com.pathashala.SalesTax;

public class ImportedItem extends Item implements Items
{
    public ImportedItem(String input) {
        super(input);
    }

    @Override
    public double getTax() {
        return 0.05;
    }
}
