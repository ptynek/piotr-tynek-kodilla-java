package com.kodilla.good.patterns.challenges.orders;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private ProductOrder productOrder;
    private LocalDateTime orderTime;



    public OrderRequest(User user, ProductOrder productOrder ,LocalDateTime orderTime) {
        this.user = user;
        this.orderTime = orderTime;
    }

    public User getUser() {return user;}
    public ProductOrder getProductOrder() {return productOrder;}
    public LocalDateTime getOrderTime() {return orderTime;}
}
