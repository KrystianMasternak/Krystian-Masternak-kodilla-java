package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, Product product, LocalDateTime orderData);
}
