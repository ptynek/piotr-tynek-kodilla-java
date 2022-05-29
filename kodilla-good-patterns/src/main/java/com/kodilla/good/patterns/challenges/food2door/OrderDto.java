package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    private User user;
    ProductOrder productOrder;
    private boolean isOrdered;

    public OrderDto(User user, ProductOrder productOrder, boolean isOrdered) {
        this.user = user;
        this.productOrder = productOrder;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
