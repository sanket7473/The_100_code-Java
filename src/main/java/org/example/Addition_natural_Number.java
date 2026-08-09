package org.example;

import java.util.Scanner;

public class Addition_natural_Number {
    public static void main(String args[])
    {
        System.out.println("Enter a positive number till you want addition");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
       int n=a;
       int sum =0;

        for (int i=0;i<=n;i++)
        {
           sum=sum+i;
        }
        System.out.println("Total sum is "+sum);
    }
}
