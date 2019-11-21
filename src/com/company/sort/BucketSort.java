package com.company.sort;

/**
 * This class is for Bucket Sort.
 *
 * @author Olha
 * @version 1.0
 * @since 2019-11-20
 */

public class BucketSort implements Sort {

  /**
   * This method realises Bucket Sort.
   *
   * @param array this is an array which will besorted
   */
  @Override
  public int[] sort(int[] array) {
    boolean negative = false;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        negative = true;
      }

    }
    if (negative) {
      System.out.println("Negative, we can't applie this typeof sorting for array of negative nubers.");
      return array;
    } else {
      int maxVal = 0;
      int minVal = 0;
      for (int i = 0; i < array.length; i++) {
        if (array[i] > maxVal) {
          maxVal = array[i];
        } else {
          if (array[i] < minVal) {
            minVal = array[i];
          }
        }

      }
      System.out.println(maxVal);
      System.out.println(minVal);
      if (Math.abs(minVal) > maxVal) {
        maxVal += Math.abs(minVal) * 2;
        System.out.println(maxVal);
      } else {
        maxVal = maxVal * 2;
        System.out.println(maxVal);
      }

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
    return array;
  }

}