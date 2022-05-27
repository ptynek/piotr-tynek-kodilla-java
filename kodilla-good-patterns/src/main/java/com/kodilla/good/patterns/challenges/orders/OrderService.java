package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public interface OrderService {

    public boolean order(User user, ProductOrder productOrder ,LocalDateTime orderTime);
}
