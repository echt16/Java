package org.example;

import java.util.List;

public class Country {
    private String countryName;
    private String continent;
    private int population;
    private String phoneCode;
    private String capital;
    private List<String> cities;

    public Country(String countryName, String continent, int population, String phoneCode, String capital, List<String> cities) {
        this.countryName = countryName;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public void displayData() {
        System.out.println("Країна: " + countryName);
        System.out.println("Континент: " + continent);
        System.out.println("Населення: " + population);
        System.out.println("Телефонний код: " + phoneCode);
        System.out.println("Столиця: " + capital);
        System.out.println("Міста: " + String.join(", ", cities));
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}
