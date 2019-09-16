package com.company;

public class TempConversion {
    public static void main(String[] args)
    {
        double fahrenheit;
        double celsius;

        fahrenheit = 79;
        celsius = (fahrenheit - 32)*(5.0/9.0);
        System.out.println((fahrenheit)+" Fahrenheit = "+(celsius)+" Celsius");
    }
}
