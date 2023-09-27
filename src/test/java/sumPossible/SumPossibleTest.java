package sumPossible;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumPossibleTest {

    private SumPossible sumPossible = new SumPossible();

    @Test
    void shouldReturnTrueForSumPossibleRecursively() {
        int amount = 8;
        int[] array = {5,12,4};

        boolean result = sumPossible.findSumPossibleRecursively(amount, array);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForSumPossibleRecursively() {
        int amount = 7;
        int[] array = {3,5,8};

        boolean result = sumPossible.findSumPossibleRecursively(amount, array);

        assertFalse(result);
    }

    @Test
    void shouldReturnTrueForSumPossibleDinamically() {
        int amount = 13;
        int[] array = {3,5};

        boolean result = sumPossible.findSumPossibleDynamically(amount, array);

        assertTrue(result);
    }

}