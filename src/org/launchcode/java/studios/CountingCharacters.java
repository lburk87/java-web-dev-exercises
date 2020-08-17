package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("Enter text:");
        text = input.nextLine().replaceAll("[^a-zA-Z]", "").toUpperCase();
        char[] charsInStr = text.toCharArray();

         for (int i=0;i<charsInStr.length;i++) {
             Character key = charsInStr[i];

             if (charCount.containsKey(key)) {
                 int qty = charCount.get(key)+1;
                 charCount.replace(key,qty);
             } else {
                 charCount.put(key, 1);
             }


             }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());

         }

    }

}
