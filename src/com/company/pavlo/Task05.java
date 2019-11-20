package com.company.pavlo;


/**
 * <h1>Repetitions counter.</h1>
 * <p>This class using to count  how many ways we have to represent one number
 * with a given array of numbers</p>
 * <p>If array contains negative numbers program will get absolute value from number,
 * if array contains 0 it will be skipped </p>
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
  public static int countWaysToRepresentNumber(Integer number, Integer[] arr) {
    if (number < 1) {
      System.out.println("Number should be between 1 and 90000");
      return 0;
    }
    if (arr.length > 1) {
      boolean isArrayEquals = false;
      for (int i = 1; i < arr.length; i++) {
        if (!arr[0].equals(arr[i])) {
          isArrayEquals = false;
          break;
        } else {
          isArrayEquals = true;
        }
      }
      if (isArrayEquals) {
        return 1;
      }
    }
    int[] sequence = new int[number + 1];
    sequence[0] = BASE_CASE;
    for (int i = 1; i <= number; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] < 0) {
          arr[j] = Math.abs(arr[j]);
        }
        if (i >= arr[j] && arr[j] != 0) {
          sequence[i] += sequence[i - arr[j]];
        }
      }
    }
    return sequence[number];
  }
}
