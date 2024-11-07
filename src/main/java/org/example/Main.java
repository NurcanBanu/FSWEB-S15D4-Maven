package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

        System.out.println("*************");

        System.out.println(convertDecimalToBinary(13));
        System.out.println(convertDecimalToBinary(15));
        System.out.println(convertDecimalToBinary(17));
        System.out.println(convertDecimalToBinary(18));
        System.out.println(convertDecimalToBinary(19));
    }


    public static boolean checkForPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        LinkedList<Integer> binaryNumbers = new LinkedList<>();

        while (number > 0) {
            binaryNumbers.addFirst(number % 2 );
            number = number / 2;
        }

        StringBuilder binaryStr = new StringBuilder();
        for (int binary : binaryNumbers) {
            binaryStr.append(binary);
        }
        return binaryStr.toString();


    }
}