package com.company.denis;

import com.company.task1task8.FibonacciNumbers;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumbersTest {

  @Test
  public void fibNumb() {
    Assert.assertEquals(2, FibonacciNumbers.fibNumb(3));
    Assert.assertEquals(1, FibonacciNumbers.fibNumb(1));
    Assert.assertEquals(233, FibonacciNumbers.fibNumb(13));
    Assert.assertEquals(0, FibonacciNumbers.fibNumb(-3));
    Assert.assertEquals(0, FibonacciNumbers.fibNumb(0));
  }
}