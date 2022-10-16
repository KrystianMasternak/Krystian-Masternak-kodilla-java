package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

import java.math.BigDecimal;

public class Product {
    private String nameProduct;
    private int priceProduct;
    private int qauntity;
    private double orderValue;

    public Product(String nameProduct, int priceProduct, int qauntity) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.qauntity = qauntity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public int getQauntity() {
        return qauntity;
    }

    public double getOrderValue() {
        return priceProduct * qauntity;
    }
}
