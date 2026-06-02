package ru.steelDeezer.Day5;

public class RepeatTask_4 {
    public static boolean isPalindrome(String s){
        if(s == null || s.isEmpty()) return false;
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            }
            else{
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))return false;
                else {
                    right--;
                    left++;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ana"));
    }
}
