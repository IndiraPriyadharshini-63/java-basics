package com.example;

import java.text.NumberFormat;

public class MathOps {
      public static void main(String[] args) {
            int r = Math.round(3.33F);
            int c = (int) Math.ceil(3.33F);
            int f = (int) Math.floor(3.33F);
            int m = Math.max(1, 2);
            int ran = (int) Math.round(Math.random() * 100);
            System.out.println(r); // r: 3
            System.out.println(c); // c: 4
            System.out.println(f); // f: 3
            System.out.println(m); // m: 2
            System.out.println(ran); // ran: 2.545454

            // formatting numbers

            String result = NumberFormat.getCurrencyInstance().format(1234567.891);
            String percentResult = NumberFormat.getPercentInstance().format(0.1);
            System.out.println(result); // $ 1,234,567.89
            System.out.println(percentResult); // 10%

      }
}
