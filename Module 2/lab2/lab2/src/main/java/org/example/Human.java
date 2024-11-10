package org.example;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age);
    }
}

class Builder extends Human {
    private String specialty;

    public Builder(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Спеціальність: Будівельник (" + specialty + ")");
    }
}

class Sailor extends Human {
    private String rank;

    public Sailor(String name, int age, String rank) {
        super(name, age);
        this.rank = rank;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ранг: Моряк (" + rank + ")");
    }
}

class Pilot extends Human {
    private String airline;

    public Pilot(String name, int age, String airline) {
        super(name, age);
        this.airline = airline;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Авіакомпанія: Пілот (" + airline + ")");
    }
}

