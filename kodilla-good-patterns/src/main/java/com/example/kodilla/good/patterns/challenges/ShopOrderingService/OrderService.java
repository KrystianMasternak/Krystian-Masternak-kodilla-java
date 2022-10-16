package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

import java.time.LocalDateTime;

public interface OrderService {
    boolean sold(User user, Product product, LocalDateTime orderDate);
}