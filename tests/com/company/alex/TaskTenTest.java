package com.company.alex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTenTest {
  TaskTen t1;

  @Before
  public void setUpTaskTen() {
    t1 = new TaskTen();

  }

  @After
  public void tearDownTenTest() {
    t1 = null;
  }

  @Test
  public void max() {
    assertEquals(5, t1.max(4, 5));
    assertEquals(5, t1.max(5, 4));
    assertEquals(0, t1.max(-1, 0));
    assertEquals(1, t1.max(1, -1));

  }

  @Test
  public void lps() {
    assertEquals(5, t1.lps("banana"));
  }
}