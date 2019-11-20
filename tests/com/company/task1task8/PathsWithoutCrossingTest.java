package com.company.task1task8;

import com.company.task1task8.PathsWithoutCrossing;
import org.junit.Assert;
import org.junit.Test;

public class PathsWithoutCrossingTest {

  @Test
  public void countWays() {
    Assert.assertEquals(42, PathsWithoutCrossing.countWays(10));
    Assert.assertEquals(0, PathsWithoutCrossing.countWays(-1));
  }
}