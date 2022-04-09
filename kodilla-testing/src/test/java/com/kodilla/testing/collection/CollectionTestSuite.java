package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionTestSuite {

    @BeforeEach
    void beforeEach() {
        System.out.println("Checking odd list exterminator");
    }
    @AfterEach
    void afterEach(){
        System.out.println("Finished checking odd list exterminator.");
    }

    @DisplayName("Checking how method works with empty list.")

    @Test
    void testOddNumbersExterminatorEmptyList()  {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> listNumbers = Arrays.asList();

        List<Integer> result = oddNumbersExterminator.exterminate(listNumbers);

        Assertions.assertEquals(listNumbers, result);

    }

    @DisplayName("Checking with normal numbers in the list.")
    @Test
    void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        List<Integer> testNumbers = Arrays.asList(5,10,33,42,30);
        List<Integer> expectedList = Arrays.asList(10,42,30);

        List<Integer> result = oddNumbersExterminator.exterminate(testNumbers);

        Assertions.assertEquals(expectedList, result);
    }

}
