package longestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void shouldFindLongestPrefix() {
        String[] strings = {"flower","flow","flight"};
        String longestPrefix = LongestCommonPrefix.longestCommonPrefix(strings);
        assertEquals("fl", longestPrefix);
    }

}