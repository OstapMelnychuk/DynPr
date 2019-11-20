package com.company.sort;

/**
 * This class sort array with count sorting method.
 *
 * @author Denis Nechyporuk
 * @version 1.1
 */
public class CountingSort {
  /**
   * This method sort our array with count sorting method.
   *
   * @param arr not sorted array
   * @return sorted array with count sorting method.
   */
  public static int[] countingSort(int[] arr) {

    int max;
    int min;
    int[] countArr;

    if (arr.length == 0) {
      return new int[1];
    }

    for (int value : arr) {
      if (value < 0) {
        System.out.println("array must be only with positive numbers");
        return new int[1];
      }
    }

    max = arr[0];
    min = arr[0];

    for (int value : arr) {
      if (value > max) {
        max = value;
      }
      if (value < min) {
        min = value;
      }
    }

    countArr = new int[max];

    for (int value : arr) {
      countArr[value - min] += 1;
    }

    for (int i = 0, j = 0; i < countArr.length; i++) {
      for (int k = 0; k < countArr[i]; k++) {
        arr[j] = i + min;
        j++;
      }
    }
    return arr;
  }
}
