package com.company.sort;

import java.util.Arrays;

public class MergeSort {
  private static int[] arrToSort;

  public static int[] sort(int[] arr) {
    arrToSort = arr;
    int[] workSpace = new int[arr.length];
    reqMergeSort(workSpace, 0, arr.length - 1);
    return arrToSort;
  }

  private static void reqMergeSort(int[] arr, int lowBound, int upBound) {
    if (lowBound == upBound) {
      return;
    }
    int mid = ((lowBound + upBound) / 2);
    reqMergeSort(arr, lowBound, mid);
    reqMergeSort(arr, mid + 1, upBound);
    merge(arr, lowBound, mid + 1, upBound);
  }

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
