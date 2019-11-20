package com.company.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingSortTest {
  private CountingSort CS;

  @Test
  public void countingSort() {
    CS = new CountingSort();
    int[] arr = {};
    int[] expected = {};
    int[] actual = CS.sort(arr);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(arr[i], actual[i]);
    }

    arr =new int[] {2,1};
    expected = new int[]{1, 2};
    actual = CS.sort(arr);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(arr[i], actual[i]);
    }

  }
}