/*
 *  Vasyl Petrashchuk
 *
 * Copyright (c) 1993-2019 SoftServe, Inc. All Rights Reserved
 * This software is the confidential and proprietary information of SoftServe Inc.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with SoftServe.
 */

package com.company.hotaru_ritsuki;

/**
 * The class HighLowEffort intended to find the maximum amount of cost
 * you can perform within defined number of days.
 *
 * @author Vasyl Petrashchuk
 * @version 1.0 17 Nov 2019
 */
public class HighLowEffort {

  /**
   * Returns the maximum among the 2 numbers.
   *
   * @param x First number
   * @param y Second number
   * @return maximum among the 2 numbers
   */
  static int max(int x, int y) {
    return (x > y ? x : y);
  }

  /**
   * Returns maximum amount of task that can be done till day n.
   *
   * @param high Array of the cost of tasks with high effort
   * @param low  Array of the cost of tasks with low effort
   * @param n    Number of days
   * @return The maximum value per n days
   */
  private static int maxTasks(int[] high, int[] low, int n) {
    // An array taskdp that stores the maximum task done
    if (n == 0) {
      return 0;
    }
    int[] taskdp = new int[n + 1];

    // If n = 0, no solution exists
    taskdp[0] = 0;

    // If n = 1, high effort task on that day will be the solution
    taskdp[1] = high[0];

    // Fill the entire array determining which task to choose on day i
    for (int i = 2; i <= n; i++) {
      taskdp[i] = Math.max(high[i - 1] + taskdp[i - 2],
              low[i - 1] + taskdp[i - 1]);
    }
    return taskdp[n];

  }

  /**
   * Driver code.
   *
   * @param args Command line arguments
   */
  public static void main(String[] args) {
    int n = 5;
    int[] high = {3, 6, 8, 7, 6};
    int[] low = {1, 5, 4, 5, 3};
    System.out.println(maxTasks(high, low, n));
  }
}

