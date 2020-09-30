package com.kodilla.good.patterns.challenges.RentService;

import java.time.LocalDateTime;

public class RentalRepository {
    public void createOrder(User user, LocalDateTime buyTime, Integer idSellingItem) {
        System.out.println("Create order User: " + user + " Time: " + buyTime + " ID items: " + idSellingItem);
    }
}
