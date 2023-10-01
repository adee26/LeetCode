package factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void shouldReturnFactorial() {
        int n = 4;
        int factorial = Factorial.factorial(n);
        assertEquals(24, factorial);
    }

}