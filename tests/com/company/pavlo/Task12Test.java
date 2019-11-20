package com.company.pavlo.test;

import com.company.pavlo.Task12;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task12Test {

  @Test
  public void countWaysToTileTheFloor() {

    assertEquals(1, Task12.countWaysToTileTheFloor(2,3));
    assertEquals(2, Task12.countWaysToTileTheFloor(4,4));

    assertEquals(6, Task12.countWaysToTileTheFloor(6,3));

  }
}