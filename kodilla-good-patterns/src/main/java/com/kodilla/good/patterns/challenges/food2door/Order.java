package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class Order {

    private User user;
    private ProductOrder productOrder;
    private int quantity;
    private LocalDateTime timeOrder;

    public Order(User user, ProductOrder productOrder, int quantity, LocalDateTime timeOrder) {
        this.user = user;
        this.productOrder = productOrder;
        this.quantity = quantity;
        this.timeOrder = timeOrder;
    }

    public User getUser() {
        return user;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getTimeOrder() {
        return timeOrder;
    }
}
