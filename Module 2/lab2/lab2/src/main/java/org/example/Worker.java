package org.example;

public abstract class Worker {
    public abstract void print();
}

class President extends Worker {
    @Override
    public void print() {
        System.out.println("Посада: Президент");
    }
}

class Security extends Worker {
    @Override
    public void print() {
        System.out.println("Посада: Охоронець");
    }
}

class Manager extends Worker {
    @Override
    public void print() {
        System.out.println("Посада: Менеджер");
    }
}

class Engineer extends Worker {
    @Override
    public void print() {
        System.out.println("Посада: Інженер");
    }
}
