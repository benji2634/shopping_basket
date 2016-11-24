package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/11/2016.
 */

public class BasketTest {

    Customer customer1;
    Basket basket;
    Item item1;
    Item item2;
    Item item3;

    @Before
    public void before() {
        customer1 = new Customer(true);
        basket = new Basket();
        item1 = new Item("Diet Coke", 1.99, true);
        item2 = new Item("Jeans", 20.00, false);
        item3 = new Item("Pepsi Max", 0.99, false);
        basket.addItem(item1);
        basket.addItem(item2);
    }

    @Test
    public void canGetItems() {
        assertEquals(item1, basket.getItems().get(0));
    }

    @Test
    public void canCountItems() {
        assertEquals(2, basket.itemCount());
    }

    @Test
    public void canAddItem() {
        basket.addItem(item3);
        assertEquals(3, basket.itemCount());
    }

    @Test
    public void canRemoveItem() {
        basket.removeItem();
        assertEquals(1, basket.itemCount());
    }

    @Test
    public void canEmptyBasket() {
        basket.emptyBasket();
        assertEquals(0, basket.itemCount());
    }

    @Test
    public void addFreeItemIfBogof() {
        basket.addBogofItem(item1);
        assertEquals(3, basket.itemCount());
    }

    @Test
    public void canGetTotalPrice() {
        assertEquals(19.39, basket.totalPrice(customer1), 0.01);
    }

}
