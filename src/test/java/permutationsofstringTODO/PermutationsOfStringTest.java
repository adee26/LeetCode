package permutationsofstringTODO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsOfStringTest {

    @Test
    void shouldCheckPermutationsOfString() {
        String s1 = "adc";
        String s2 = "dcda";

        assertTrue(PermutationsOfString.checkAllPermutations(s1, s2));
    }

    @Test
    void shouldReturnFalseForStringNotIncluded() {
        String s1 = "abc";
        String s2 = "ccccbbbbaaaa";

        assertFalse(PermutationsOfString.checkAllPermutations(s1, s2));
    }

}