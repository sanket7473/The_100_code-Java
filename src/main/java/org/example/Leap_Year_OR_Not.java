package org.example;

import java.util.Scanner;

public class Leap_Year_OR_Not {
    public static void main(String []args)
    {
        System.out.println("Enter a number to check a leap year");
        Scanner sc=new Scanner(System.in);
        int leap_Year=sc.nextInt();
        if(leap_Year%400==0)
        {
           System.out.println("Year is a leap year");
        }
        else if (leap_Year%100==0)
        {
            System.out.println("Year is not a leap year");
        } else if (leap_Year%4==0)
        {
            System.out.println("Year isa leap year");
        }

    }

}
