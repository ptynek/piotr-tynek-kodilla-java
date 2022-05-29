package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public Order retrieve() {

        User user = new User("pTynek", "Piotr", "Tynek");
        ProductOrder productOrder = new ProductOrder("Coffe", 5);
        int quantity = 5;
        LocalDateTime orderTime = LocalDateTime.of(2022,02,10,20,11);

        return new Order(user, productOrder, quantity, orderTime);
    }
}
