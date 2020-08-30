package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() {

        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(4.0, 1.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 1.5)),
                () -> assertDoesNotThrow(() ->  secondChallenge.probablyIWillThrowException(1.5, 7.5))
        );


    }
}
