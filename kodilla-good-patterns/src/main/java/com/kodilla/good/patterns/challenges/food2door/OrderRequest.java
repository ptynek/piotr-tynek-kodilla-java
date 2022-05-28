package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequest {

    private Manufacturer manufacturer;
    private ProductOrder productOrder;
    private LocalDateTime orderTime;

    public OrderRequest(Manufacturer manufacturer, ProductOrder productOrder, LocalDateTime orderTime) {
        this.manufacturer = manufacturer;
        this.productOrder = productOrder;
        this.orderTime = orderTime;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
