package arraysandstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {

    @Test
    void shouldCheckEditsNumber() {
        String s1 = "pale";
        String s2 = "pake";
        assertTrue(OneAway.isOneAway(s1, s2));
    }

}