
package com.company.Olha;

/**
 * This class is for Painting Fence Algorithm
 *
 * @author Olha
 * @version 1.0
 * @since 2019-11-19
 */

public class TaskThirteen {
  /**
   * Returns count of ways to color n posts using k colors
   *
   * @param n number of plots
   * @param k number of colors
   * @return number of ways of painting the fence such,
   * that at most 2 adjacent posts have the same color.
   */

  public static long countWays(int n, int k) {

    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return k;
    }

    int same = k * 1;
    int diff = k * (k - 1);

    if ((n < 0) | (k < 0)) {
      System.out.println("Number of plots and number of colors should be greater than 0.");
      return 0;
    } else {

      for (int i = 3; i <= n; i++) {
        int prevDiff = diff;
        diff = (same + diff) * (k - 1);

        same = prevDiff * 1;
      }
      System.out.println("You can paint the fence such numbers of ways: ");
      return same + diff;
    }
  }

}
