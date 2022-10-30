package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username;

    public ForumUser() {
        this.username = "Jonh Smith";
    }

    public String getUsername() {
        return username;
    }
}
