package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void setUp(){
        fibonacci = new Fibonacci();
    }

    @Test
    void shouldReturnFibonacciNumberClassicMethod() {
        int fibonacciToFind = 0;
        int expected = 0;
        int actual = fibonacci.findFibonacciNumberClassic(fibonacciToFind);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFibonacciNumberUsingRecursion() {
        int fibonacciToFind = 74;
        long expected = 1304969544928657L;
        long actual = fibonacci.findFibonacciUsingRecursion(fibonacciToFind);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFibonacciNumberUsingDynamicProgramming() {
        int fibonacciToFind = 74;
        long expected = 1304969544928657L;
        long actual = fibonacci.findFibonacciUsingDynamicProgramming(fibonacciToFind);

        assertEquals(expected, actual);
    }
}