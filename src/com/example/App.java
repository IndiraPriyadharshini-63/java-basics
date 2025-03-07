package com.example;

public class App {
    public static void main(String[] args) throws Exception {
        byte b = 10;
        short s = 1000;
        int num = 123456789;
        long bigNum = 31234567896548L;
        float pi = 3.14F;
        double area = 12.3456;
        char letter = 'A';
        boolean isEligible = false;
        enum Day {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        }
        Day today = Day.MONDAY;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Integer: " + num);
        System.out.println("Long: " + bigNum);
        System.out.println("Float: " + pi);
        System.out.println("Double: " + area);
        System.out.println("Character: " + letter);
        System.out.println("Boolean: " + isEligible);
        System.out.println("Today:  " + today);
    }
}
