package org.example;

public class Person {
    private static int personCount = 0;

    private String fullName;
    private String birthDate;
    private String phone;
    private String city;
    private String country;
    private String address;

    public Person(String fullName, String birthDate, String phone, String city, String country, String address) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
        personCount++;
    }

    public static int getPersonCount() {
        return personCount;
    }
}

