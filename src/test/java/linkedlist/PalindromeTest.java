package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void shouldReturnTrueForPalindromeList() {
        Node node = new Node(1);
        node.append(2);
        node.append(3);
        node.append(2);
        node.append(1);
        assertTrue(Palindrome.isPalindrome(node));
    }

}