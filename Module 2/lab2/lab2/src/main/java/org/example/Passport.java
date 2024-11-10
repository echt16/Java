package org.example;

import java.util.ArrayList;
import java.util.List;

public class Passport {
    private String passportNumber;
    private String name;
    private String nationality;

    public Passport(String passportNumber, String name, String nationality) {
        this.passportNumber = passportNumber;
        this.name = name;
        this.nationality = nationality;
    }

    public void displayInfo() {
        System.out.println("Паспорт №: " + passportNumber);
        System.out.println("Ім'я: " + name);
        System.out.println("Національність: " + nationality);
    }
}

class ForeignPassport extends Passport {
    private String foreignPassportNumber;
    private List<String> visas;

    public ForeignPassport(String passportNumber, String name, String nationality, String foreignPassportNumber) {
        super(passportNumber, name, nationality);
        this.foreignPassportNumber = foreignPassportNumber;
        this.visas = new ArrayList<>();
    }

    public void addVisa(String visa) {
        visas.add(visa);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Номер закордонного паспорта: " + foreignPassportNumber);
        System.out.println("Візи: " + String.join(", ", visas));
    }
}
