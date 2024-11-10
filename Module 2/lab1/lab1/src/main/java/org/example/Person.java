package org.example;

public class Person {
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
    }

    public void inputData(String fullName, String birthDate, String phone, String city, String country, String address) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public void displayData() {
        System.out.println("ПІБ: " + fullName);
        System.out.println("Дата народження: " + birthDate);
        System.out.println("Телефон: " + phone);
        System.out.println("Місто: " + city);
        System.out.println("Країна: " + country);
        System.out.println("Адреса: " + address);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
