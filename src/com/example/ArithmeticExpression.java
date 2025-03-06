package com.example;

public class ArithmeticExpression {
      public static void main(String[] args) {
            double result = (double) 10 / (double) 3;
            System.out.println(result);

            // increment operator
            int x = 1;
            int y = x++;
            System.out.println(x); // x:2
            System.out.println(y); // y:1

            int a = 1;
            int b = ++a;
            System.out.println(a); // a:2
            System.out.println(b); // b:2

            int c = 1;
            c += 2;
            System.out.println(c); // c:3

            // order of operations ( PODMAS )
            int total1 = 10 + 3 * 3;
            int total2 = (10 + 3) * 3;
            System.out.println(total1); // total1: 19
            System.out.println(total2); // total2: 39

            // casting
            // byte > short > int > long
            short s = 1;
            int t = s + 2;
            double u = 1.1;
            int v = (int) u + 2;
            System.out.println(t); // t: 3
            System.out.println(v); // v: 3.1

      }

}
