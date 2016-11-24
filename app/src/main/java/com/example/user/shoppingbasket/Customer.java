package com.example.user.shoppingbasket;

/**
 * Created by user on 23/11/2016.
 */

public class Customer {

    private boolean loyaltyCard;

    public Customer(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public boolean hasLoyaltyCard() {
        return this.loyaltyCard;
    }
}
