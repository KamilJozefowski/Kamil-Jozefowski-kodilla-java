package com.kodilla.good.patterns.food2Door;

public class SellingService {

    public boolean sell(final Order order) {
        System.out.println("ORDER ACCEPT Supplier:" + order.getSupplier() + " Customer: " + order.getCustomer());
        return true;
    }
}

