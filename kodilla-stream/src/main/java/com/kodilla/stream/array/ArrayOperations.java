package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        numbers = IntStream.range(0, numbers.length)
                .toArray();
        System.out.println(Arrays.toString(numbers));

        double average = IntStream.range(0, numbers.length)
                .average().getAsDouble();

        return average;

    }
}

