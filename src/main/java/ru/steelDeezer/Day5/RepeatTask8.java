package ru.steelDeezer.Day5;
class InvalidUSerException extends Exception{
    public InvalidUSerException(String s){
        super(s);
    }
}
public class RepeatTask8 {
    public static void validateAge(int age) throws InvalidUSerException{
        if(age < 0 || age > 150) throw new InvalidUSerException("InvalidAge: " + age);
    }

    public static void main(String[] args) {
       try{
           validateAge(-1);

       } catch (InvalidUSerException e) {
           System.err.println(e.getMessage());
       }
    }
}
