package com.kodilla.good.patterns.challenges.RentService;

import java.time.LocalDateTime;

public class RentRequest {

    private User user;
    private LocalDateTime buyTime;
    private Integer idSellingItem;

    public RentRequest(User user, LocalDateTime buyTime, Integer idSellingItem) {
        this.user = user;
        this.buyTime = buyTime;
        this.idSellingItem = idSellingItem;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getBuyTime() {
        return buyTime;
    }

    public Integer getIdSellingItem() {
        return idSellingItem;
    }

    public void createRental(User user, LocalDateTime buyTime){

    }
}
