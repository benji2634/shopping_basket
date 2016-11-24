package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/11/2016.
 */

public class CustomerTest {

    Customer customer1;
    Customer customer2;

    @Before
    public void before() {
        customer1 = new Customer(true);
        customer2 = new Customer(false);
    }

    @Test
    public void canCheckIfLoyaltyCustomer() {
        assertEquals(true, customer1.hasLoyaltyCard());
    }

    @Test
    public void canCheckIfNotLoyaltyCustomer() {
        assertEquals(false, customer2.hasLoyaltyCard());
    }
}
