package com.example.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class RegistrerProducts {
    private List<Product> productList = new ArrayList<Product>();

    public boolean newProductAdding(Product product) {
        if (productList.contains(product)) {
            System.out.println("Nie można dodać już istniejącego produktu");
            return false;
        } else {
            productList.add(product);
            return true;
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

}
