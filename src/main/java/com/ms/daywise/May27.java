package com.ms.daywise;

/* 3121. Count the Number of Special Characters II
You are given a string word. A letter c is called special if it appears both in lowercase and uppercase in word, and every lowercase occurrence of c appears before the first uppercase occurrence of c.

Return the number of special letters in word.



Example 1:

Input: word = "aaAbcBC"

Output: 3

Explanation:

The special characters are 'a', 'b', and 'c'.

Example 2:

Input: word = "abc"

Output: 0

Explanation:

There are no special characters in word.

Example 3:

Input: word = "AbBCab"

Output: 0

Explanation:

There are no special characters in word.



Constraints:

1 <= word.length <= 2 * 105
word consists of only lowercase and uppercase English letters.
 */
public class May27 {

  public static void main(String[] args) {
    String s1 = "aaAbcBC";
    String s2 = "abc";
    String s3 = "AbBCab";
    System.out.println(numberOfSpecialChars(s1));
    System.out.println(numberOfSpecialChars(s2));
    System.out.println(numberOfSpecialChars(s3));

  }

  public static int numberOfSpecialChars(String word) {

    boolean[] lower = new boolean[26];
    boolean[] upper = new boolean[26];
    boolean[] valid = new boolean[26];

    for (int i = 0; i < 26; i++) {
      valid[i] = true;
    }

    for (int i = 0; i < word.length(); i++) {

      char c = word.charAt(i);

      if (Character.isLowerCase(c)) {

        int idx = c - 'a';

        if (upper[idx]) {
          valid[idx] = false;
        }

        lower[idx] = true;

      } else {

        int idx = c - 'A';

        upper[idx] = true;
      }
    }

    int count = 0;

    for (int i = 0; i < 26; i++) {

      if (lower[i] && upper[i] && valid[i]) {
        count++;
      }
    }

    return count;
  }
}
