package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangesWithCoinsTest {
    private ChangesWithCoins changesWithCoins = new ChangesWithCoins();

    @Test
    void shouldReturnNumOfWays() {
        int num = 7;
        int[] coins = {1,2,5};
        int expected = 6;
        int actual = changesWithCoins.solveCoinChange(num, coins);

        assertEquals(expected, actual);
    }

}