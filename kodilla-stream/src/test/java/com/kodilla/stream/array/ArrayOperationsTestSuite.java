package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }

        double result = ArrayOperations.getAverage(numbers);

        Assertions.assertEquals(9.5, result);
    }
}
