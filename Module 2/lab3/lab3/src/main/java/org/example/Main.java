package org.example;
import java.util.Arrays;

public class Main {
    public static <T extends Comparable<T>> T getMax(T a, T b, T c) {
        if(a.compareTo(b) > 0 && a.compareTo(c) > 0)
            return a;
        else if(b.compareTo(a) > 0 && b.compareTo(c) > 0)
            return b;
        else
            return c;
    }
    public static <T extends Comparable<T>> T minOfFive(T a, T b, T c, T d, T e) {
        T min = a;
        if (b.compareTo(min) < 0) min = b;
        if (c.compareTo(min) < 0) min = c;
        if (d.compareTo(min) < 0) min = d;
        if (e.compareTo(min) < 0) min = e;
        return min;
    }

    public static <T extends Number> double average(T[] array) {
        double sum = 0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Comparable<T>> T maxInArray(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T minInArray(T[] array) {
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
        Arrays.sort(array);  // Сортуємо масив перед пошуком, якщо він не відсортований
        return Arrays.binarySearch(array, key);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}