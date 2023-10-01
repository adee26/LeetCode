package containerWithMostWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void shouldTesMaxAreaBruteForce() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = ContainerWithMostWater.maxAreaTwoPointers(height);
        assertEquals(49, maxArea);
    }

}