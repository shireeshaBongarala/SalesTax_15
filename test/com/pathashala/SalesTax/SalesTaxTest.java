package com.pathashala.SalesTax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SalesTaxTest {

    @Test
    public void toGetTheTotalCostOfItemIfABook() {
        Item item = new Item("1 book at 12.49");
        item.computeTotalCost();

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 book: 12.49"));
    }
    @Test
    public void toGetTheDifferentTotalCostOfBooks() {
        Item item = new Item("1 book at 12.00");
        item.computeTotalCost();

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 book: 12.00"));
    }
    @Test
    public void toGetTotalCostOfAMusicCD() {
        Item item = new Item("1 music CD at 14.99");
        item.computeTotalCost();

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 music CD: 16.49"));
    }

    @Test
    public void toGetTheTotalCostOfAChocolateBar() {
        Item item = new Item("1 imported box of chocolates at 10.00");
        item.computeTotalCost();

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 imported box of chocolates: 10.50"));

    }
}
