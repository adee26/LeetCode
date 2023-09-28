package amazon;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class StringSegmentationTest {

    private StringSegmentation stringSegmentation = new StringSegmentation();

    @Test
    void shouldReturnTrueForStringSegmentation() {
        HashSet<String> strings = new HashSet<>();
        strings.add("apple");
        strings.add("pie");
        strings.add("peer");

        String s = "applepiepeer";

        assertTrue(stringSegmentation.canSegmentString(s, strings));
    }

}