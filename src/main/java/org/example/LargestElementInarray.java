package org.example;

public class LargestElementInarray {
    public static void main(String args[])
    {
        int a []={12,34,67,90,1001,10};

        int largest=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>a[0])
            {
                largest=a[i];
            }
        }
        System.out.println("largest element is "+largest);
    }

}
