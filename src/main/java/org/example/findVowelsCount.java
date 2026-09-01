package org.example;

public class findVowelsCount {
    public static void main(String args[])
    {
        String a="programming";
        int count=0;
        int i;
        for( i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a' || a.charAt(i)=='e'||a.charAt(i)=='i' ||a.charAt(i)=='o' ||a.charAt(i)=='u')
            {
                count=count+1;
            }
        }
        System.out.println("Count is "+count);
    }
}
