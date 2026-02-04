package com.ms.corejava.passwordgenerator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int num = scanner.nextInt();
        System.out.println("your number :" + num);
        scanner.close();
    }

}
