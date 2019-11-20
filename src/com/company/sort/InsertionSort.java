package com.company.sort;
/**
 *
 * This class use to sort integer array by insertion sort.
 *
 * @author      Oleksiy Radyuk
 * @version     1.0
 * @since       2019-11-18
 */

public class InsertionSort {

  /**
   * Sorting array.
   * @param arr which need to be sorted.
   * @return sorted array.
   */

  public static int[] sort(int arr[]) {
    if (arr.length > 0) {
      int n = arr.length;
      for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
          arr[j + 1] = arr[j];
          j = j - 1;
        }
        arr[j + 1] = key;
      }
      return arr;
    }
    else {
      return arr;
    }
  }
}
