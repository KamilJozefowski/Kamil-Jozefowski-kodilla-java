package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share(){
        return "Favorite social media -> Snapchat";
    }
}
