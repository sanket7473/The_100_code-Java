package org.example;

import java.util.Scanner;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {

        System.out.println("Enter a Number to check prime number");

        Scanner sc = new Scanner(System.in);
        int check_number = sc.nextInt();

        int count = 0;

        if (check_number > 1) {

            for (int i = 2; i <= check_number; i++) {

                if (check_number % i == 0) {
                    count = count + 1;
                }
            }

            if (count == 1) {
                System.out.println("Number is a prime number " + check_number);
            }
            else {
                System.out.println("Number is not a prime number");
            }
        }
        else {
            System.out.println("Number is not a prime number");
        }
    }
}
