package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalAddress localAddress = new LocalAddress("London", "Clone", 18);
        ProductsSold productsSold = new ProductsSold("chair", 400);
        Supplier supplier = new Supplier("Korex", localAddress, productsSold);
        Customer customer = new Customer("John", "Kolonko", localAddress);
        LocalDateTime time = LocalDateTime.now();
        Order order = new Order(supplier, customer,time);

        SellingProcess sellingProcess = new SellingProcess(order,new InformationService(customer),new SellingService());

        sellingProcess.process(order);

    }
}
