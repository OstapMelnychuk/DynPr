package com.company.sort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

  @Test
  public void partition() {
    int[] arr =  {3, 5 ,7 ,3 ,2, 1, 10};
    int[] arr2 =  {3, 5, 8 ,7 ,3 ,2, 4};

    Assert.assertEquals(6, QuickSort.partition(arr, 1, 6));
    Assert.assertEquals(5, QuickSort.partition(arr2, 5, 2));
  }

  @Test
  public void testSort() {
    int[] arr =  {3, 5 ,7 ,3 ,2, 1, 10};
    int[] expectedArr = {1, 2, 3, 3, 5, 7, 10};

    int[] emptyArr = {};


    QuickSort.sort(arr);
    Assert.assertArrayEquals(expectedArr, arr);
    Assert.assertArrayEquals(emptyArr, emptyArr);
  }
}