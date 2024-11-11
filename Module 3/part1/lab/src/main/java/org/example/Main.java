package org.example;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        out.println("EX1");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int g = 0;
        do{
            out.println("Add - 1; remove - 2; show - 3; contains - 4; change - 5; exit - 0");
            g = scanner.nextInt();
            switch(g){
                case 1:{
                    out.print("Number: ");
                    int num = scanner.nextInt();
                    numbers.add(num);
                }break;
                case 2:{
                    out.print("Index: ");
                    int index = scanner.nextInt();
                    out.println(numbers.remove(index));
                }break;
                case 3:{
                    for(int num : numbers){
                        out.println(num + "   ");
                    }
                }break;
                case 4:{
                    out.print("Number: ");
                    int num = scanner.nextInt();
                    out.println(numbers.contains(num));
                }break;
                case 5:{
                    out.print("Index: ");
                    int index = scanner.nextInt();
                    out.print("Number: ");
                    int num = scanner.nextInt();
                    out.println(numbers.set(index, num));
                }break;
            }
        }while(g != 0);
        out.println("EX2");
        HashMap<String, String> map = new HashMap<String, String>();
        do {
            out.println("Add - 1; remove - 2; contains - 3; change login - 4; change password - 5; exit - 0");
            g = scanner.nextInt();
            switch(g){
                case 1:{
                    out.print("Login: ");
                    String login = scanner.next();
                    out.print("Password: ");
                    String password = scanner.next();
                    if(map.put(login, password) == null){
                        out.println("Login already exists");
                    }
                }break;
                case 2:{
                    out.print("Login: ");
                    String login = scanner.next();
                    if(map.remove(login) == null){
                        out.println("Login isn`t exists");
                    }
                } break;
                case 3:{
                    out.print("Login: ");
                    String login = scanner.next();
                    out.print("Password: ");
                    String password = scanner.next();
                    if(map.containsKey(login) && map.get(login).equals(password)){
                        out.println("Exists");
                    }
                    else{
                        out.println("Not exists");
                    }
                } break;
                case 4:{
                    out.print("Login: ");
                    String login = scanner.next();
                    out.print("New login: ");
                    String newLogin = scanner.next();
                    if(map.containsKey(login)){
                        String password = map.get(login);
                        map.remove(login);
                        map.put(newLogin, password);
                    }
                } break;
                case 5:{
                    out.print("Login: ");
                    String login = scanner.next();
                    out.print("New password: ");
                    String pass = scanner.next();
                    if(map.containsKey(login)) {
                        map.replace(login, pass);
                    }
                } break;
            }
        }while(g != 0);
    }
}















