package com.kelzceana;

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // A mortgage calculator
        Scanner scanner = new Scanner(System.in);
        //PRINCIPAL
        System.out.println("Enter the principal value: ");
        int principal = scanner.nextInt();

        // ANNUAL INTEREST RATE
        System.out.println("Enter the annual interest rate: ");
        float monthlyInterest = scanner.nextFloat();
        float annualInterest = monthlyInterest /100 /12;

        // PERIOD IN YEARS
        System.out.println("Enter the number of years: ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * 12;

        //MORTGAGE CALCULATOR
        double mortgage = principal
                * ( (annualInterest *  Math.pow((1 + annualInterest), numberOfPayments))
                / (Math.pow((1 + annualInterest), numberOfPayments)  - 1 ));



        System.out.println("Your Mortgage is :" + mortgage);



    }
}
