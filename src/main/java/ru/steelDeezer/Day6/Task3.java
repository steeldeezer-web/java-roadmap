package ru.steelDeezer.Day6;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,5,20,3,15);
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll(list);
        queue.addAll(list);

        System.out.println("Вывод по убыванию");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println("Вывод по возростанию");

        while (!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }

    }

}
