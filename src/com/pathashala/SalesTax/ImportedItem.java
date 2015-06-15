package com.pathashala.SalesTax;

public class ImportedItem implements Items
{
    @Override
    public double getTax() {
        return 0.05;
    }
}
