package com.example.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public abstract class Producer  implements ProducerProcess {
    private String name;
    private String residenceAddress;

    public Producer(String name, String residenceAddress) {
        this.name = name;
        this.residenceAddress = residenceAddress;
    }

    @Override
    public void process(Product product, int volumeOfPurchase) {
        System.out.println("\nInformacja od producenta: ");
    }

    public String getName() {
        return name;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(name, producer.name) && Objects.equals(residenceAddress, producer.residenceAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, residenceAddress);
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                ", residenceAddress='" + residenceAddress + '\'' +
                '}';
    }
}
