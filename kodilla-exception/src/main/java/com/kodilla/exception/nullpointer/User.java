package com.kodilla.exception.nullpointer;

public class User {

    private String user;

    public User(String user) {
        this.user = user;
    }

    public String getUsername() {
        return user;
    }
}
