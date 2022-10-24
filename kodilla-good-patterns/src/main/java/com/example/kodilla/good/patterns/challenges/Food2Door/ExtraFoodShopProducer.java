package com.example.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShopProducer implements ProducerProcess {
    private String name;
    private String residenceAddress;

    public ExtraFoodShopProducer(String name, String residenceAddress) {
        this.name = name;
        this.residenceAddress = residenceAddress;
    }

    public void process(Product product, int volumeOfPurchase){
        System.out.println("\nTowar: " + product.getName() + " jest przygotowywany do wysyłki.");
        System.out.println("\nZapraszmy!");
    }

    public String getName() {
        return name;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    @Override
    public String toString() {
        return "ExtraFoodShopProducer{" +
                "name='" + name + '\'' +
                ", residenceAddress='" + residenceAddress + '\'' +
                '}';
    }
}
