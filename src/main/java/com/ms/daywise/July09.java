package com.ms.daywise;

import java.util.Scanner;

public class July09 {
  /*
    *
   ***
  *****
   *******
  *********
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = n - i - 1; j > 0; j--) {
        System.out.print("  ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(j + 1 + " ");
      }
      for (int j = i; j > 0; j--) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }

  }
}
