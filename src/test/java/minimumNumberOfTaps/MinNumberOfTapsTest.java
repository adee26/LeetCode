package minimumNumberOfTaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinNumberOfTapsTest {

    @Test
    void shouldReturnMinNumberOfTaps() {
        int[] testData = {1,2,1,0,2,1,0,1};
        int n = 7;
        int expectedNumber = 3;
        int actualNumber = MinNumberOfTaps.returnMinNumberOfTaps(n, testData);

        assertEquals(expectedNumber, actualNumber);

    }

    @Test
    void shouldReturnMinNumberOfTapsNegativeScenario() {
        int[] testData = {0,0,0,0};
        int n = 3;
        int expectedNumber = -1;
        int actualNumber = MinNumberOfTaps.returnMinNumberOfTaps(n, testData);

        assertEquals(expectedNumber, actualNumber);

    }

}