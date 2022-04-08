package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Test - pierwszy test jednostkowy: ");

        if (calculator.add(4,5) == (4 + 5)) {
            System.out.println("test OK");
        } else {
            System.out.println("Fail!");
        }

        System.out.println("Test - drugi test jednostkowy: ");

        if (calculator.subtract(3,2) == (3 - 2)) {
            System.out.println("test OK");
        } else {
            System.out.println("Fail!");
        }

    }
}
