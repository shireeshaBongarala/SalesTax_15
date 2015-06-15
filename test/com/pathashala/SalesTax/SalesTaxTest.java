package com.pathashala.SalesTax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SalesTaxTest {

    @Test
    public void toGetTheTotalCostOfItemIfABook() {
        Item item = new Item("1 book at 12.49");

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 book: 12.49"));
    }
}
