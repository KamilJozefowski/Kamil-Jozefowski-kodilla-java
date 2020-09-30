package com.kodilla.good.patterns.challenges.RentService;

public class SellingDto {

    public User user;
    public boolean isRented;

    public SellingDto(final User user, final boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isRented;
    }
}
