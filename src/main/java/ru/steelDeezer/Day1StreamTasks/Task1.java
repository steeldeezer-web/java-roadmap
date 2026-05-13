package ru.steelDeezer.Day1StreamTasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        /*Задача 1
            Дан список строк: "apple", "banana", "cherry", "date", "elderberry"
            Оставить только строки длиной больше 5 символов
            Перевести в верхний регистр
            Собрать в новый список*/
        List<String> words = Arrays.asList("apple",
                "banana", "cherry", "date", "elderberry");
        List<String> upperList = words.stream().filter(s -> s.length() > 5).map(s -> s.toUpperCase()).collect(Collectors.toList());


    }
}
