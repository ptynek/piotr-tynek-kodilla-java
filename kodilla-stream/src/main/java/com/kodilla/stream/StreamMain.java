package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeutifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

import static java.lang.Character.highSurrogate;
import static java.lang.Character.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculatin expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references.");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);

        System.out.println("PoemBeutifier");
        PoemBeutifier poemBeutifier = new PoemBeutifier();
        poemBeutifier.beautify("Random text", text -> text.toUpperCase());
        poemBeutifier.beautify("Second random text", text -> "!!!" + text + "!!!");

        System.out.println("Using Stream to generate even numvers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
