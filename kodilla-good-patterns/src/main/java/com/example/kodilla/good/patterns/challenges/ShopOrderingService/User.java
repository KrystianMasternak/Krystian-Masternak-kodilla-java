package com.example.kodilla.good.patterns.challenges.ShopOrderingService;

public class User {
    String userName;
    String realName;
    String lastName;

    public User(String userName, String realName, String lastName) {
        this.userName = userName;
        this.realName = realName;
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getLastName() {
        return lastName;
    }


}
