package com.company.pavlo;

/**
 * <h1>Ways to tile the floor.</h1>
 *
 * @author Baluh Pavlo
 * @version 1.0
 * @since 17.11.19
 */
public class Task12 {

  /**
   * This variable contains base case to build sequence.
   */
  private static final Integer BASE_CASE = 0;

  /**
   * This method count  the number of ways to tile the given floor using 1 x m(second param) tiles.
   *
   * @param n This param show first length of floor
   * @param m This param show second length of floor
   * @return int The number of ways to tile the given floor using 1 x m tiles
   */
  public static int countWaysToTileTheFloor(int n, int m) {
    if (n < 2 || m < 2) {
      System.out.println("both positive integers and > 0");
      return 0;
    }
    int[] sequence = new int[n + 1];
    sequence[0] = BASE_CASE;
    for (int i = 1; i <= n; i++) {
      if (i > m) {
        sequence[i] = sequence[i - 1] + sequence[i - m];
      } else if (i < m) {
        sequence[i] = 1;
      } else {
        sequence[i] = 2;
      }
    }
    return sequence[n];
  }
}
