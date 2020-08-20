package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = {12, 31, 46, 9, 54, 51, 31, 0, 11, 34, 35, 12, 117, 6, 15, 147, 36, 68, 78, 40};

        //When
        double expectedAverage = 41.65;
        double averageByTestedMethod =  ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(expectedAverage, averageByTestedMethod);
    }
}