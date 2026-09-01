package org.example;

public class SecondLargestNumber {


    public static void main(String args[])
    {
        int arr[]={12,34,56,78,0,5,89,100,1365,2654};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        System.out.println("Array is"+arr);
        System.out.println("Second largest array  "+arr[1]);

    }
}
