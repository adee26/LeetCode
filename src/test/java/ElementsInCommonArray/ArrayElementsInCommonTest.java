package ElementsInCommonArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementsInCommonTest {

    @Test
    void shouldReturnNoElementsInCommon() {
        int[] arr1 = {13, 27, 35, 40, 49, 55, 59};
        int[] arr2 = {17, 35, 39, 40, 55, 58, 60};
        int expected = 3;
        int actual = ArrayElementsInCommon.findElementsInCommon(arr1, arr2);
        assertEquals(expected, actual);
    }

}