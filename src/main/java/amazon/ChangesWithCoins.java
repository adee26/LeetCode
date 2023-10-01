package amazon;

import java.util.HashMap;

public class ChangesWithCoins {
    private HashMap<Integer, Boolean> memo = new HashMap<>();

    /**
     * Suppose we have coin denominations of [1, 2, 5] and the total amount is 7. We can make changes in the following 6 ways:
     * 1 1 1 1 1 1 1
     * 1 1 1 1 1 2
     * 1 1 1 2 2
     * 1 2 2 2
     * 1 1 5
     * 2 5
     */
    public int solveCoinChange(int amount, int[] coins) {
        if (amount == 0) {
            return 1;
        }

        if (amount < 0) {
            return -1;
        }

        int counter = 0;

        for (int coin : coins) {
            int subAmount = amount - coin;
            int numOfWays = solveCoinChange(subAmount, coins);
            if(numOfWays != -1) {
                counter = counter + numOfWays;
            }
        }

        return counter; //TODO
    }
}
