package com.company.misha;

import com.company.misha.FriendPairs;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendPairsTest {

  private FriendPairs friendPairs;

  @Test
  public void findNumberOfPair() {
    friendPairs=new FriendPairs();
    assertEquals(4,friendPairs.findNumberOfPair(3));
    assertEquals(-1,friendPairs.findNumberOfPair(-1));
    assertEquals(-1,friendPairs.findNumberOfPair(-3));
    assertEquals(0,friendPairs.findNumberOfPair(0));
    assertEquals(1,friendPairs.findNumberOfPair(1));
  }

}