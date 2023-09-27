package sumPossible;

import java.util.HashMap;

public class SumPossible {
    HashMap<Integer, Boolean> memo = new HashMap<>();

    /**
     * Can we use these numbers to generate the amount?
     */
    public boolean findSumPossibleRecursively(int amount, int[] numbers) {
        if(amount == 0) {
            return true;
        }

        if(amount < 0) {
            return false;
        }

        for (int i = 0; i<numbers.length; i++) {
            int subAmount = amount - numbers[i];
            if (findSumPossibleRecursively(subAmount, numbers)) {
                return true;
            }

        }

        return false;

    }

    public boolean findSumPossibleDynamically(int amount, int[] numbers) {
        if(amount == 0) {
            return true;
        }

        if(amount < 0) {
            return false;
        }

        if(memo.containsKey(amount)){
            return memo.get(amount);
        }

        for(int num: numbers) {
            int subAmount = amount - num;
            if (findSumPossibleRecursively(subAmount, numbers)) {
                memo.put(amount, true);
                return true;
            }
        }

        memo.put(amount, false);
        return false;
    }

}
