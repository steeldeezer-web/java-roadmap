package ru.steelDeezer.Day5;

public class RepeatTask11 {
    /*3.2 — Исключения и finally
Что выведет этот код?
*/
    public static void main(String[] args) {
        try {
            throw new RuntimeException("A");
        } finally {
            System.out.println("B");
        }
        //код в блоке try выбросит исключение и выведет А если поймать это исключение и вывести сообщение, блок файнали всеравно исполнится и также выведет B
    }
}
