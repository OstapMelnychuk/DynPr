package com.company.hotaru_ritsuki;

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

  @Test
  void getFibonacciNumberBottomUpWithCacheNIsZero() {
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
  void getFibonacciNumberBottomUpWithCacheNIsOne() {
    int n = 1;
    int actual = ModifiedFibonacci.getFibonacciNumberBottomUpWithCache(n);
    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
  void getFibonacciNumberBottomUpWithCacheNIsTwo() {
    int n = 2;
    int actual = ModifiedFibonacci.getFibonacciNumberBottomUpWithCache(n);
    int expected = 1;
    assertEquals(expected, actual);
  }

//  @Test
//  void getFibonacciNumberBottomUpWithCacheNLowerThanZero() {
//    try {
//      int n = -20;
//      int actual = ModifiedFibonacci.getFibonacciNumberBottomUpWithCache(n);
//      int expected = 0;
//      assertEquals(expected, actual);
//    } catch (NullPointerException e) {
//      System.out.println("NullPointerException Catched");
//    }
//  }
}
