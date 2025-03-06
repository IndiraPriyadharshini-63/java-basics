package com.example;

import java.util.Scanner;

public class LoopsExample {
      public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                  System.out.println(i);
            }

            // reverse
            for (int i = 5; i >= 0; i--) {
                  System.out.println(i);
            }

            // while loop
            Scanner scanner = new Scanner(System.in);
            String input = "";

            while (!input.equals("quit")) {
                  System.out.print("Input: ");
                  input = scanner.next().toLowerCase();
                  if (input.equals("quit"))
                        break;
                  System.out.println(input);
            }

            // do-while loop
            do {
                  System.out.print("Input: ");
                  input = scanner.next().toLowerCase();

                  if (input.equals("pass"))
                        continue;
                  if (input.equals("quit"))
                        break;
                  System.out.println(input);
            } while (true);

            // for-each
            String[] fruits = { "apple", "mango", "orange" };
            for (String fruit : fruits) {
                  System.out.println(fruit);

            }
      }
}
