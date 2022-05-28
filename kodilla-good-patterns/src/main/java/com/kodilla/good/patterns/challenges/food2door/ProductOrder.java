package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrder {

    String productName;
    int quantityOfProduct;

    public ProductOrder(String productName, int quantityOfProduct) {
        this.productName = productName;
        this.quantityOfProduct = quantityOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "productName='" + productName + '\'' +
                ", quantityOfProduct=" + quantityOfProduct +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductOrder that = (ProductOrder) o;

        if (quantityOfProduct != that.quantityOfProduct) return false;
        return productName.equals(that.productName);
    }

    @Override
    public int hashCode() {
        int result = productName.hashCode();
        result = 31 * result + quantityOfProduct;
        return result;
    }
}
