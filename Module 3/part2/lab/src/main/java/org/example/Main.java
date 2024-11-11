package org.example;

import java.util.*;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //EX 1
        HashMap<String, Double> map = new HashMap<>();
        map.put("A", 1.0);
        map.put("B", 2.0);
        map.put("C", 3.0);
        map.put("D", 4.0);
        map.put("E", 5.0);
        map.replace("C", 1.5);
        int i = 0;
        String lastname = "";
        double max = 0;
        for (HashMap.Entry<String, Double> key : map.entrySet()) {
            if (i == 0) {
                max = key.getValue();
                i++;
                continue;
            }
            max = Math.max(max, key.getValue());
            lastname = key.getValue() > max ? key.getKey() : lastname;
        }
        map.remove(lastname);
        //EX 2
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        do {
            out.println("Enter char for exit");
            if (!scanner.hasNextInt()) {
                break;
            }
            int num = scanner.nextInt();
            list.add(num);
        } while (true);
        for(Integer num : list) {
            out.print(num + "   ");
        }
        out.println();
        HashSet<Integer> set = new HashSet<>(list);
        list = set.stream().toList();
        for(Integer num : list) {
            out.print(num + "   ");
        }
        out.println();
        //EX 3
        TreeMap<String, Double> tree = new TreeMap<>();
        tree.put("B", 1.0);
        tree.put("S", 2.0);
        tree.put("C", 3.0);
        tree.put("A", 4.0);
        tree.put("E", 5.0);
        String name = "";
        max = 0;
        for(HashMap.Entry<String, Double> key : tree.entrySet()) {
            if(Math.max(max, key.getValue()) != max){
                max = key.getValue();
                name = key.getKey();
            }
        }
        out.println(name);
        for(HashMap.Entry<String, Double> key : tree.entrySet()) {
            out.println(key.getKey() + "   " + key.getValue());
        }

    }
}

















