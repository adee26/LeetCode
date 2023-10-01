package lengthoflastword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfTheLastWorldTest {

    @Test
    void shouldReturnSizeOfLastWord() {
        String s = "VPtCBexbhyOqEHWMpF  VJOZpC";
        int size = LengthOfTheLastWorld.lengthOfTheLastWorld(s);
        assertEquals(6, size);
    }

}