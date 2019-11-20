package com.company.sort.factory;

import com.company.sort.Sort;

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

    switch (sortType) {
      case "Task 1":
        return null;
      default:
        System.out.println("Not found task");
        return null;
    }

  }
}
