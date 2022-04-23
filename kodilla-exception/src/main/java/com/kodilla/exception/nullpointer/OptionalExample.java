package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        User user = new User("xx");
        Optional<User> optionalUser = Optional.ofNullable(user);



    }
}
