package com.company.Denis;

import com.company.Denis.Task14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Task14Test {

  @Test
  public void paintFenceCombination() {
    assertEquals(16, (long) Task14.paintFenceCombination(2, 4));
    assertEquals(0, (long) Task14.paintFenceCombination(0, 4));
    assertEquals(0, (long) Task14.paintFenceCombination(4, 0));
    assertEquals(0, (long) Task14.paintFenceCombination(-2, 4));
    assertEquals(0, (long) Task14.paintFenceCombination(2, -4));
    assertEquals(1, (long) Task14.paintFenceCombination(2, 1));
    assertEquals(0, (long) Task14.paintFenceCombination(3, 1));
  }
}