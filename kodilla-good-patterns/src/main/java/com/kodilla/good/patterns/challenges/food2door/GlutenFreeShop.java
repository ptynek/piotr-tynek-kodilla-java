package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements OrderService{
    @Override
    public boolean process(Order order) {

        System.out.println("Zamówienie złożone do Gluten Free Shop.");
        return true;
    }
}
