package com.company.misha;

import org.junit.Test;

import static org.junit.Assert.*;

public class FriendPairsTest {


  @Test
  public void findNumberOfPair() {
    assertEquals(4,FriendPairs.findNumberOfPair(3));
    assertEquals(-1, FriendPairs.findNumberOfPair(-1));
    assertEquals(-1, FriendPairs.findNumberOfPair(-3));
    assertEquals(0, FriendPairs.findNumberOfPair(0));
    assertEquals(1, FriendPairs.findNumberOfPair(1));
  }

}