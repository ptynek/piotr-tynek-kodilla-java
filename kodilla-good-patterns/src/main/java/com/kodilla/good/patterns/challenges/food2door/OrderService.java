package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public interface OrderService {

    public boolean order(Manufacturer manufacturer, ProductOrder productOrder, LocalDateTime orderTime);
}
