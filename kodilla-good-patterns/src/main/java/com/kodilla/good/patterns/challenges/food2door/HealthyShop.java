package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements OrderService  {


    @Override
    public boolean process(Order order) {
        System.out.println("Zamówienie złożone do Healthy Shop.");
        return true;
    }
}
