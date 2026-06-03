package ru.steelDeezer.Day5;

import java.util.ArrayList;
import java.util.List;

public class RepeatTasks1_3 {
    //1.1 — Ссылки на объекты
    public static void main(String[] args) {
        //1.1 — Ссылки на объекты

        List<String> list1 = new ArrayList<>();
        List<String> list2 = list1;
        list1.add("A");
        list2.add("B");
        System.out.println(list1.size() + " " + list2.size());
        //Вывод 2 и 2 т.к обе переменные ссылаются на один и тот же список в куче

        /*1.2 — Стек и куча
        Где в памяти хранятся эти переменные и объекты?*/
        int x = 10; //в стеке
        String s = "hello"; //в специальной области в куче - стринг пул
        int[] arr = new int[3]; // в куче

        //1.3 — Строки и ==

        String a = "cat";//хранится в встринг пуле
        String b = new String("cat");// хранится в куче отедльным объектом
        String c = a;// ссылается на туже самую строку в стринг пуле что и перменная а
        System.out.println(a == b); //false ссылаются на разные объекты
        System.out.println(a == c); // true ссылаются на одну строку в стринг пуле
    }
}
