package com.kodilla.good.patterns.challenges.food2door;

public class InformationService implements MailSerivce{

    @Override
    public void inform(User user) {
        System.out.println("Zamówienie złożone.");
    }
}
