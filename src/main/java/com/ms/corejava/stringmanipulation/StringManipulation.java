package com.ms.corejava.stringmanipulation;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a line of text
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();

        // 1. Length of the string
        int length = input.length();
        System.out.println("Length of the string: " + length);

        // 2. String in upper case
        String upperCaseString = input.toUpperCase();
        System.out.println("String in upper case: " + upperCaseString);

        // 3. Display the strings that start with 'j'
        System.out.println("Strings that start with 'j':");
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.toLowerCase().startsWith("j")) {
                System.out.println(word);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
