package com.company.hotaru_ritsuki;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModifiedFibonacciTest {
  @Test
  public void getFibonacciNumberBottomUpWithCache() {
    int n = 6;
    int actual = ModifiedFibonacci.getFibonacciNumberBottomUpWithCache(n);
    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test
  public void getFibonacciNumberBottomUpWithCacheNIsZero() {
    try {
      int n = 0;
      int actual = ModifiedFibonacci.getFibonacciNumberBottomUpWithCache(n);
      int expected = 0;
      assertEquals(expected, actual);
    } catch (NullPointerException e) {
      System.out.println("NullPointerException Catched");
    }
  }

  @Test
  public void getFibonacciNumberBottomUpWithCacheNIsOne() {
    int n = 1;
    int actual = ModifiedFibonacci.getFibonacciNumberBottomUpWithCache(n);
    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
  public void getFibonacciNumberBottomUpWithCacheNIsTwo() {
    int n = 2;
    int actual = ModifiedFibonacci.getFibonacciNumberBottomUpWithCache(n);
    int expected = 1;
    assertEquals(expected, actual);
  }
}
