package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> oddList = new ArrayList<>();

        if (numbers.isEmpty()) {
            System.out.println("Lista jest pusta!");
        } else {
            for (Integer number : numbers) {

                int numberModulo = number % 2;

                if (numberModulo == 0) {
                    oddList.add((number));
                }
            }
        }

        return oddList;
    }

}
