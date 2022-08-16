package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idUser;
    private final String username;
    private final char sexUser;
    private final LocalDate dateOfBirth;
    private final int postsCount;


    public ForumUser(final int idUser, final String username, final char sexUser, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postsCount) {
        this.idUser = idUser;
        this.username = username;
        this.sexUser = sexUser;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsCount = postsCount;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUsername() {
        return username;
    }

    public char getSexUser() {
        return sexUser;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", sexUser=" + sexUser +
                ", dateOfBirth=" + dateOfBirth +
                ", postsCount=" + postsCount +
                '}';
    }
}
