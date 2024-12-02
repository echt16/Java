package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static int Sum(ArrayList<Integer> list, Predicate<Integer> predicate) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += predicate.test(list.get(i)) ? list.get(i) : 0;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sum3 sum = (x, y, z) -> x + y + z;
        System.out.println(sum.sum(1, 2, 4));
        Mult3 mult = (x, y, z) -> x * y * z;
        System.out.println(mult.mult(1, 2, 4));
        Time time = () -> LocalTime.now();
        System.out.println(time.getTime());
        Date date = () -> LocalDateTime.now();
        System.out.println(date.getDate());

        BinaryOperator<Integer> max2 = (x, y) -> Math.max(x, y);
        System.out.println(max2.apply(1, 4));
        BinaryOperator<Integer> min2 = (x, y) -> Math.min(x, y);
        System.out.println(min2.apply(1, 4));
        UnaryOperator<Integer> fact = (x) -> {
            int res = 1;
            for (int i = 1; i <= x; i++) {
                res *= i;
            }
            return res;
        };
        System.out.println(fact.apply(5));
        Predicate<Integer> isEven = (x) -> {
            int res = 0;
            for (int i = 1; i <= x; i++) {
                res += x % i == 0 ? 1 : 0;
            }
            return res == 2;
        };
        System.out.println(isEven.test(6));

        Predicate<Integer> pred1 = (x) -> x % 2 == 0;
        Predicate<Integer> pred2 = (x) -> x % 2 == 1;
        Predicate<Integer> pred3 = (x) -> 20 < x && x < 50;
        Predicate<Integer> pred4 = (x) -> x % 7 == 0;

        System.out.println(
                Sum(new ArrayList<Integer>(), pred3)
        );
    }
}

interface Sum3 {
    int sum(int a, int b, int c);
}

interface Mult3 {
    int mult(int a, int b, int c);
}

interface Time {
    LocalTime getTime();
}

interface Date {
    LocalDateTime getDate();
}
