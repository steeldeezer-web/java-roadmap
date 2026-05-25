package ru.steelDeezer.Day1;

public class Task2 {
    /**
     * Checks if a string is a valid palindrome, ignoring non-alphanumeric chars and case.
     *
     * @param s the input string (may be null)
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String s){
        if (s == null) return false;
        int left = 0;
        int right = s.length() - 1;

        while (left< right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            }
            else if (!Character.isLetterOrDigit(rightChar)){
                right--;
            }
            else {
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    return false;
                }
                left++;
                right--;
            }git add src/day1/Task2_ValidPalindrome.java
            git commit -m "docs: add English Javadoc for isPalindrome method with two-pointer explanation"
            git push


        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("А роза упала на лапу азора"));
        System.out.println(isPalindrome("Антон"));
    }
}
