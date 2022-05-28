package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    private Manufacturer manufacturer;
    private  ProductOrder productOrder;
    private boolean isOrdered;

    public OrderDto(Manufacturer manufacturer, ProductOrder productOrder, boolean isOrdered) {
        this.manufacturer = manufacturer;
        this.productOrder = productOrder;
        this.isOrdered = isOrdered;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
