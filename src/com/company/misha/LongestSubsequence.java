package com.company.misha;

/**
 * This class to find how many numbers we have with difference one in the maximum sub sequence.
 */
public class LongestSubsequence {
  /**
   * Incoming sentence with sequences.
   */
  private String sequence;
  /**
   * An array of characters taken from sentences.
   */
  private String[] sequenceOfNumbers;
  /**
   * An array of numbers taken from sentences.
   */
  private int[] masOfNumbersInTheSequence;

  /**
   * This method finds how many numbers we have with different one in the maximum subsequence
   * and finds the longest.
   *
   * @param sequence given subsequence
   */
  public int findTheLongestSubsequence(String sequence) {
    int theLongestSubsequences = 0;

    sequenceOfNumbers = sequence.split(" ");
    masOfNumbersInTheSequence = new int[sequenceOfNumbers.length];

    boolean isCorrectlyEntered;

    if (countSubsequences()) {
      isCorrectlyEntered = true;
    } else {
      isCorrectlyEntered = false;
    }

    if (isCorrectlyEntered) {
      for (int i = 0; i < masOfNumbersInTheSequence.length; i++) {
        if (theLongestSubsequences < masOfNumbersInTheSequence[i]) {
          theLongestSubsequences = masOfNumbersInTheSequence[i];
        }
      }

      return theLongestSubsequences;
    } else {
      System.out.println("Data entered incorrectly");
      return -1;
    }
  }

  /**
   * This method finds how many numbers we have with different one in all subsequence.
   *
   * @return false if we have a trouble and true if we found all numbers.
   */
  private boolean countSubsequences() {
    int count = 1;
    int numberOfSubSequence = 0;

    for (int i = 1; i < sequenceOfNumbers.length; i++) {
      try {
        if ((Integer.parseInt(sequenceOfNumbers[i]) - Integer.parseInt(sequenceOfNumbers[i - 1]) == 1)
                || (Integer.parseInt(sequenceOfNumbers[i - 1]) - Integer.parseInt(sequenceOfNumbers[i]) == 1)) {
          count++;
        } else {
          masOfNumbersInTheSequence[numberOfSubSequence] = count;
          count = 1;
          numberOfSubSequence++;
        }
      } catch (NumberFormatException e) {
        System.out.println("The numbers are incorrectly entered. \""
                + sequenceOfNumbers[i] + "\" is not a number");

        return false;
      }
    }

    masOfNumbersInTheSequence[numberOfSubSequence] = count;

    return true;
  }

  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }
}
