package ru.steelDeezer.Day2;

public class MemoryTest {
    public static void main(String[] args) {
        String s1 = "java"; //SP
        String s2 = "java";//SP
        String s3 = new String("java"); //HEAP
        String s4 = s3.intern(); //  s4 указывает на ТОТ ЖЕ объект, что и s1

        System.out.println(s1 == s2); // true т.к использую одну ссылку на строку в SP
        System.out.println(s1 == s3);// false т.к использую разные ссылки и сами строки хранятся в разных местах в SP И HEAP
        System.out.println(s1 == s4); //true  s4 указывает на ТОТ ЖЕ объект, что и s1
        System.out.println(s3 == s4);// false т.к использую разные ссылки и сами строки хранятся в разных местах в SP И HEAP
    }
}
