package com.kodilla.good.patterns.challenges.orders;

public class InformCustomerService implements InformationService {

    @Override
    public void inform(User user){
        System.out.println("Zamówienie złożone.");
    }

}
