package org.example;

public class Auto {
    private String name;
    private int year;
    private double price;
    private String color;
    private double volume;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Auto [name=" + name + ", year=" + year + ", price=" + price + ", color=" + color + ", volume=" + volume + "]";
    }

    public Auto(String name, int year, double price, String color, double volume) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.volume = volume;
    }
}

