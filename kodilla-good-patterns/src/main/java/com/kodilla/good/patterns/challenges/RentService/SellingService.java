package com.kodilla.good.patterns.challenges.RentService;

import java.time.LocalDateTime;

public class SellingService {

    public boolean sell(final User user, final LocalDateTime buyTime, final Integer idSellingItem) {
        System.out.println("ID item:" + idSellingItem + "selling  for:" + user.getName() + " " +
                user.getSurname() + " shopping at:" + buyTime + " to:");
        return true;
    }
}
