package com.company.hotaru_ritsuki.test;

import com.company.hotaru_ritsuki.ModifiedFibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedFibonacciTest {
  @Test
  void getFibonacciNumberBottomUpWithCache() {
    int n = 6;
    int actual = ModifiedFibonacci.getFibonacciNumberBottomUpWithCache(n);
    int expected = 4;
    assertEquals(expected, actual);
  }

  @Test(expected = NullPointerException.class)
  void getFibonacciNumberBottomUpWithCacheNIsZero() {
    int n = 0;
    int actual = ModifiedFibonacci.getFibonacciNumberBottomUpWithCache(n);
    int expected = 0;
    assertEquals(expected, actual);
  }
}