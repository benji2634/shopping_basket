package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/11/2016.
 */

public class ItemTest {

    Item item;

    @Before
    public void before() {
        item = new Item("Irn-Bru Xtra", 1.49, true);
    }

    @Test
    public void canGetName() {
        assertEquals("Irn-Bru Xtra", item.getName());
    }

    @Test
    public void canSetName() {
        item.setName("Irn-Bru");
        assertEquals("Irn-Bru", item.getName());
    }

    @Test
    public void canGetPrice() {
        assertEquals(1.49, item.getPrice(), 0.01);
    }

    @Test
    public void canSetPrice() {
        item.setPrice(1.59);
        assertEquals(1.59, item.getPrice(), 0.01);
    }

    @Test
    public void canCheckIfBogof() {
        assertEquals(true, item.isBogof());
    }

}
