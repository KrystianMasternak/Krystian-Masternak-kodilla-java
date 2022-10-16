package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

public class ShopAPK {
    public static void main(String[] args) {
        ProductOrderRetriever productOrderRetriever = new ProductOrderRetriever();
        ProductOrderRequest productOrderRequest = productOrderRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new ProductOrderServis(), new ProductOrderRepository());
        productOrderProcessor.process(productOrderRequest);

    }
}