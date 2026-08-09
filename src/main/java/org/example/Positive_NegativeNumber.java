package org.example;

import java.util.Scanner;

public class Positive_NegativeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a value for positive Number ");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a >=0)
        {
            System.out.println("Number is a positive number");
        }
        else
        {
            System.out.println("Number is a Negative Number");
        }
        }

}
