package minChange;

import java.util.HashMap;

public class MinChange {
    private HashMap<Integer, Integer> memo = new HashMap<>();

    /**
     * return min amount of coins for summing the amount.
     */
    public int minChange(int amount, int[] coins) {
        if(amount == 0) {
            return 0;
        }

        if(amount < 0) {
            return -1;
        }

        int minCoins = -1;

        for (int num : coins) {
            int remainingAmount = amount - num;
            int subCoins = minChange(remainingAmount, coins);

            if (subCoins != -1) {
                int numCoins = 1 + subCoins;
                if (numCoins < minCoins || minCoins == -1) {
                    minCoins = numCoins;
                }
            }
        }

        return minCoins;
    }

    public int minChangeDynamic(int amount, int[] coins) {
        if(amount == 0) {
            return 0;
        }

        if(amount < 0) {
            return -1;
        }

        if(memo.containsKey(amount)){
            return memo.get(amount);
        }

        int minChange = -1;

        for (int coin : coins){
            int subAmount = amount - coin;
            int subCoins = minChangeDynamic(subAmount, coins);
            memo.put(subAmount, subCoins);

            if(subCoins != -1){
                int subCharge = 1 + subCoins;
                if (subCharge < minChange || minChange == -1) {
                    minChange = subCharge;
                }
            }
        }

        return minChange;
    }
}
