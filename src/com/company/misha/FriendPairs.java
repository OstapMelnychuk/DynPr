package com.company.misha;

/**
 * This class finds out the total number of ways in which friends can remain single
 * or can be paired up.
 */
public class FriendPairs {

  /**
   * This method looks for the number of all possible ways to create pairs of numbers.
   *
   * @param numberOfFriends the size of a string of numbers
   */
  public void findNumberOfPair(int numberOfFriends) {
    try {
      int[] mas = new int[numberOfFriends + 1];

      for (int i = 0; i <= numberOfFriends; i++) {
        if (i <= 2) {
          mas[i] = i;
        } else {
          mas[i] = mas[i - 1] + (i - 1) * mas[(i - 2)];
        }
      }

      System.out.println(mas[numberOfFriends]
              + " is number of ways in which friends can remain single or can be paired up.");
    } catch (NegativeArraySizeException e) {
      System.out.println("The number cannot be negative");
    }
  }


}
