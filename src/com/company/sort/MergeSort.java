package com.company.sort;

/**
 * Marge sort for array of integers.
 *
 * @author Vasyl Petrashchuk
 * @version 1.3 18 Nov 2019
 */

public class MergeSort implements Sort {
  /**
   * This is input array of integers to be sorted.
   */
  private static int[] arrToSort;


  /**
   * This method create workspace array and invoke method reqMergeSort.
   *
   * @param arr which need to be sorted.
   * @return sorted array.
   */
  public int[] sort(int[] arr) {
    arrToSort = arr;
    int[] workSpace = new int[arr.length];
    reqMergeSort(workSpace, 0, arr.length - 1);
    return arrToSort;
  }

  /**
   * This method divide array on sub-arrays and invoke merge method.
   * @param arr      which need to be sorted.
   * @param lowBound lowerBound of array to sort
   * @param upBound  upperBound of array to sort
   */
  private static void reqMergeSort(int[] arr, int lowBound, int upBound) {
    if (lowBound == upBound) {
      return;
    }
    int mid = ((lowBound + upBound) / 2);
    reqMergeSort(arr, lowBound, mid);
    reqMergeSort(arr, mid + 1, upBound);
    merge(arr, lowBound, mid + 1, upBound);
  }

  /**
   * This method sort array.
   * @param workSpace    which need to be sorted.
   * @param lowPtr lowerBound of array to sort
   * @param highPtr  middle
   * @param upperBound upperBound of array to sort
   */
  private static void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound) {
    int j = 0;
    int lowBound = lowPtr;
    int mid = highPtr - 1;
    int n = upperBound - lowBound + 1;
    while (lowPtr <= mid && highPtr <= upperBound) {
      if (arrToSort[lowPtr] < arrToSort[highPtr]) {
        workSpace[j++] = arrToSort[lowPtr++];
      } else {
        workSpace[j++] = arrToSort[highPtr++];
      }
      while (lowPtr <= mid) {
        workSpace[j++] = arrToSort[lowPtr++];
      }
      while (highPtr <= upperBound) {
        workSpace[j++] = arrToSort[highPtr++];
      }
      for (j = 0; j < n; j++) {
        arrToSort[lowBound + j] = workSpace[j];
      }
    }
  }
}
