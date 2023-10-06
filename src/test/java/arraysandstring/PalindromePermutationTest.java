package arraysandstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {

    @Test
    void shouldCheckIfPalindromePermutation() {
        String input = "Tact Coa";
        assertTrue(PalindromePermutation.isPermutationOfPalindrome(input));
    }

}