package arraysandstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {

    @Test
    void shouldRemoveWhiteSpaces() {
        String input =  "Mr John Smith ";
        String expected = "Mr%20John%20Smith";
        String actual = URLify.urlIfy(input);

        assertEquals(expected, actual);
    }

}