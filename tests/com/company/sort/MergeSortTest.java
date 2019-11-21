package com.company.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
  MergeSort CS;

  @Test
  public void sort() {
    CS=new MergeSort();
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