package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class SecendChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException(){
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        ExceptionHandling firstTest = new ExceptionHandling(1,1);
        ExceptionHandling secendTest = new ExceptionHandling(1,1.5);
        ExceptionHandling thirdTest = new ExceptionHandling(3,1.5);

        // when & then
        assertDoesNotThrow(() -> firstTest);
        assertDoesNotThrow (()-> secendTest);
        assertDoesNotThrow (()-> thirdTest);
    }
}
