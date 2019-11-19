/*
 * Ostap Melnychuk
 *
 * Copyright (c) 1993-2019 SoftServe, Inc. All Rights Reserved
 * This software is the confidential and proprietary information of SoftServe Inc.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with SoftServe.
 */

package com.company.task1task8;

/**
 * <h1>The class PathsWithoutCrossing serves to find all the ways to connect
 * n points on a circle such that no two connecting lines cross each
 * other and every point is connected with one other point.</h1>
 * @author Ostap Melnychuk
 * @version 1.1 November 17.11.2019
 */

public class PathsWithoutCrossing {
  /**
   * Method count all the ways to connect n points on a circle such that no two connecting
   * lines cross each other and every point is connected with one other point.
   *
   * @param n is a number of points in circle
   * @return the number of ways to connect {@param n} points on a circle.
   * @since 1.1
   */

  public static int countWays(int n) {
    if (n < 1) {
      return 0;
    }
    if (n > Integer.MAX_VALUE / 10000) {
      return 0;
    }
    return catalanNumber(n / 2);
  }

  /**
   * Method to find {@param n}-th CatalanNumber.
   *
   * @param n index of a number in Catalan Numbers
   * @return the {@param n}-th Catalan Number.
   * @since 1.1
   */
  private static int catalanNumber(int n) {
    int[] catalan = new int[n + 1];
    catalan[0] = 1;
    catalan[1] = 1;
    for (int i = 2; i <= n; i++) {
      catalan[i] = 0;
      for (int j = 0; j < i; j++) {
        catalan[i] += catalan[j] * catalan[i - j - 1];
      }

    }
    return catalan[n];
  }
}