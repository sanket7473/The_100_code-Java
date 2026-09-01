package org.example;

public class ReverseString {
    public static void main(String args[])
    {
        String a="Sanket";
        String revesre="";
        for(int i=a.length()-1;i>=0;i--)
        {
            revesre=revesre+a.charAt(i);
        }
        System.out.println("Reversed array is "+revesre);
    }

}
