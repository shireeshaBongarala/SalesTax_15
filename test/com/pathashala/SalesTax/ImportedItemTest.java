package com.pathashala.SalesTax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ImportedItemTest {
    @Test
    public void shouldHaveZeroTaxOnNonImportedItems() {
        Items item = new NonImportedItem("1 book at 13.90");

        double actualTax = item.getTax();

        assertThat(actualTax, is(0.0));
    }
}
