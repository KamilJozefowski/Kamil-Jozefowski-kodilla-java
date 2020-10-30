package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Smith Reece");
        User user2 = new YGeneration("Miller Ava");
        User user3 = new ZGeneration("Brown Oliver");

        //When
        String user1Media = user1.sharePost();
        System.out.println("Reece: " + user1Media);
        String user2Media = user2.sharePost();
        System.out.println("Ava: " +user2Media);
        String user3Media = user3.sharePost();
        System.out.println("Oliver: " +user3Media);

        //Then
        assertEquals("Favorite social media -> Twitter", user1Media);
        assertEquals("Favorite social media -> Facebook", user2Media);
        assertEquals("Favorite social media -> Snapchat", user3Media);

    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User user = new YGeneration("Miller Ava");

        //When
        String userMedia = user.sharePost();
        System.out.println("Ava: " +userMedia);
        user.setSocialPublisher(new TwitterPublisher());
        userMedia = user.sharePost();
        System.out.println("Ava: " +userMedia);


        //Then
        assertEquals("Favorite social media -> Twitter", userMedia);

    }

}
