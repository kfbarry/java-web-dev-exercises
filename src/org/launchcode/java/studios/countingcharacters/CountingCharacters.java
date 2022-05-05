package org.launchcode.java.studios.countingcharacters;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a fun quote to have it's characters counted: ");
        String quote = input.nextLine();
        quote = quote.replaceAll("[^a-zA-Z0-9]", "");
        char[] charsInQuote = quote.toUpperCase().toCharArray();
        HashMap<Character,Double> characterCount = new HashMap<>();

        for (Character item : charsInQuote) {
            if (!characterCount.keySet().contains(item)) {
                characterCount.put(item, 0.0);
            }
        }

        for (Map.Entry<Character,Double> check : characterCount.entrySet()){
            for (Character item : charsInQuote){
                if (item.equals(check.getKey())){
                    characterCount.put(check.getKey(), check.getValue() + 1);
                }
            }
        }
        System.out.println(characterCount.entrySet());
    }
}
