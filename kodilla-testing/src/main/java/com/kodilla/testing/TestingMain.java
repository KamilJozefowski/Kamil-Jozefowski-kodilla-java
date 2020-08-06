package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        if (calculator.add(4,6)== 10){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (calculator.subtract(4,6)== -2){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        //6.3 Zadanie: test klasy wybierającej parzyste liczby z kolekcji
        List<Integer> listOfNumber = new ArrayList<>();

        for (int a = 0; a < 100 ; a++){
            listOfNumber.add(a);
        }

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(listOfNumber);

    }
}