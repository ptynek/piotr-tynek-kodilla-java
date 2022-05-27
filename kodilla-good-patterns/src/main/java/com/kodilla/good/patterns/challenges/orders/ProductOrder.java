package com.kodilla.good.patterns.challenges.orders;

public class ProductOrder {

    private String productName;
    private int quantity;

    public ProductOrder(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}
