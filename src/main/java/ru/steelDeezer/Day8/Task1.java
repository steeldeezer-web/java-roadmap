package ru.steelDeezer.Day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String>{
    @Override
    //Переопределяем метод
    public int compare(String s1, String s2){
        // Если 0 строки равны, если  >0, то первая строка должна идти после второй, если отрицательное, то  вторая строка должна идти после первой
        int lengthCompare = Integer.compare(s1.length(), s2.length());
        //если строки разные  возвращаем  lengthCompare
        if(lengthCompare != 0){
            return lengthCompare;
        }
        //если значение 0, то фильтруем по алфавиту
        return s1.compareTo(s2);
}
    }
public class Task1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "python", "go", "rust", "javascript", "c");
        Collections.sort(words, new LengthComparator());


        List<String> words2 = Arrays.asList("java", "python", "go", "rust", "javascript", "c");
        words2.sort((s1, s2) -> {
            int lenCompare = Integer.compare(s1.length(), s2.length());
            if (lenCompare != 0) return lenCompare;
            return s1.compareTo(s2);
        });
    }
}
/*
Почему для сравнения строк по алфавиту нельзя просто написать return s1.length() - s2.length()?»
потому что сравнение будет по длинне строки, для сравнения по алфавиту нужно использовать метод compareTo
 */