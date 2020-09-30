package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.RentService.*;

import java.time.LocalDateTime;

public class ProductOrderService {

    public static void main(String[] args) {

        User user = new User("Max", "Smith");
        LocalDateTime buyTime = LocalDateTime.now();


        RentRequest rentRequest = new RentRequest(user, buyTime, 1697);

        SellingProcess sellingProcess = new SellingProcess(new InformationService(user), new SellingService(), new SellRepository());

        sellingProcess.process(rentRequest);

    }
}
