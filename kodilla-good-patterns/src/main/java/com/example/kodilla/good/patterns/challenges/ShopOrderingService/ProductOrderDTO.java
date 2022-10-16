package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

import java.time.LocalDateTime;

public class ProductOrderDTO {
    private User user;
    private Product product;
    private boolean isSuccesfullySold;

    public ProductOrderDTO(User user, Product product, boolean isSuccesfullySold) {
        this.user = user;
        this.product = product;
        this.isSuccesfullySold = isSuccesfullySold;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

}
