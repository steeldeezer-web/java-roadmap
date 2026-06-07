package ru.steelDeezer.Day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task1 {
    /*
    WordFrequency.java: Посчитай частоту слов в массиве с помощью HashMap.
     */
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        Map<String, Integer> heshMap = new HashMap<>();

        for(String s : words){
            if (heshMap.containsKey(s)){
                heshMap.put(s, heshMap.get(s) + 1);
            }else {
                heshMap.put(s,1);
            }
        }


        Iterator<Map.Entry<String, Integer>> iterator = heshMap.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
/*
feat: add Day7.Task1 count repeating elements in an array using a HashMap
 */