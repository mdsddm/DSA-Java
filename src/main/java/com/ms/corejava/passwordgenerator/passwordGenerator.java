package com.ms.corejava.passwordgenerator;

// importing libraries
import java.util.ArrayList;
import java.util.Random;

// this class will contain main function
public class passwordGenerator {
    // Main Start from Here
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("---Password generator program---");
        System.out.println("================================");
        String password = getPassword();
        System.out.println("Your Finall Password : " + password);
    }

    // Function which return Password as String
    static String getPassword() {
        // creating random object
        Random random = new Random();
        // Choosing randon size from 8 to 15
        int randomSize = random.nextInt((15 - 8) + 1) + 8;
        // Creating String as empty
        String password = "";
        // Starting Loop till the random size
        for (int i = 0; i < randomSize; i++) {
            // getting random 0-3 by which we select value from sets
            int randomNum = random.nextInt(4);
            switch (randomNum) {
                case 0:
                    // selecting from lowercase set
                    ArrayList<Character> lcs = PasswordSets.lowerCaseSet();
                    int lowerIndex = random.nextInt(lcs.size());
                    password = password + lcs.get(lowerIndex);
                    break;
                case 1:
                    // selecting from upper case set
                    ArrayList<Character> ucs = PasswordSets.upperCaseSet();
                    int upperIndex = random.nextInt(ucs.size());
                    password = password + ucs.get(upperIndex);
                    break;
                case 2:
                    // selecting from number set
                    ArrayList<Character> ns = PasswordSets.numberSet();
                    int numberIndex = random.nextInt(ns.size());
                    password = password + ns.get(numberIndex);
                    break;
                default:
                    // selecting from special symbol
                    ArrayList<Character> sss = PasswordSets.specialSymbolsSet();
                    int ssIndex = random.nextInt(sss.size());
                    password = password + sss.get(ssIndex);

            }
        }

        System.out.println("Creating Password ..");
        System.out.println("Paswword : " + password);
        System.out.println("-- Cheaking For Condition");
        // Using checkPassword that will return boolean
        // if password satisfied all four condition then function return true
        if (checkPassword(password)) {
            System.out.println("======= Password varified ======");
            return password;
        } else {
            System.out.println("!!! Not fulfilling the criteria.");
            System.out.println("Getting Again new password ..");
            System.out.println("================================");
            // this will works as recursion till we get correct password
            return (getPassword());
        }
    }

    // Checkpassword function that return boolean
    static boolean checkPassword(String password) {
        // intializing varibale for checking condition
        boolean numFound = false, upperFound = false, lowerFound = false, symbolFound = false;
        for (int i = 0; i < password.length(); i++) {
            for (char a : PasswordSets.lowerCaseSet()) {
                // checking if lowercase found on string
                if (a == password.charAt(i) && lowerFound == false) {
                    System.out.println("Lower Case Alphabet Found !");
                    lowerFound = true;
                    break;
                }
            }
            for (char b : PasswordSets.upperCaseSet()) {
                // checking if upper case found on string
                if (b == password.charAt(i) && upperFound == false) {
                    System.out.println("Upper Case Alphabet Found !");
                    upperFound = true;
                    break;
                }
            }
            for (char c : PasswordSets.specialSymbolsSet()) {
                // checking if special symbol found on string
                if (c == password.charAt(i) && symbolFound == false) {
                    System.out.println("Speacial symbol Found !");
                    symbolFound = true;
                    break;
                }
            }
            for (char d : PasswordSets.numberSet()) {
                // checking if number found on string
                if (d == password.charAt(i) && numFound == false) {
                    System.out.println("Number Found !");
                    numFound = true;
                    break;
                }
            }

        }
        // here we show some information to user
        if (numFound == false)
            System.out.println("!! Number Missing");
        if (upperFound == false)
            System.out.println("!! Uper Case Alphabet Missing");
        if (lowerFound == false)
            System.out.println("!! Lower Case Alphabet Missing");
        if (symbolFound == false)
            System.out.println("!! Special Symbol Missing");
        // if four condition true then return true and password varified
        if (numFound && upperFound && lowerFound && symbolFound)
            return true;
        else
            return false;
    }

}
// This Class will Contains All the Set
// In this class we are making all method static so that
// we can access without creating it's object

class PasswordSets {
    // Lower Case Set
    public static ArrayList<Character> lowerCaseSet() {
        ArrayList<Character> lowerCaseSet = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            lowerCaseSet.add(c);
        }
        return lowerCaseSet;
    }

    // Upper Case Set
    public static ArrayList<Character> upperCaseSet() {
        ArrayList<Character> upperCaseSet = new ArrayList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            upperCaseSet.add(c);
        }
        return upperCaseSet;
    }

    // number set
    public static ArrayList<Character> numberSet() {
        ArrayList<Character> numberSet = new ArrayList<>();
        for (int c = 0; c <= 9; c++) {
            numberSet.add((char) (c + '0'));
        }
        return numberSet;
    }

    // special symbol set
    public static ArrayList<Character> specialSymbolsSet() {
        ArrayList<Character> specialSymbols = new ArrayList<>();
        specialSymbols.add('!');
        specialSymbols.add('@');
        specialSymbols.add('#');
        specialSymbols.add('$');
        specialSymbols.add('%');
        specialSymbols.add('^');
        specialSymbols.add('&');
        specialSymbols.add('*');
        specialSymbols.add('-');
        specialSymbols.add('_');
        specialSymbols.add('=');
        specialSymbols.add('+');
        specialSymbols.add('<');
        specialSymbols.add('>');
        specialSymbols.add(',');
        specialSymbols.add('.');
        specialSymbols.add('?');
        specialSymbols.add('/');
        return specialSymbols;
    }
}
