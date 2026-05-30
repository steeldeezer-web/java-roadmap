package ru.steelDeezer.Day3;

public class Task3 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");

        System.out.println(a == b); //true
        System.out.println(a == c);//false
        System.out.println(a.equals(c));//true

        String d = c.intern();
        System.out.println(a == d);//true

        StringBuilder sb = new StringBuilder("hello");
        String e = sb.toString();
        System.out.println(a == e);//false
    }
    
}
