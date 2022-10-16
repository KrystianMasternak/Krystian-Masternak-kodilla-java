package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

import java.time.LocalDateTime;

public class ProductOrderRequest {
    private User user;
    private Product product;
    private LocalDateTime data;

    public ProductOrderRequest(User user, Product product, LocalDateTime data) {
        this.user = user;
        this.product = product;
        this.data = data;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getData() {
        return data;
    }
}
