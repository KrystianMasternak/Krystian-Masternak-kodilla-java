package com.example.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements ProducerProcess {
    private String name;
    private String residenceAdress;

    public HealthyShop(String name, String residenceAdress) {
        this.name = name;
        this.residenceAdress = residenceAdress;
    }

    public void process(Product product, int volumeOfPurchase){
        System.out.println("\nTowar: " + product.getName() + " jest przygotowywany do wysyłki.");
        System.out.println("\nZapraszmy!");
    }

    public String getName() {
        return name;
    }

    public String getResidenceAdress() {
        return residenceAdress;
    }

    @Override
    public String toString() {
        return "HealthyShop{" +
                "name='" + name + '\'' +
                ", residenceAdress='" + residenceAdress + '\'' +
                '}';
    }
}
