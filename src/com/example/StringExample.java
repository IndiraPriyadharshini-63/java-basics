package com.example;

public class StringExample {
      public static void main(String[] args) {
            String message = " Hello ";
            System.out.println(message.startsWith("e"));
            System.out.println(message.length());
            System.out.println(message.indexOf("s")); // output: -1
            System.out.println(message.replace("H", "h")); // output: hello
            System.out.println(message.trim()); // output: Hello, it removes the space
            System.out.println(message); // output: Hello, why because strings are immutable
      }
}
