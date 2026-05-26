package ru.steelDeezer.Day2;

import java.util.ArrayList;
import java.util.List;

public class ChangeValues {
    public static void changeValues(int number, List<String> words) {
        number = 999;
        words.add("new");
        words = new ArrayList<>();
        words.add("lost");

    }

    public static void main(String[] args) {
        int x = 10;
        List<String> list = new ArrayList<>(List.of("one","two"));
        changeValues(x, list);
        System.out.println(x);
        System.out.println(list);
    }


}
