package com.kodilla.good.patterns.challenges.food2door;

public class MailServiceProcess implements MailService{
    @Override
    public void inform(Manufacturer manufacturer) {
        System.out.println("Zamówienie zostało złożone!");
    }
}
