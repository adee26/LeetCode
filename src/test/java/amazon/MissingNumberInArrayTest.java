package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberInArrayTest {
    private MissingNumberInArray missingNumberInArray = new MissingNumberInArray();

    @Test
    void shouldReturnMissingNumber() {
        int[] array = {3,7,1,2,8,4,5};
        int missingNumber = 6;
        assertEquals(missingNumber, missingNumberInArray.findMissingNumber(array));
    }

}