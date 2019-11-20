package com.company.Olha;

import java.util.Arrays;

/**
 * This class is for searching ways to write n as sum of two or more positive integers
 *
 * @author Olha
 * @version 1.0
 * @since 2019-11-19
 */
public class TaskSix {
  /**
   * This method counts number of ways to write n as sum of two or more positive integers
   *
   * @param n positive integer number
   * @return number of ways to write n as sum of two or more positive integers
   */

  static int countSumWays(int n) {
    if (n <= 0) {
      System.out.println("Number should be positive integer (greater than 0).");
      return 0;
    } else {
      int table[] = new int[n + 1];

      Arrays.fill(table, 0);

      table[0] = 1;

      for (int i = 1; i < n; i++) {
        for (int j = i; j <= n; j++) {
          table[j] += table[j - i];
        }
      }
      return table[n];
    }
  }

}
