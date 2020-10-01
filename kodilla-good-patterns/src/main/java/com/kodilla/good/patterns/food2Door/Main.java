package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        LocalAddress localAddressCustomer = new LocalAddress("London", "George st", 46);
        Customer customer = new Customer("John", "Kolonko", localAddressCustomer);
        LocalDateTime time = LocalDateTime.now();

        //ExtraFoodShop company
        LocalAddress localAddress = new LocalAddress("London", "Clone st", 18);
        ProductsSold productsSold = new ProductsSold("corn", 400);
        Supplier supplier = new Supplier("ExtraFoodShop", localAddress, productsSold);

        //HealthyShop company
        LocalAddress localAddress1 = new LocalAddress("London", "the Mall", 6);
        ProductsSold productsSold1 = new ProductsSold("bio apple", 1200);
        Supplier supplier1 = new Supplier("HealthyShop", localAddress1, productsSold1);

        //GlutenFreeShop company
        LocalAddress localAddress2 = new LocalAddress("London", "Ogle st", 112);
        ProductsSold productsSold2 = new ProductsSold("cheese", 57);
        Supplier supplier2 = new Supplier("GlutenFreeShop", localAddress2, productsSold2);

        Order order = new Order(supplier, customer,time);
        Order order1 = new Order(supplier1, customer,time);
        Order order2 = new Order(supplier2, customer,time);


        SellingProcess sellingProcess = new SellingProcess(order,new InformationService(customer),new SellingService());

        sellingProcess.process(order);
        sellingProcess.process(order1);
        sellingProcess.process(order2);

    }
}
