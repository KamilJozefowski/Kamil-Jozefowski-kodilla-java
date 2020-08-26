package com.kodilla.exception.test;

public class ExceptionHandling {

    private double x;
    private double y;

    public ExceptionHandling(double x, double y){
        this.x = x;
        this.y = y;
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(x,y));
        } catch (Exception e) {
            System.out.println("Remember x must be smaller than 2 and grater than 1 and y must be different from 1.5");
        } finally {
            System.out.println("=== Finish divided ===");
        }

    }
}
