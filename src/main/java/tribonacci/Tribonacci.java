package tribonacci;

import java.util.HashMap;

public class Tribonacci {
    private HashMap<Long, Long> memo = new HashMap<>();

    /**
     * The Tribonacci sequence Tn is defined as follows:
     * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
     * Given n, return the value of Tn.
     */
    public long returnTribonacciNumberRecursively(long n) {
        if(n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        return returnTribonacciNumberRecursively(n-1)
                + returnTribonacciNumberRecursively(n-2)
                + returnTribonacciNumberRecursively(n-3);
    }

    public long returnTribonacciDynamically(long n) {
        if(n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        if(!memo.containsKey(n)) {
            memo.put(n, returnTribonacciDynamically(n-1)
                        + returnTribonacciDynamically(n-2)
                        + returnTribonacciDynamically(n-3));
        } else {
            return memo.get(n);
        }

        return memo.get(n);
    }
}
