package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("User1", "Piotr", "Kowal");
        ProductOrder productOrder = new ProductOrder("Coffe", 2);
        LocalDateTime orderTime = LocalDateTime.of(2022, 9, 10, 13, 0);

        return new OrderRequest(user, productOrder, orderTime);
    }
}
