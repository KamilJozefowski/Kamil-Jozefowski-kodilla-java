package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.AccessControlContext;
import java.security.AccessController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(5,5);
        double sub = calculator.sub(5,5);
        double mul = calculator.mul(5,5);
        double div = calculator.div(10,5);

        //Then
        assertEquals(10,add);
        assertEquals(0,sub);
        assertEquals(25,mul);
        assertEquals(2,div);

    }
}
