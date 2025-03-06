package com.example;

import java.util.Scanner;

public class Fizzbuzz {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Number: ");
            int number = scanner.nextInt();
            if (number % 5 == 0 && number % 3 == 0)
                  System.out.println("FizzBuzz");
            else if (number % 5 == 0)
                  System.out.println("Fizz");
            else if (number % 3 == 0)
                  System.out.println("Buzz");
            else
                  System.out.println("number");

            // String result = number % 5 == 0 && number % 3 == 0 ? "FizzBuzz"
            // : number % 5 == 0 ? "Fuzz" : number % 3 == 0 ? "Buzz" : "invalid";
            // System.out.println(result);
      }
}
