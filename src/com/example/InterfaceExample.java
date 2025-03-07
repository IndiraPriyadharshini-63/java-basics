package com.example;

interface Polygon {
      void getArea(int length, int breadth);

}

class Rectangle implements Polygon {
      public void getArea(int length, int breadth) {
            System.out.println("The area of the rectangle is " + (length * breadth));
      }
}

public class InterfaceExample {
      public static void main(String[] args) {
            Rectangle r = new Rectangle();
            r.getArea(5, 6);
      }

}
