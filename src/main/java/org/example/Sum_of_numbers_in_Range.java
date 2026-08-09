package org.example;

import java.util.Scanner;

public class Sum_of_numbers_in_Range {
    // Sum of range of positive numbers between first and last exclude last number
    public static void main(String args[])
    {
        System.out.println("Enter the number range first");
        Scanner sc =new Scanner(System.in);
        int first=sc.nextInt();
        System.out.println("Enter the number range last");
        int last =sc.nextInt();
        int sum=0;
        for(int i =first;i<last;i++)
        {
           sum=sum+i;
        }
        System.out.println("Sum of the numbers between the range are "+sum);

    }
}
