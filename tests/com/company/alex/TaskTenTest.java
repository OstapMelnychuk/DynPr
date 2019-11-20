package com.company.alex;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTenTest {

  @Test
  public void max() {
    for(int i=-15;i<15;i+=4){
    assertEquals(i, TaskTen.max(i,i-5));
  }
  }

  @Test
  public void lps() {

  }
}