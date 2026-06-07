package ru.steelDeezer.Day7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "three");
        treeMap.put(1, "one");
        treeMap.put(4, "four");
        treeMap.put(2, "two");
        System.out.println(treeMap);

        Map.Entry<Integer, String> first = treeMap.firstEntry();
        Map.Entry<Integer, String> last = treeMap.lastEntry();
        System.out.println(first.getKey());
        System.out.println(last.getKey());

    }
}
"feat: add Day7.Task3 print first key and last key using firstEntry and lastEntry"