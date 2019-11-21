package com.company.olha;
import com.company.Olha.TaskSix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TaskSixTest {

  @Test
  public void find() {
    assertEquals(0, TaskSix.countSumWays(0));
    assertEquals(6,TaskSix.countSumWays(5));
    assertEquals(0,TaskSix.countSumWays(-10));
  }
}
