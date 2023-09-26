package tribonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TribonacciTest {
    private Tribonacci tribonacci;

    @BeforeEach
    void setUp() {
        tribonacci = new Tribonacci();
    }

    @Test
    void shouldReturnTribonacciRecursively() {
        long n = 37;
        int expected = 1132436852;
        long actual = tribonacci.returnTribonacciNumberRecursively(n);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTribonacciDynamically() {
        long n = 37;
        int expected = 1132436852;
        long actual = tribonacci.returnTribonacciDynamically(n);

        assertEquals(expected, actual);
    }

}