package com.example;

import java.util.Scanner;

public class ReadingInput {
      public static void main(String[] args) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Name:");
            String name = scanner1.nextLine().trim();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Age:");
            byte age = scanner2.nextByte();
            System.out.println("Name " + name);
            System.out.println("Age " + age);
      }
}
