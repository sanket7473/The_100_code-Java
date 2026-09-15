package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Duplicate_Character_Counts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> map = new HashMap<>();

        System.out.println("Enter a string:");
        String a = sc.nextLine();

        for (char ch : a.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println("Character counts: " + map);

        sc.close();
    }
}
