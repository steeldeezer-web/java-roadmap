package ru.steelDeezer.Day1StreamTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 17),
                new Person("Charlie", 30),
                new Person("David", 16),
                new Person("Eve", 22)
        );
        long adultsCount = people.stream().filter(p -> p.getAge() >= 18).count();
        String result = people.stream().filter(p -> p.getAge() >= 18).map(Person::getName).collect(Collectors.joining(","));

        System.out.println(adultsCount);
        System.out.println(result);
    }
}
