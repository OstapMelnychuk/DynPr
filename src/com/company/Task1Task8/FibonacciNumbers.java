package com.company.Task1Task8;

public class FibonacciNumbers {
    public static void fibNumb(int n){
        if(n == 1){
            System.out.println("The Fibonacci Number is " + 1 + ".");
        }
        else {
            int first = 1;
            int second = 1;

            for(int i = 0; i < n - 1; i++){
                int sum = first + second;
                first = second;
                second = sum;
            }
            System.out.println(second);
        }
    }
}
