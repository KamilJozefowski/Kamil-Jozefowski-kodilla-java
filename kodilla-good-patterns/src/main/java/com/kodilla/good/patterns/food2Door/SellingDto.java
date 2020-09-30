package com.kodilla.good.patterns.food2Door;

public class SellingDto {

    public Order order;
    public boolean isRented;

    public SellingDto( Order order, final boolean isRented) {
        this.order = order;
        this.isRented = isRented;
    }

    public Order getUser() {
        return order;
    }

    public boolean isRented() {
        return isRented;
    }
}