package com.example;

import java.util.Scanner;

public class ControlFlow {
      public static void main(String[] args) {

            // comparision operators
            int x = 1;
            int y = 1;
            System.out.println(x == y); // false

            // logical operators
            int temperature = 12;
            boolean isWarm = temperature > 20 && temperature < 30;
            System.out.println(isWarm); // false

            boolean hasHighIncome = true;
            boolean hasGoodCredit = true;
            boolean isEligible = hasHighIncome || hasGoodCredit;
            System.out.println(isEligible); // true

            // if statements
            int temp = 32;
            if (temp > 30)
                  System.out.println("Its a hot day");
            else if (temp > 20)
                  System.out.println("Beautiful day");
            else
                  System.out.println("Cold day");

            // simple if statements

            int income = 120_000;
            String incomeSalary = income > 100_000 ? "First" : "Economy";
            System.out.println(incomeSalary); // First

            // switch statements

            Scanner scanner = new Scanner(System.in);
            System.out.println("1: admin");
            System.out.println("2: moderator");
            System.out.println("3: guest");
            System.out.println("Choose your role");
            int role = scanner.nextInt();

            switch (role) {
                  case 1:
                        System.out.println("You are an admin");
                        break;
                  case 2:
                        System.out.println("You are moderator");
                        break;
                  case 3:
                        System.out.println("You are guest");
                        break;
                  default:
                        System.out.println("Invalid selection");
                        break;
            }

      }
}
