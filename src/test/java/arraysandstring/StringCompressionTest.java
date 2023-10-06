package arraysandstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    void shouldCompressString() {
        String input = "aabcccccaaa";
        String expected = "a2b1c5a3";
        String actual = StringCompression.compressString(input);
        assertEquals(expected, actual);
    }

}