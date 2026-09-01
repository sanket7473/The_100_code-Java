package org.example;

public class PalindromeString {
    public static void main(String args[]) {
        String actualString = "eye";
        String reverse = "";
        int i;
        for (i = actualString.length() - 1; i >= 0; i--) {
        reverse=reverse+actualString.charAt(i);
        }
        if(actualString.equals(reverse))
        {
            System.out.println("String is a palindrome");
        }
        else
        {
            System.out.println("String is not a palindrome");
        }
    }
}
