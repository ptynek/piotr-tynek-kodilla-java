package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements OrderService {


    @Override
    public boolean process(Order order) {

        System.out.println("Zamówienie złożone do Extra Food Shop.");

        return true;
    }
}
