package com.company.Denis;

/**
 * Optimized class for painting fence, where we
 * use one variable instead of a table.
 *
 * @author Denis Nechyporuk
 * @version 1.1
 */
public class Task14 {

  /**
   * Given a fence with n posts and k colors. This method
   * find out the number of ways of painting the fence
   * such that at most 2 adjacent posts have the same color
   *
   * @param n number of fence posts
   * @param k number colors
   * @return count of different combination of fence painting
   */
  public static double paintFenceCombination(int n, int k) {
    int sameColor;
    int differentColor;
    int temporary;
    int count;

    if (n < 0 || k < 0) {
      System.out.println("K and N must be positive");
      return 0;
    }
    if (n == 0 || k == 0) {
      return 0;
    }
    if (n == 1) {
      return k;
    }

    sameColor = k;
    differentColor = k * (k - 1);

    if (n == 2) {
      count = sameColor + differentColor;
    } else {
      for (int i = 3; i <= n; i++) {
        temporary = differentColor;
        differentColor = (differentColor + sameColor) * (k - 1);
        sameColor = temporary;
      }
      count = sameColor + differentColor;
    }
    return count;
  }
}
