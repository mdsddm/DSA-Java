package com.ms.corejava.passwordgenerator;

import java.util.Scanner;

public class SwitchTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = in.nextInt();
        switch (n) {
            case 1 -> System.out.println("Heyy ");
            case 2, 3 -> System.out.println("Got it");
            case 4, 5, 6, 7, 8, 9 -> System.out.println("how is this");
            default -> System.out.println("default");
        }
        in.close();
    }
}
