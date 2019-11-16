package com.company.misha;

public class FriendPairs {
    private int numberOfFriends;

    public FriendPairs(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public void findNumberOfPair() {
        try {
            int mas[] = new int[numberOfFriends + 1];

            for (int i = 0; i <= numberOfFriends; i++) {
                if (i <= 2) {
                    mas[i] = i;
                } else {
                    mas[i] = mas[i - 1] + (i - 1) * mas[(i - 2)];
                }
            }

            System.out.println(mas[numberOfFriends]
                    + " is number of ways in which friends can remain single or can be paired up.");
        }catch (NegativeArraySizeException e){
            System.out.println("The number cannot be negative");
        }
    }


}
