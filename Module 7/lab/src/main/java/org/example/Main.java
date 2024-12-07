package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
        }
        Arrays.stream(numbers).forEach(x-> System.out.print(x + "     "));
        System.out.println();
        System.out.println();
        long pair = Arrays.stream(numbers).filter(x -> x % 2 == 0).count();
        long unpair = Arrays.stream(numbers).filter(x -> x % 2 != 0).count();
        long nul = Arrays.stream(numbers).filter(x -> x == 0).count();
        int g = 4;
        long ph = Arrays.stream(numbers).filter(x -> x == g).count();
        System.out.println(pair);
        System.out.println(unpair);
        System.out.println(nul);
        System.out.println(ph);
        System.out.println();
        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Kiyv", "London", "Berlin", "Milan", "Roma", "Madrid");
        System.out.println(list);
        System.out.println();
        list.stream().filter(x -> x.length() > 6).forEach(x->System.out.print(x + "   "));
        System.out.println();
        String allo = "Kiyv";
        System.out.println(list.stream().filter(x -> Objects.equals(x, allo)).count());
        String b = "m";
        System.out.println(list.stream().filter(x -> x.toLowerCase().startsWith(b)).count());
        System.out.println();
        System.out.println();List<Auto> cars = new ArrayList<>();

        cars.add(new Auto("BMW", 2020, 35000.50, "Red", 2.5));
        cars.add(new Auto("Audi", 2018, 28000.75, "Blue", 3.0));
        cars.add(new Auto("Mercedes", 2022, 45000.00, "Black", 2.0));
        cars.add(new Auto("Tesla", 2021, 55000.99, "White", 3.5));
        cars.add(new Auto("Volkswagen", 2019, 25000.30, "Green", 1.8));
        cars.forEach(System.out::println);

        String color = "Blue";
        cars.stream().filter(x -> Objects.equals(x.getColor(), color)).forEach(System.out::println);

        List<Auto> autos = cars.stream().sorted((x, y) -> (int)(x.getPrice() - y.getPrice())).toList();
        autos.forEach(System.out::println);
    }
}