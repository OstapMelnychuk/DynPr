package com.company.alex;

/**
 *
 * This class use to find the biggest palindrome in our string.
 *
 * @author      Oleksiy Radyuk
 * @version     1.0
 * @since       2019-11-18
 */
public class TaskTen {
  /**
   * Find bigger element.
   *
   * @param x first element to compare.
   * @param y second element to compare.
   * @return bigger element.
   */
  static int max(int x, int y) {
    return (x > y) ? x : y;
  }
  /**
   * Given a string which we have to check how many symbols has the biggest palindrome which is included in the given one.
   *
   * @param seq string which we have to check.
   * @return the biggest palindrome.
   */
  static int lps(String seq) {
    int n = seq.length();
    int i;
    int j;
    int cl;
    int [][] l = new int[n][n];

    for (i = 0; i < n; i++) {
      l[i][i] = 1;
    }

    for (cl = 2; cl <= n; cl++) {
      for (i = 0; i < n - cl + 1; i++) {
        j = i + cl - 1;
        if (seq.charAt(i) == seq.charAt(j) && cl == 2) {
          l[i][j] = 2;
        } else if (seq.charAt(i) == seq.charAt(j)) {
          l[i][j] = l[i + 1][j - 1] + 2;
        } else {
          l[i][j] = max(l[i][j - 1], l[i + 1][j]);
        }
      }
    }

    return l[0][n - 1];
  }
}
