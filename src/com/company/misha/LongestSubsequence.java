package com.company.misha;

public class LongestSubsequence {
    private String sequence;
    private String sequenceOfNumbers[];
    private int masOfNumbersInTheSequence[];

    public void findTheLongestSubsequence(String sequence) {
        int theLongestSubsequences = 0;

        sequenceOfNumbers = sequence.split(" ");
        masOfNumbersInTheSequence = new int[sequenceOfNumbers.length];

        boolean isCorrectlyEntered = countSubsequences();

        if (isCorrectlyEntered) {
            for (int i = 0; i < masOfNumbersInTheSequence.length; i++) {
                if (theLongestSubsequences < masOfNumbersInTheSequence[i]) {
                    theLongestSubsequences = masOfNumbersInTheSequence[i];
                }
            }

            System.out.println("The longest subsequence is " + theLongestSubsequences);
        }
    }

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
                System.out.println("The numbers are incorrectly entered. \"" +
                        sequenceOfNumbers[i] + "\" is not a number");

                return false;
            }
        }

        masOfNumbersInTheSequence[numberOfSubSequence] = count;

        return true;
    }

}
