package com.company.task1task8;

import com.company.task1task8.PathsWithoutCrossing;
import org.junit.Assert;
import org.junit.Test;

public class PathsWithoutCrossingTest {

  @Test
  public void countWays() {
    int number = 215000;
    Assert.assertEquals(42, PathsWithoutCrossing.countWays(10));
    Assert.assertEquals(0, PathsWithoutCrossing.countWays(-1));
    Assert.assertEquals(0, PathsWithoutCrossing.countWays(-10));
    Assert.assertEquals(0, PathsWithoutCrossing.countWays(number));
  }

  @Test
  public void catalanNumber() {
    Assert.assertEquals(0, PathsWithoutCrossing.catalanNumber(-3));
    Assert.assertEquals(42, PathsWithoutCrossing.catalanNumber(5));

  }
}