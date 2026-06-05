package ru.steelDeezer.Day6;

import java.util.*;
/*Задача 2. HashSet — дубликаты и null
Создай класс HashSetDemo и выполни:

Создай HashSet<String>

Добавь в него: "apple", "banana", "apple", null, "null" (строка), null

Выведи размер сета (.size())

Выведи все элементы через цикл for (String s : set)*/
public class Task2 {
    public static void main(String[] args) {
        Set<String> heshSet = new HashSet<>(Arrays.asList("apple", "banana", "apple", null, "null", null));
        System.out.println(heshSet.size());

        Iterator<String> iterator = heshSet.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
/*
Ответь на вопросы в комментариях кода:

Почему размер не 6?
 - ответ: Во-первых в размере учитываются элементы которые не являются null
Сколько элементов вывелось?
 - ответ: 4
null и "null" — это одно и то же?
 - ответ: нет, в первом случае это значение что никуда не ссылается, во втором это строка которая хранится в стринг пул
Сохранился ли порядок добавления?
 - ответ:нет порядок не сохраняется*/
