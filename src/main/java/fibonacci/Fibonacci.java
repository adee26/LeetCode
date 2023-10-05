package fibonacci;

import java.util.HashMap;

public class Fibonacci {
    HashMap<Long, Long> memo = new HashMap<>();

    /**
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
     * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
     * F(0) = 0, F(1) = 1
     * F(n) = F(n - 1) + F(n - 2), for n > 1.
     * Given n, calculate F(n)
     */

    public int findFibonacciNumberClassic(int n) { //0 1 1 2 3 5
        int firstNumber = 0;
        int secondNumber = 1;

        for(int i = 0; i < n; i++) {
            int temp = secondNumber; //0(1)
            secondNumber = firstNumber + secondNumber; //O(1)
            firstNumber = temp; //O(1)
        }

        return firstNumber;
    }

    public long findFibonacciUsingRecursion(long n) { //5 -> 4           1 + 0 + 1
        if(n == 0 || n == 1) {
            return n;
        }

        return findFibonacciUsingRecursion(n-2) + findFibonacciUsingRecursion(n-1); //3
    }

    public long findFibonacciUsingDynamicProgramming(long n) {
        if(n == 0 || n == 1) {
            return n;
        }

        if(memo.get(n) == null){
            memo.put(n, findFibonacciUsingDynamicProgramming(n-1) + findFibonacciUsingDynamicProgramming(n-2));
        }else{
            return memo.get(n);
        }

        return memo.get(n);
    }
}
