package com.company.Denis;

/**
 * Class for counting ways to cover
 * distance in 3 steps.
 *
 * @author Denis Nechyporuk
 * @version 1.1
 */
public class Task7 {

  /**
   * Given a distance n. This method count
   * total number of ways to cover the distance
   * with 1, 2 and 3 steps.
   *
   * @param n distance
   * @return calculate our possibility to cover the distance
   */
  public static int coverTheDistance(int n) {
    int[] count = new int[n + 1];

    if (n < 0) {
      return 0;
    }
    if (n == 0 || n == 1) {
      return 1;
    }

    count[0] = 1;
    count[1] = 1;
    count[2] = 2;

    if (n > 2) {
      for (int i = 3; i <= n; i++) {
        count[i] = count[i - 1] + count[i - 2] + count[i - 3];
      }
    }
    return count[n];
  }
}
