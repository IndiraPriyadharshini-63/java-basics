package com.example;

class Animal {
      String name;

      public void eat() {
            System.out.println("I can eat");
      }
}

class Dog extends Animal {
      @Override
      public void eat() {
            super.eat(); // call method of superclass
            System.out.println("I eat dog food");
      }

      public void display() {
            System.out.println("My name is " + name);
      }
}

public class InheritanceExample {
      public static void main(String[] args) {
            Dog lab = new Dog();
            lab.name = "Rohu";
            lab.display();
            lab.eat();
      }
}
