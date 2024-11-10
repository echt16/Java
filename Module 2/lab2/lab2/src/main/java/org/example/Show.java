package org.example;
import org.example.IShow;



class Array implements IShow {
    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void print() {
        for (int el : elements) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    @Override
    public void print(String info) {
        System.out.println(info);
        print();
    }
}

