package ru.steelDeezer.Day4;

public class Task1 {
    // Реализуй: если b == 0 → вернуть Double.NaN
    // Если b != 0 → вернуть (double) a / b
    public static double divide(int a, int b){
        if(b == 0) return Double.NaN;
        return (double) a / b;

    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2));
        System.out.println(divide(10, 0));
        System.out.println(divide(0, 10));
    }
}
