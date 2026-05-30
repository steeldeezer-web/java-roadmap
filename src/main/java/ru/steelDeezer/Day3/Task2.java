package ru.steelDeezer.Day3;

public class Task2 {
    //Задача 2 — Найди ошибку в коде
    public static String concatNumbers(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += i;
        }
        return result;
    }
}
//Ошибка в том, что при каждой итерации создается новый объект стринг
/*Нужно было через стринг билдер создавать строку и при итерация цикла добавлять i через метод append
feat: add solution Task2 find mistake in concatNumbers*/