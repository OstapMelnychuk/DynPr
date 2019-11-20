package com.company.pavlo;

import java.util.Arrays;

/**
 * <h1>Repetitions counter.</h1>
 * <p>This class using to count  how many ways we have to represent one number
 * with a given array of numbers</p>
 *
 * @author Baluh Pavlo
 * @version 1.0
 * @since 17.11.19
 */
public class Task05 {

  /**
   * This variable contains base case to build sequence.
   */
  private static final Integer BASE_CASE = 1;

  /**
   * This method finds how many ways we have to represent one number with a given array of numbers.
   *
   * @param number This is  the number to be represent by sum elements of given array
   * @param arr    This is array with numbers to represent given number
   * @return int number of ways we can form number
   */
  public static int countWaysToRepresentntNumber(Integer number, Integer[] arr) {
    int[] sequence = new int[number + 1];
    sequence[0] = BASE_CASE;
    for (int i = 1; i <= number; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i >= arr[j]) {
          sequence[i] += sequence[i - arr[j]];
        }
      }
    }
    System.out.println(Arrays.toString(sequence));
    return sequence[number];
  }
}
