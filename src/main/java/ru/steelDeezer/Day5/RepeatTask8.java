package ru.steelDeezer.Day5;
class InvalidUserException extends Exception{
    public InvalidUserException(String s){
        super(s);
    }
}
public class RepeatTask8 {
    public static void validateAge(int age) throws InvalidUserException {
        if(age < 0 || age > 150) throw new InvalidUserException("InvalidAge: " + age);
    }

    public static void main(String[] args) {
       try{
           validateAge(-1);

       } catch (InvalidUserException e) {
           System.err.println(e.getMessage());
       }
    }
}
