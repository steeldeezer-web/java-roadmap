package ru.steelDeezer.Day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void testAddToBeginning(List<Integer> list, int elements){
        for (int i = 0; i < elements; i++) {
            list.add(0,i);
        }
    }

    public static void main(String[] args) {
        long startList = 0;
        long stopList = 0;

        long startLinkedList = 0;
        long stopLinkedList = 0;
        List<Integer> testList = new ArrayList<>();
        List<Integer>testLinkedList = new LinkedList<>();
        startList = System.nanoTime();
        testAddToBeginning(testList,100_000);
        stopList = System.nanoTime();
        System.out.println("Время работы метода c ArrayList: " + (stopList - startList) + " н/с");

        startLinkedList = System.nanoTime();
        testAddToBeginning(testLinkedList,100_000);
        stopLinkedList = System.nanoTime();
        System.out.println("Время работы метода c LinkedList: " + (stopLinkedList - startLinkedList) + " н/с");
    }

}
