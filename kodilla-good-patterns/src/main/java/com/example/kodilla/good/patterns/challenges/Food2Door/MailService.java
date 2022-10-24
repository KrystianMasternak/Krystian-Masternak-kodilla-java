package com.example.kodilla.good.patterns.challenges.Food2Door;

public class MailService implements InformationService{

    @Override
    public void information(Order order, boolean isSold) {
        if (isSold) {
            System.out.println("\n\nUżytkowniku " + order.getUser().getUserName() + " twoje zamówienie jest w trakcie kompletowania");
            System.out.println("Zamówione produkty: " + order.getProduct().getName() + " cena: " + order.getProduct().getPrice() + "zł");
            System.out.println("Ilość: " + order.getVolumeOfPurchase());
            System.out.println("Wiadomość została wygenerowana automatycznie na adres: " + order.getUser().getEmail());
            System.out.println("Data zamówienia " + order.getDateOfSale());
        } else {
            System.out.println("Użytkowniku " + order.getUser().getUserName() + " twoje zamówienie nie zostanie zrealizowane.");
            System.out.println("Zamówione produkty: " + order.getProduct().getName() + " nie są aktualnie dostępne.");
        }
    }
}
