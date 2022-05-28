package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService{
    @Override
    public boolean order(User user, ProductOrder productOrder, LocalDateTime orderTime) {
        return true;
    }
}
