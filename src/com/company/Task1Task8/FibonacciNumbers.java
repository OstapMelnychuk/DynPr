package com.company.Task1Task8;

public class FibonacciNumbers {
    public static int fibNumb(int n) {
        int first = 1;
        int second = 1;
        if(n <= 0){
            return 0;
        }
        if (n == 1) {
            return n;
        } else {
            for (int i = 0; i < n - 2; i++) {
                int sum = first + second;
                first = second;
                second = sum;
            }
        }
        return second;
    }
}
