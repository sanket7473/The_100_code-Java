package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=a;
        int reverse=0;
        while(p!=0)
        {
            int r=p%10;
            reverse=reverse*10+r;
            p=p/10;

        }
        System.out.println("Reveserse number is "+reverse);
        if(a==reverse)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
    }
}
