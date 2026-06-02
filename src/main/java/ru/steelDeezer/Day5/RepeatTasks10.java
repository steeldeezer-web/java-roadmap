package ru.steelDeezer.Day5;

public class RepeatTasks10 {
    public static void main(String[] args) {
        //Что выведет этот код?
        //3.1 — Строки и intern
        String s1 = new String("java");// хранится в куче
        String s2 = s1.intern(); // проверяет есть ли  такая строка в стринг пул ,если да то возвращает ссылку на него
        //если такой строки нет помещает ее и возвращает на него ссылку
        String s3 = "java"; // хранится в стринг пул
        System.out.println(s1 == s2);// false
        System.out.println(s2 == s3);//true

    }
}
