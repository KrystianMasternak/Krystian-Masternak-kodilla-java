package com.example.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private int quatity;

    public Product(String name, double price, int quatity) {
        this.name = name;
        this.price = BigDecimal.valueOf(price);
        this.quatity = quatity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuatity() {
        return quatity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quatity=" + quatity +
                '}';
    }

    public void serQuantityAfterSale(int volumeOfPurchase) {
        this.quatity = quatity - volumeOfPurchase;
    }
}
