package ru.steelDeezer.Day7;

import ru.steelDeezer.Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer, String> heshMap = new HashMap<>();
        heshMap.put(1, "one");
        heshMap.put(2, "two");
        heshMap.put(3, "three");

        Iterator<Map.Entry<Integer, String>> iterator = heshMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
/*
feat: add Day7.Task2 print hasMaps elements using Iterator
 */