package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public interface OrderRepository {

    public boolean createOrder(Manufacturer manufacturer, ProductOrder productOrder, LocalDateTime orderTime);
}
