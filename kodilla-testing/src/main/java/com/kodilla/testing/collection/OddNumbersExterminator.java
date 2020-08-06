package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    private List<Integer> OddNumbersList = new ArrayList<>();

    public OddNumbersExterminator(){}

    public List<Integer> exterminate(List<Integer> numbers){

        for(int a = 0 ; a < numbers.size(); a++ ){
            if ((numbers.get(a) % 2) == 0) {
                OddNumbersList.add(numbers.get(a));
            }
        }
        return OddNumbersList;
    }
}
