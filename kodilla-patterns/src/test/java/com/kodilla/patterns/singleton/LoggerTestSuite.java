package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testGetLastLog(){
        //Given
        Logger logger = Logger.INSTANCE;
        //When
        logger.log("test Log");
        //Then
        assertEquals("test Log", logger.getLastLog());
    }
}
