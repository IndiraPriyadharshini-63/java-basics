// bundling of fields and methods inside a single class
// It prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.
package com.example;

class Person {
      private int age;

      public int getAge() {
            return age;

      }

      public void setAge(int age) {
            this.age = age;
      }
}

public class EncapsulationExample {
      public static void main(String[] args) {

            Person p1 = new Person();
            p1.setAge(26);
            System.out.println("Age: " + p1.getAge());
      }

}
