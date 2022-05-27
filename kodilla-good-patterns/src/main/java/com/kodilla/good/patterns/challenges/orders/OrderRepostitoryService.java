package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class OrderRepostitoryService implements OrderRepository{
    @Override
    public boolean createOrder(User user, ProductOrder productOrder, LocalDateTime orderDate) {
        return true;
    }
}
