package com.company.alex;

import org.junit.*;

import static org.junit.Assert.*;

public class TaskThreeTest {
  TaskThree t3;

  @Before
  public void setUpTaskThree() {
    t3 = new TaskThree();

  }

  @After
  public void tearDownThreeTest() {
    t3 = null;
  }

  @Test
  public void interestingRow() {
    assertEquals(1, t3.interestingRow(1));
    assertEquals(11, t3.interestingRow(5));
  }

}