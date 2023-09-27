package minChange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinChangeTest {
    private MinChange minChange = new MinChange();

    @Test
    void returnMinChange() {
        int amount = 8;
        int[] coins = {1,5,4,12};

        int expected = 2;
        int actual = minChange.minChange(amount, coins);
        assertEquals(expected, actual);
    }

    @Test
    void returnMinChangeDynamically() {
        int amount = 8;
        int[] coins = {1,5,4,12};

        int expected = 2;
        int actual = minChange.minChangeDynamic(amount, coins);

        assertEquals(expected, actual);
    }

}