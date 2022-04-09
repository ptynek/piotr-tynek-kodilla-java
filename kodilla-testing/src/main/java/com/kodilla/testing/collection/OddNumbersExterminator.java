package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> oddList = new ArrayList<>();

        for (Integer number : numbers) {

            int numberModulo = number % 2;

            if (numberModulo == 0) {
                oddList.add((number));
            }
        }
        return oddList;
    }

}
