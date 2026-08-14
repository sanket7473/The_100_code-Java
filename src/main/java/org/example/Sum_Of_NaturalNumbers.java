package org.example;

import java.util.Scanner;

public class Sum_Of_NaturalNumbers {
    public static void main(String args[])
{
    System.out.println("Enter a n natural number ");
    Scanner sc=new Scanner(System.in);
    int range = sc.nextInt();
    int sum=0;
    for (int i=0;i<range;i++)
    {
        sum=sum+i;
    }
    System.out.println("N natural number addition is "+sum);
}
}
