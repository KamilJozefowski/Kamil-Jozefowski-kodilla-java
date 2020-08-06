package com.kodilla.testing.collectionTest;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("Test when list is empty" )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        Integer oddNumberInArray [] = new Integer[] { 1, 23, 33, 13 };
        List<Integer> tempNumber = new ArrayList<>();

        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> oddNumber = Arrays.asList(oddNumberInArray);

        //Then
        Assertions.assertEquals(oddNumbersExterminator.exterminate(oddNumber), tempNumber);
    }
    @DisplayName("Only even numbers are after metod OddNumbersExterminator" )
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        Integer allNumberInArray [] = new Integer[] { 1, 20, 33, 88 };
        Integer evenNumberInArray [] = new Integer[] { 20, 88 };

        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> allNumber = Arrays.asList(allNumberInArray);
        List<Integer> evenNumber = Arrays.asList(evenNumberInArray);

        //Then
        Assertions.assertEquals(oddNumbersExterminator.exterminate(allNumber), evenNumber);
    }
}
