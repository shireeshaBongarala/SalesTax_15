package com.pathashala.SalesTax;

public class NonImportedItem implements Items {
    @Override
    public double getTax() {
        return 0;
    }
}
