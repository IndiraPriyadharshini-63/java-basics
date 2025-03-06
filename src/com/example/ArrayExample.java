package com.example;

import java.util.Arrays;

public class ArrayExample {
      public static void main(String[] args) {
            int[] numbers = new int[5];
            numbers[0] = 1;
            numbers[1] = 10;
            numbers[2] = 111;
            int[] num = { 2, 5, 1, 4, 3 };
            Arrays.sort(num);
            System.out.println(num.length);
            System.out.println(Arrays.toString(num));
            System.out.println(Arrays.toString(numbers));

            // multidimensional array
            int[][] twoDArray = new int[2][3];
            twoDArray[0][1] = 1;
            int[][] twoDArrayInit = { { 1, 2, 3 }, { 4, 5, 6 } };
            System.out.println(Arrays.deepToString(twoDArray));
            System.out.println(Arrays.deepToString(twoDArrayInit));

            // constants
            final float pi = 3.14F;
            pi = 5; // error: pi cannot be reassigned
            System.out.println(pi);
      }
}
