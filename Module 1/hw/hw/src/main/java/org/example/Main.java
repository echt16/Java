package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("\"Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life\"\n\t\t\tSteve Jobs");
        //2
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((float) (a * b) / 100);
        //3
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(Integer.toString(c) + Integer.toString(d) + Integer.toString(e));
        //4
        int f = scanner.nextInt();
        String fstr = Integer.toString(f);
        if (fstr.length() == 6) {
            String fres = "" + fstr.charAt(5) + fstr.charAt(4) + fstr.charAt(2) + fstr.charAt(3) + fstr.charAt(1) + fstr.charAt(0);
            System.out.println(fres);
        }
        //5
        int g = scanner.nextInt();
        if (g < 1 || g > 12) {
            System.out.println("Invalid number");
        } else {
            switch (g) {
                case 1, 2, 12: {
                    System.out.println("Winter");
                }
                break;
                case 3, 4, 5: {
                    System.out.println("Spring");
                }
                break;
                case 6, 7, 8: {
                    System.out.println("Summer");
                }
                break;
                case 9, 10, 11: {
                    System.out.println("Autumn");
                }
                break;
            }
        }
        //6
        double m = scanner.nextDouble();
        String units = scanner.next();
        switch (units) {
            case "mile": {
                System.out.println(m / 1609);
            }
            break;
            case "inches": {
                System.out.println(m * 39.37);
            }
            break;
            case "yard": {
                System.out.println(m * 1.094);
            }
            break;
        }
        //7
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //8
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        for (int i = from; i <= to; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }

        //9
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        int negativeCount = (int) Arrays.stream(array).filter(n -> n < 0).count();
        int positiveCount = (int) Arrays.stream(array).filter(n -> n > 0).count();
        int zeroCount = (int) Arrays.stream(array).filter(n -> n == 0).count();

        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("Отрицательные: " + negativeCount);
        System.out.println("Положительные: " + positiveCount);
        System.out.println("Нули: " + zeroCount);

        //10
        int[] evens = Arrays.stream(array).filter(n -> n % 2 == 0).toArray();
        int[] odds = Arrays.stream(array).filter(n -> n % 2 != 0).toArray();
        int[] negatives = Arrays.stream(array).filter(n -> n < 0).toArray();
        int[] positives = Arrays.stream(array).filter(n -> n > 0).toArray();

        System.out.println("Четные: " + Arrays.toString(evens));
        System.out.println("Нечетные: " + Arrays.toString(odds));
        System.out.println("Отрицательные: " + Arrays.toString(negatives));
        System.out.println("Положительные: " + Arrays.toString(positives));

        //11
        int length = scanner.nextInt();
        String direction = scanner.next();
        String symbol = scanner.next();
        if (direction.equals("horizontal")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
        } else {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        }
        System.out.println();

        //12
        int[] arrayToSort = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        String sortOrder = scanner.next();
        if (sortOrder.equals("ascending")) {
            Arrays.sort(arrayToSort);
        } else {
            Arrays.sort(arrayToSort);
            for (int i = 0; i < arrayToSort.length / 2; i++) {
                int temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[arrayToSort.length - 1 - i];
                arrayToSort[arrayToSort.length - 1 - i] = temp;
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(arrayToSort));

    }
}