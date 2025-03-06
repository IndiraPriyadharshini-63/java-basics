package com.example;

public class EscapeSequence {
      public static void main(String[] args) {

            String message1 = "Hello \"World\"";
            String path = "C:\\Windows\\...";
            String message2 = "Hello \n Everyone";
            String message3 = "Hello \t Everyone";
            System.out.println(message1);
            System.out.println(path);
            System.out.println(message2);
            System.out.println(message3);
      }
}
