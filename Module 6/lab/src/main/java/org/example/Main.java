package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        MaxMinThread max = new MaxMinThread(list, "max");
        MaxMinThread min = new MaxMinThread(list, "min");
        max.start();
        min.start();
        max.join();
        min.join();
        System.out.println(min.result);
        System.out.println(max.result);
    }
}

class MaxMinThread extends Thread {
    public ArrayList<Integer> list;
    private String method;
    public int result = 0;

    public MaxMinThread(ArrayList<Integer> list, String method) {
        this.list = list;
        this.method = method;
    }

    @Override
    public void run() {
        if (method.equals("max")) {
            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }
            this.result = max;
        } else if (method.equals("min")) {
            int min = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }
            this.result = min;
        }
    }
}