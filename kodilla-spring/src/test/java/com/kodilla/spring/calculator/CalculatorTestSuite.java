package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){
        double add = calculator.add(5,5);
        double sub = calculator.sub(5,5);
        double mul = calculator.mul(5,5);
        double div = calculator.div(5,5);

        assertEquals(10, add);
        assertEquals(0, sub);
        assertEquals(25, mul);
        assertEquals(1, div);
    }
}
