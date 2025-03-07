package com.example;

import java.util.Scanner;

class Student {
      int id;
      String name;
      int age;

      // constructor
      public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
      }

      public void printStudent() {
            System.out.println("Id:" + id);
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
      }
}

public class ClassExample {
      public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student details: ");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            Student obj = new Student(id, name, age);
            obj.printStudent();
      }

}
