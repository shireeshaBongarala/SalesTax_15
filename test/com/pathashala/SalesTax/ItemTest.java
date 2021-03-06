package com.pathashala.SalesTax;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ItemTest {

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

    @Test
    public void toGetTheTotalCostOfABottleOfPerfume() {
        Item item = new Item("1 imported bottle of perfume at 27.99");
        item.computeTotalCost();

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 imported bottle of perfume: 32.19"));
    }
    @Test
    public void toGetTheTotalCostOfHeadAchePills() {
        Item item = new Item("1 packet of headache pills at 9.75");
        item.computeTotalCost();

        String actualBill = item.displayOutput();

        assertThat(actualBill,is("1 packet of headache pills: 9.75"));
    }
}
