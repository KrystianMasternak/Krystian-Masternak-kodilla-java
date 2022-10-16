package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

import java.time.LocalDateTime;

public class ProductOrderServis implements OrderService {
    @Override
    public boolean sold(User user, Product product, LocalDateTime orderDate) {
        System.out.println("Order made for: " + user.getUserName() + ". Order date: " + orderDate + ". Orders: " + product.getNameProduct() +
                ", quantity: " + product.getQauntity() + ", for price: " + product.getOrderValue());
        return true;
    }
}
