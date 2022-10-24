package com.example.kodilla.good.patterns.challenges.Food2Door;

public class Processor {
    private InformationService informationService;
    private RegisterProducers registerProducers;

    public Processor(InformationService informationService, RegisterProducers registerProducers) {
        this.informationService = informationService;
        this.registerProducers = registerProducers;
    }

    public ProducerProcess getProducentOfProduct(Product product) {
        return registerProducers.getProducerOfSpecyfikProduct(product);
    }

    public void process(Order order){
        registerProducers.showAllvailableProducts();
        boolean isAvailable = registerProducers.isAvailableProduct(order.getProduct(), order.getVolumeOfPurchase());
        getProducentOfProduct(order.getProduct()).process(order.getProduct(), order.getVolumeOfPurchase());
        informationService.information(order, isAvailable);
        if (!isAvailable){
            System.out.println("Zamówienie nie może zostać zrealizowane!");
        }
    }
}
