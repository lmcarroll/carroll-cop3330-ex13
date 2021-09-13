/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;
import java.lang.Math;

public class DeterminingCompoundInterest {
    public static void main(String[] args) {
        System.out.println("What is the principal amount?");
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();

        System.out.println("What is the rate?");
        input = new Scanner(System.in);
        double rate = input.nextDouble();

        System.out.println("What is the number of years?");
        input = new Scanner(System.in);
        double years = input.nextDouble();

        System.out.println("What is the number of times the interest is compounded per year?");
        input = new Scanner(System.in);
        double PerYear = input.nextDouble();

        double amount = 1 + (rate / 100 / PerYear);
        amount = Math.pow(amount, PerYear * years);
        amount *= principal;
        System.out.printf("$%.0f invested at %.1f%% for %.0f years compounded %.0f times per year is $%.2f.", principal, rate, years, PerYear, amount);
    }
}
