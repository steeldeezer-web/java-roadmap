package ru.steelDeezer.Day1;

import java.util.Arrays;

public class Task1 {
    /**
     * Returns an array where each element is the product of all other elements.
     *
     * @param array input array of integers (non-null, length >= 2)
     * @return new array with products, or empty array if input invalid
     * @throws IllegalArgumentException if array is null or length < 2
     */
   public static int[] productExceptSelf(int[] array){
       if(array == null || array.length <= 1){
           return new int[0];
       }
       int n = array.length;
       int[] result = new int[n];

       int leftProduct = 1;
       for (int i = 0; i < n; i++) {
           result[i] = leftProduct;
           leftProduct *= array[i];

       }

       int rightProduct = 1;
       for (int i = n - 1; i >= 0; i--) {
           result[i] *= rightProduct;
           rightProduct *= array[i];
       }
            return result;
   }

    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4};
        int[] newArrays = productExceptSelf(arrays);
        System.out.println(Arrays.toString(newArrays));
    }
}
