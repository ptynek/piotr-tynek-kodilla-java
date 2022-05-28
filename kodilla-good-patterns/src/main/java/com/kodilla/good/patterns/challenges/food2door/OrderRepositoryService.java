package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRepositoryService implements  OrderRepository{
    @Override
    public boolean createOrder(Manufacturer manufacturer, ProductOrder productOrder, LocalDateTime orderTime) {
        return true;
    }
}
