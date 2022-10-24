package com.example.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;

public class DataRetriever {

    public void retieve() {

        ProducerProcess producerGlutenFreeShop = new GlutenFreeShop("GlutenFreeShop", "Warszawa ul. Niebieska 12");
        ProducerProcess producerExtraFoodShop = new ExtraFoodShopProducer("ExtraFoodShopProducer",  "Gdańsk ul. Zielona 34");
        ProducerProcess producerHealthyShop = new HealthyShop("HealthyShop", "Toruń ul. Mickiewicza 44");

        Product product = new Product("Chleb pełnoziarnisty", 4.32, 12);
        Product product1 = new Product("Mleko sojowe", 5.65, 56);
        Product product2 = new Product("Mąka kukurydziana", 3.45, 50);
        Product product3 = new Product("Jogutr", 3.54, 25);
        Product product4 = new Product("Masło", 9,32);
        Product product5 = new Product("Mąka ryżowa", 5.65, 39);
        Product product6 = new Product("Awokado", 7.4, 20);
        Product product7 = new Product("Kefir", 2.59, 49);

        RegistrerProducts productsOfGlutenFreeShopProducer = new RegistrerProducts();
        RegistrerProducts productsOfExtraFoodShopProducer = new RegistrerProducts();
        RegistrerProducts productsOfHealthyShopProducer = new RegistrerProducts();

        productsOfGlutenFreeShopProducer.newProductAdding(product2);
        productsOfGlutenFreeShopProducer.newProductAdding(product5);

        productsOfHealthyShopProducer.newProductAdding(product);
        productsOfHealthyShopProducer.newProductAdding(product1);
        productsOfHealthyShopProducer.newProductAdding(product6);

        productsOfExtraFoodShopProducer.newProductAdding(product3);
        productsOfExtraFoodShopProducer.newProductAdding(product4);
        productsOfExtraFoodShopProducer.newProductAdding(product7);

        RegisterProducers registerProducers = new RegisterProducers();

        registerProducers.addNewProducer(producerGlutenFreeShop, productsOfGlutenFreeShopProducer);
        registerProducers.addNewProducer(producerExtraFoodShop, productsOfExtraFoodShopProducer);
        registerProducers.addNewProducer(producerHealthyShop, productsOfHealthyShopProducer);

        Order order = new Order(new User("John222", "John", "john222@ab.com"), LocalDate.of(2022, 10, 20), product3, 4);

        Processor processor = new Processor(new MailService(), registerProducers);
        processor.process(order);
    }
}
