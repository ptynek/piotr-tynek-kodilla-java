package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {

    String firstName;
    String lastName;
    String peselId;

    public LibraryUser(String firstname, String lastname, String peselId) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPeselId() {
        return peselId;
    }

    public void setPeselId(String peselId) {
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUser that = (LibraryUser) o;

        if (!firstName.equals(that.firstName)) return false;
        if (!lastName.equals(that.lastName)) return false;
        return peselId.equals(that.peselId);
    }

    @Override
    public int hashCode() {
        return  Objects.hash(firstName, lastName, peselId);
    }
}
