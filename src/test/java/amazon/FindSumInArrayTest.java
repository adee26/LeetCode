package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSumInArrayTest {

    private final FindSumInArray findSumInArray = new FindSumInArray();

    @Test
    void shouldFindTargetSumInArray() {
        int[] input = {2,1,8,4,7,3};
        int target = 3;
        assertTrue(findSumInArray.findIfSumExists(target, input));
    }

}