package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

import java.time.LocalDateTime;

public class ProductOrderRetriever {

    public ProductOrderRequest  retrieve() {
        User user = new User("JonhBuyer23", "Jonh", "Shmit");
        Product product = new Product("Phone", 2590, 2);
        LocalDateTime data = LocalDateTime.now();

        return new ProductOrderRequest(user, product, data);
    }
}
