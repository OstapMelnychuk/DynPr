package com.company.misha;

import com.company.misha.LongestSubsequence;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubsequenceTest {
  LongestSubsequence lS;
  @Test
  public void findTheLongestSubsequence() {
    lS=new LongestSubsequence();
    assertEquals(-1, lS.findTheLongestSubsequence("a b d"));
    assertEquals(3, lS.findTheLongestSubsequence("3 4 7 8 9"));
    assertEquals(-1, lS.findTheLongestSubsequence("a 4 7 8 9"));
    assertEquals(-1, lS.findTheLongestSubsequence(" "));
    assertEquals(1, lS.findTheLongestSubsequence("1"));
  }
}