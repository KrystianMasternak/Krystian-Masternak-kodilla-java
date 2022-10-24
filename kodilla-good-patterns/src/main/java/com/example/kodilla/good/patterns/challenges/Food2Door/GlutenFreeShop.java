package com.example.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements ProducerProcess {
    private String name;
    private String residenceAddress;

    public GlutenFreeShop(String name, String residenceAddress) {
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
        return "GlutenFreeShop{" +
                "name='" + name + '\'' +
                ", residenceAddress='" + residenceAddress + '\'' +
                '}';
    }
}
