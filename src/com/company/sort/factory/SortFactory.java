package com.company.sort.factory;

import com.company.sort.*;

/**
 * Class for working with all sorting classes.
 */
public class SortFactory {

  /**
   * A method for selecting a particular sorting class.
   *
   * @param sortType type of sorting
   * @return sorting class
   */
  public Sort getSort(String sortType) {

    switch (sortType.toLowerCase()) {
      case "insertion sort":
        return new InsertionSort();
      case "counting sort":
        return new CountingSort();
      case "quick sort":
        return new QuickSort();
      case "merge sort":
        return new MergeSort();
      case "bucket sort":
        return new BucketSort();

      default:
        System.out.println("Not found type of sort");
        return null;
    }

  }
}
