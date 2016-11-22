package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 22/11/2016.
 */

public class Basket {
    private ArrayList<Item> items;

    public Basket() {
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public int itemCount() {
        return items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem() {
        items.remove(1);
    }

    public void emptyBasket() {
        items.clear();
    }

    public void addBogofItem(Item item) {
        if (item.isBogof()) {
            item.setPrice(0.00);
            items.add(item);
        }
    }

    public double totalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
            if (total > 20.00) {
                total = total * 0.9;
            }
        }
        return total;
    }

//    public void deduct10Percent() {
//        if (totalPrice() > 20.00) {
//            totalPrice() * 0.9;
//        }
//    }

}
