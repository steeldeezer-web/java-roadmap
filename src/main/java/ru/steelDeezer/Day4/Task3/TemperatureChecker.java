package ru.steelDeezer.Day4.Task3;

public class TemperatureChecker {
    public static void checkTemperature(int temp) throws InvalidTemperatureException{
        if(temp < -50 || temp > 50) throw new InvalidTemperatureException("Temperature out of range: " + temp);
    }

    public static void main(String[] args) {
        int temp = 100;
        try {
            checkTemperature(temp);
        } catch (InvalidTemperatureException e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Temperature check completed");
        }
    }
}

