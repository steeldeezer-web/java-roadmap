package ru.steelDeezer.Day5;

public class RepeatTasks5_7 {
    /*2.1 — StringBuilder в цикле
Почему этот код плох? Напиши исправленную версию.
     */
    public static void main(String[] args) {
        String res = "";
        for (int i = 0; i < 1000; i++) {
            res += i;
        }

        //исправленный вариант
        StringBuilder res2 = new StringBuilder("");
        for (int i = 0; i < 1000; i++) {
            res2.append(i);
        }
        //демонстрация вывода
        System.out.println(res);
        System.out.println(res2);
    }
}
//Код плох тем, что при каждой итерации создается новая строка и записывается в стринг пул нагружая память
//сложность в первом варианте O(n^2) во втором варианте O(n)
/*2.1 — StringBuilder в цикле
Почему этот код плох? Напиши исправленную версию.
int test() {
    try {
        return 1;
    } finally {
        return 2;
    }
}
Вернет 2 т.к finally перекрывает ретерн из try
     */