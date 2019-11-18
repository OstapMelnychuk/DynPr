package com.company.alex;

/**
 *
 * This class use to find which is the member of position n in our interesting row.
 *
 * @author      Oleksiy Radyuk
 * @version     1.0
 * @since       2019-11-18
 */


public class TaskThree {

  /**
   * Find the next member of the row above .
   *
   * @param  n element index from array .
   * @return nth element from array.
   */

  public int interestingRow(int n) {
    int[] dp = new int[n + 1];

    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + 2 * dp[i - 2];
    }

    return dp[n];
  }
}
