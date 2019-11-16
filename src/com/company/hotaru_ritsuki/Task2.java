package com.company.hotaru_ritsuki;
import java.util.HashMap;

public class Task2 {
    protected static HashMap<Integer, Integer> fibnumbers = new HashMap<Integer, Integer>();
    static {
        fibnumbers.put(0, 0);
        fibnumbers.put(1, 1);
    }
    public static int getFibonacciNumberBottomUpWithCache(int n) {
        if (fibnumbers.containsKey(n)) {
            return fibnumbers.get(n);
        }
        for(int i = 2; i <= n; i++) {
            fibnumbers.put(i, fibnumbers.get(i - 1) + fibnumbers.get(i - 2));
        }
        return fibnumbers.get(n);
    }

    public static void main(String[] args) {

    }
}
