package com.kodilla.good.patterns.food2Door;

public class ProductsSold {
    private final String nameProduct;
    private int quantity;

    public ProductsSold(String nameProduct, int quantity) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
    }

    public String getProductSold(){
        return nameProduct + " qty: " + quantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }
}

