package com.kodilla.good.patterns.challenges.food2door;

public class Manufacturer {

    String companyName;

    public Manufacturer(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manufacturer that = (Manufacturer) o;

        return companyName.equals(that.companyName);
    }

    @Override
    public int hashCode() {
        return companyName.hashCode();
    }
}
