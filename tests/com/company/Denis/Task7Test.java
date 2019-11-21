package com.company.Denis;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task7Test {

  @Test
  public void coverTheDistance() {
    assertEquals(4, Task7.coverTheDistance(3));
    assertEquals(24, Task7.coverTheDistance(6));
    assertEquals(1, Task7.coverTheDistance(1));
    assertEquals(1, Task7.coverTheDistance(0));
    assertEquals(0, Task7.coverTheDistance(-1));
  }
}