package com.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage {
      public static void main(String[] args) {
            final byte MONTHS_IN_YEAR = 12;
            final byte PERCENT = 100;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Principal: ");
            int principal = scanner.nextInt();
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            int numberOfPayments = years * MONTHS_IN_YEAR;
            double mortgage = principal *
                        (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
            Locale usLocale = new Locale("en", "US");
            String mortgageFormatted = NumberFormat.getInstance(usLocale).format(mortgage);
            System.out.println("Mortgage: " + mortgageFormatted);
      }
}
