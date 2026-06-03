package ru.steelDeezer.Day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RepeatTask12 {
    public static String readFirstLine() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return br.readLine();
        }

    }

    public static void main(String[] args) {
        try {
            String line = readFirstLine();
            System.out.println("Первая строка: " + line);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

    }
}
