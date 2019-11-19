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
 * <h1>The class Fibonacci Numbers serves to find n-th Fibonacci Number.</h1>
 * @author Ostap Melnychuk
 * @version 1.1 November 17.11.2019
 */

public class FibonacciNumbers {
  /**
   * Method fibNumb finds Fibonacci Number at defined position {@param n}.
   * @param n n is a number or index of Fibonacci number in Fibonacci row
   * @return {@param n}-th Fibonacci number in Fibonacci row
   * @since 1.1
   */
  public static int fibNumb(int n) {
    int first = 1;
    int second = 1;
    if (n <= 0) {
      return 0;
    } else {
      for (int i = 0; i < n - 2; i++) {
        int sum = first + second;
        first = second;
        second = sum;
      }
    }
    return second;
  }
}
