package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class Order {

    private final Supplier supplier;
    private final Customer customer;
    private final LocalDateTime orderTime;

    public Order(Supplier supplier, Customer customer, LocalDateTime orderTime) {
        this.supplier = supplier;
        this.customer = customer;
        this.orderTime = orderTime;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
