package com.example.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class RegisterProducers {

    Map<ProducerProcess, RegistrerProducts> registrerProducers = new HashMap<ProducerProcess, RegistrerProducts>();

    public void addNewProducer(ProducerProcess producer, RegistrerProducts registrerProducts) {
        registrerProducers.put(producer, registrerProducts);
    }

    public void showAllvailableProducts() {
        for (Map.Entry<ProducerProcess, RegistrerProducts> current : registrerProducers.entrySet()) {
            System.out.println(current.getKey());
            for (Product currentProduct : current.getValue().getProductList()) {
                if (currentProduct.getQuatity() > 0) {
                    System.out.println(currentProduct.toString());
                }
            }
        }
    }

    public boolean isAvailableProduct(Product product, int volumeOfPurchase) {
        for (Map.Entry<ProducerProcess, RegistrerProducts> current : registrerProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getProductList()) {
                if (currentProduct.equals(product) && currentProduct.getQuatity() > volumeOfPurchase) {
                    product.serQuantityAfterSale(volumeOfPurchase);
                    return true;
                }
            }
        }
        return false;
    }

    public ProducerProcess getProducerOfSpecyfikProduct(Product product) {
        for (Map.Entry<ProducerProcess, RegistrerProducts> current : registrerProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getProductList()) {
                if (currentProduct.equals(product)) {
                    return current.getKey();
                }
            }
        }
        return null;
    }
}
