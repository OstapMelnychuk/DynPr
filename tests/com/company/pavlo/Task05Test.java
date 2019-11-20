package com.company.pavlo.test;

import com.company.pavlo.Task05;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task05Test {

  @Test
  public void countWaysToRepresentntNumber() {
    Integer[] mas1 = {1, 5, 6};
    Integer[] mas2 = {2, 3, 4};
    Integer[] mas3 = {1, 1, 1};
    Integer[] mas4 = {2, 2, 3};
    Integer[] mas5 = {-1, -2, -3};
    Integer[] mas6 = {-1, 2, 3};
    Integer[] mas7 = {};


    assertEquals(6, Task05.countWaysToRepresentNumber(7, mas1));
    assertEquals(1, Task05.countWaysToRepresentNumber(1, mas1));

    assertEquals(0, Task05.countWaysToRepresentNumber(1, mas2));

    assertEquals(1, Task05.countWaysToRepresentNumber(1, mas3));
    assertEquals(1, Task05.countWaysToRepresentNumber(4, mas4));

    assertEquals(13, Task05.countWaysToRepresentNumber(5, mas5));

    assertEquals(13, Task05.countWaysToRepresentNumber(5, mas6));

    assertEquals(0, Task05.countWaysToRepresentNumber(-7, mas1));


    assertEquals(0, Task05.countWaysToRepresentNumber(-7, mas7));
  }
}