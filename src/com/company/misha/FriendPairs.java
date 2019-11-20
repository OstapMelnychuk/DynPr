package com.company.misha;

/**
 * This class finds out the total number of ways in which friends can remain single
 * or can be paired up.
 *
 *  @author Mykhailo Slivinskiy
 *  @version 1.1
 */
public class FriendPairs {
  /**
   * This method looks for the number of all possible ways to create pairs of numbers.
   *
   * @param numberOfFriends the size of a string of numbers
   * @return mas[numberOfFriend] count of possible pairs
   */
  public static int findNumberOfPair(int numberOfFriends) {
    if (numberOfFriends > -1) {
      int[] mas = new int[numberOfFriends + 1];

      for (int i = 0; i <= numberOfFriends; i++) {
        if (i <= 2) {
          mas[i] = i;
        } else {
          mas[i] = mas[i - 1] + (i - 1) * mas[(i - 2)];
        }
      }

      return mas[numberOfFriends];

    } else {
      System.out.println("The number cannot be negative");
      return -1;
    }
  }


}
