package org.example;

import java.util.Scanner;

public class Even_Odd_Number {

    // Even odd number
    public static void main(String [] args)
    {
        System.out.println("Enter a number to check an even odd");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        if(num%2==0)
        {
            System.out.println("Number is a Even number");
        }
        else
        {
            System.out.println("Number is an odd Number");
        }
    }
}
