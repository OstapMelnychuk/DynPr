package com.company.sort;

/**
 * Quick-sort for array of integers.
 *
 * @author Vasyl Petrashchuk
 * @version 1.3 18 Nov 2019
 */

public class QuickSort implements Sort{
  /**
   * This function takes last element as pivot,
   * places the pivot element at its correct
   * position in sorted array, and places all
   * smaller (smaller than pivot) to left of
   * pivot and all greater elements to right
   * of pivot.
   *
   * @param arr Input array
   * @param low Low index
   * @param high High index
   * @return
   */
  static int partition(int []arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1); // index of smaller element
    for (int j = low; j < high; j++) {
      // If current element is smaller than the pivot
      if (arr[j] < pivot) {
        i++;

        // swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // swap arr[i+1] and arr[high] (or pivot)
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
  }


  /**
   * The main function that implements QuickSort().
   *
   * @param arr  Array to be sorted
   * @param low  Starting index
   * @param high Ending index
   */
  static void sort(int []arr, int low, int high) {
    if (low < high) {
      /* pi is partitioning index, arr[pi] is
         now at right place */
      int pi = partition(arr, low, high);
      // Recursively sort elements before
      // partition and after partition
      sort(arr, low, pi - 1);
      sort(arr, pi + 1, high);
    }
  }

  /**
   *
   * @param arr Array to be sorted
   */
  @Override
  public int[] sort(int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    sort(arr, low, high);
    return arr;
  }
}