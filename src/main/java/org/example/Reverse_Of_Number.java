package org.example;

import java.util.Scanner;

public class Reverse_Of_Number {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int n=a;
        int reverse =0;
        while(n!=0)
        {
           int r =n%10;
          reverse=reverse*10+r;
          n=n/10;
        }
        System.out.println("Revesre number is "+reverse);
    }
}
