package com.kodilla.exception.test;

public class ExceptionHandling {
    public ExceptionHandling(){
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(5,1));
        } catch (Exception e) {
            System.out.println("Remember x must be smaller than 2 and grater than 1 and y must be different from 1.5");
        } finally {
            System.out.println("=== Finish divided ===");
        }

    }
}
