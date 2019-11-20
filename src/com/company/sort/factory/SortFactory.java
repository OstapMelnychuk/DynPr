package com.company.sort.factory;

import com.company.sort.Sort;

public class SortFactory {

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
