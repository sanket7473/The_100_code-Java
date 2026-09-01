package org.example;

public class SecondLargestLogic {
    public static void main(String args[])
    {
        int arr[]={12,34,56,78,1990,26763,38833,7282,188,38938,373783,383839};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int a:arr)
        {
            if(a>largest)
            {
                secondLargest=largest;
                largest=a;
            }
        }
        System.out.println("Largest element is "+largest);
        System.out.println("Second largest element is "+secondLargest);
    }

}
