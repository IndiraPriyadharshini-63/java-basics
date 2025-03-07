// we cannot create object of abstract class
// abstract class can have both the regular methods and abstract methods
package com.example;

abstract class Language {
      abstract void method1();

      void method2() {
            System.out.println("regular method");
      }

}

public class AbstractExample extends Language {
      public static void main(String[] args) {
            AbstractExample obj = new AbstractExample();
            obj.method2();
            obj.method1();
      }

      public void method1() {
            System.out.println("overrided abstract method");
      }

}
