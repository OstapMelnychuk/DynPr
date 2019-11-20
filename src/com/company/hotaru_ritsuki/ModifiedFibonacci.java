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

import java.util.HashMap;

/**
 * The class ModifiedFibonacci is solution of finding Fibonacci number at defined position.
 *
 * @author Vasyl Petrashchuk
 * @version 1.1 17 Nov 2019
 */
public class ModifiedFibonacci {
  /**
   * Set of modified Fibonacci numbers, where key is position.
   */
  protected static HashMap<Integer, Integer> fibnumbers = new HashMap<Integer, Integer>();

  static {
    fibnumbers.put(1, 1);
    fibnumbers.put(2, 1);
    fibnumbers.put(3, 1);
  }

  /**
   * Find a value of modified fibonacci sequence at the {@param position}.
   *
   * @param position , position of the number of modified fibonacci sequence
   * @return member of given {@param position} in modified fibonacci sequence
   * @throws NullPointerException if the given {@param position} is less than 1
   * @since 1.1
   */
  public static int getFibonacciNumberBottomUpWithCache(int position) {
    if (fibnumbers.containsKey(position)) {
      return fibnumbers.get(position);
    }
    for (int i = fibnumbers.size()+1; i <= position; i++) {
      fibnumbers.put(i, fibnumbers.get(i - 1) + fibnumbers.get(i - 3));
    }
    return fibnumbers.get(position);
  }

  /**
   * Entry point of program.
   *
   * @param args Command-line args
   */
  public static void main(String[] args) {
    System.out.println(getFibonacciNumberBottomUpWithCache(58));
    System.out.println(getFibonacciNumberBottomUpWithCache(59));
    System.out.println(getFibonacciNumberBottomUpWithCache(58));
    System.out.println(getFibonacciNumberBottomUpWithCache(57));
    System.out.println(getFibonacciNumberBottomUpWithCache(15));


  }
}
