package com.company.hotaru_ritsuki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class HighLowEffortTest {

  @Test
  void max() {
    int x = 4;
    int y = 5;
    int expected = 5;
    int actual = HighLowEffort.max(x,y);
    assertEquals(expected, actual);
  }

  @Test
  void maxEqual() {
    int x = 0;
    int y = 0;
    int expected = 0;
    int actual = HighLowEffort.max(x,y);
    assertEquals(expected,actual);
  }

  @Test
  void maxTasks() {
    int n = 5;
    int[] low = new int[]{1, 5, 4, 5, 3};
    int[] high = new int[]{3, 6, 8, 7, 6};

    int expected = 20;
    int actual = HighLowEffort.maxTasks(high, low, n);
    assertEquals(expected, actual);
  }

  @Test
  void maxTasksNEqualsOne() {
    int n = 1;
    int[] low = new int[]{1, 5, 4, 5, 3};
    int[] high = new int[]{3, 6, 8, 7, 6};

    int expected = 3;
    int actual = HighLowEffort.maxTasks(high, low, n);
    assertEquals(expected, actual);
  }

  @Test
  void maxTasksNEqualsZero() {
    int n = 0;
    int[] low = new int[]{1, 5, 4, 5, 3};
    int[] high = new int[]{3, 6, 8, 7, 6};

    int expected = 0;
    int actual = HighLowEffort.maxTasks(high, low, n);
    assertEquals(expected, actual);
  }

  @Test
  void maxTasksNLoverThanZero() {
    int n = -20;
    int[] low = new int[]{2, 5, 4, 5, 3};
    int[] high = new int[]{3, 6, 8, 7, 6};

    int expected = 0;
    int actual = HighLowEffort.maxTasks(high, low, n);
    assertEquals(expected, actual);
  }
}
