package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("\"Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life\"\n\t\t\tSteve Jobs");
        //2
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((float)(a * b) / 100);
        //3
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(Integer.toString(c) + Integer.toString(d) + Integer.toString(e) );
        //4

    }
}