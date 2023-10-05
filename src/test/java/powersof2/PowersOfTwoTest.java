package powersof2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PowersOfTwoTest {

    @Test
    void shouldReturnPowersOfTwo() {
        int n = 10;
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,8));
        assertEquals(list, PowersOfTwo.powersOf2(n));
    }

}