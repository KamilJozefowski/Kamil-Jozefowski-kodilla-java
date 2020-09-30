package com.kodilla.good.patterns.food2Door;

public class Supplier {
    private final String companyName;
    private final LocalAddress address;
    private ProductsSold productsSold;

    private boolean activeCompany = false;

    public Supplier(String companyName, LocalAddress address, ProductsSold productsSold) {
        this.companyName = companyName;
        this.address = address;
        this.productsSold = productsSold;
    }

    @Override
    public String toString() {
        return "Supplier: " + companyName + address ;
    }

    private void setActiveCompany(){
        activeCompany = true;
    }

    private void setDeactivatedCompany(){
        activeCompany = false;
    }
}
