package com.company.sort;

import java.util.Arrays;

/**
 * This class is for Bucket Sort.
 *
 * @author Olha
 * @version 1.0
 * @since 2019-11-20
 */

public class BucketSort {

  /**
   * This method realises Bucket Sort.
   *
   * @param array  this is an array which will besorted
   * @param maxVal maximum value (integer number)
   */

  static void bucketSort(int[] array, int maxVal) {
    int[] bucket = new int[maxVal + 1];

    for (int i = 0; i < bucket.length; i++) {
      bucket[i] = 0;
    }

    for (int i = 0; i < array.length; i++) {
      bucket[array[i]]++;
    }

    int outPos = 0;
    for (int i = 0; i < bucket.length; i++) {
      for (int j = 0; j < bucket[i]; j++) {
        array[outPos++] = i;
      }
    }

  }

}