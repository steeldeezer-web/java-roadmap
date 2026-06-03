package ru.steelDeezer.Day4;

public class Task2 {
    // Реализуй:
    // 1. Проверить array на null → выбросить NullPointerException с сообщением
    // 2. Проверить index на выход за границы → выбросить IndexOutOfBoundsException
    // 3. Вывести array[index]
    // 4. В main обработать оба исключения отдельными catch
    public static void process(int[] array, int index){
      if(array == null) throw new NullPointerException("array has link null");
      if (index < 0 || index >= array.length) throw new ArrayIndexOutOfBoundsException("index out of bounds: " + index);

        System.out.println(array[index]);
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2};
        int index = 5;
        try {
            process(array, 5);
        }catch (NullPointerException e){
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }

    }
}
