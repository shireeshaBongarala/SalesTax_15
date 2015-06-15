package com.pathashala.SalesTax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewItemTest {
    @Test
    public void shouldReturnNonImportedItemWhenItemIsNotImported() {
        NewItem newItem = new NewItem("1 book at 12.90 ");
        Items nonImportedItem = newItem.createItem();

        double actualTax = nonImportedItem.getTax();

        assertThat(actualTax,is(0.0));
    }

    @Test
    public void shouldReturnImportedItemWhenItemIsImported() {
        NewItem newItem = new NewItem("1 imported book at 12.90 ");
        Items importedItem = newItem.createItem();

        double actualTax = importedItem.getTax();

        assertThat(actualTax,is(0.05));
    }
}
