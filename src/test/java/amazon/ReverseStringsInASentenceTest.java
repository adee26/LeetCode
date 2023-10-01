package amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringsInASentenceTest {
    private ReverseStringsInASentence reverseStringsInASentence = new ReverseStringsInASentence();

    @Test
    void shouldReverseString() {
        String s = "Hello World";
        String expected  = "World Hello";
        String actual = reverseStringsInASentence.reverseString(s);

        assertEquals(expected, actual);
    }
}