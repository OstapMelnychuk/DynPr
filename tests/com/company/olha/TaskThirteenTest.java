package com.company.olha;
import com.company.Olha.TaskThirteen;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskThirteenTest {
  @Test
  public void countWays() {
    assertEquals(16, TaskThirteen.countWays(2,4));
    assertEquals(0,TaskThirteen.countWays(-2,4));
    assertEquals(0,TaskThirteen.countWays(2,-4));
    assertEquals(0,TaskThirteen.countWays(0,4));
    assertEquals(0,TaskThirteen.countWays(4,0));
    assertEquals(0,TaskThirteen.countWays(0,0));
  }

}
