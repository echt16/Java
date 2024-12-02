package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String readFile(String fileName) {
        try(FileReader reader = new FileReader(fileName)){
            char[] buf = new char[256];
            String text = "";
            int c = 0;
            while((c = reader.read(buf)) > 0){
                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                text += String.valueOf(buf);
            }
            return text;
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "target/classes/txt.txt";
        //ex1
        System.out.println(readFile(path));
        //ex2
        String fileText = readFile(path);
        String[] subStrings = fileText.split("[,.!?\n]");
        System.out.println(subStrings[0] + "\n" + subStrings[1] + "\n");
    }
}