package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {

    private final int idUser;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsQuantity;

    public ForumUser(int idUser, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postsQuantity) {
        this.idUser = idUser;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsQuantity = postsQuantity;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
