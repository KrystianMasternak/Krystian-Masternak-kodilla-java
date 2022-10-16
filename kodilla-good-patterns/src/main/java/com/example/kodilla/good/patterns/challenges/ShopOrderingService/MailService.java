package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

public class MailService implements InformationService{

    @Override
    public void informatioin(User user) {
        System.out.println("Thanks " + user.getUserName() + " for buy product.");
    }
}
