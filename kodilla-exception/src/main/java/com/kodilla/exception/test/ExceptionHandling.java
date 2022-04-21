package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args)  {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.8, 1.6);
        } catch (Exception exception) {
            System.out.println("Błąd. Podane liczby są nieprawidłowe!");
        } finally {
            System.out.println("Koniec!");
        }
    }
}