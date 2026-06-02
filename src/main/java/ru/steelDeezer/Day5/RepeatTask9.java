package ru.steelDeezer.Day5;

public class RepeatTask9 {
    public static void showIndex(int[] array, int x) throws NullPointerException, IndexOutOfBoundsException{
        if(x > array.length) throw new ArrayIndexOutOfBoundsException("going beyound the array boundary");
        if (array == null) throw new NullPointerException("Array is null");
        System.out.println(array[x]);

    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        try {
            showIndex(array,5);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }

        int[] array2 = null;
        try {
            showIndex(array2,5);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
