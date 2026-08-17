package org.example;

import java.util.Scanner;

public class Greatest_Of_TwoNumbers {
    public static void main(String args[])
    {
        System.out.println("Enter 1st Number");
        Scanner sc=new Scanner(System.in);
        int first_Number=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int second_Number=sc.nextInt();
        if(first_Number>second_Number)
        {
            System.out.println("First number is greater");
        }
        else
        {
            System.out.println("Second number is greater");
        }
    }

}
