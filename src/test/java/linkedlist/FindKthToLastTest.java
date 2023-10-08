package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindKthToLastTest {

    @Test
    void shouldReturnKthElement() {
        Node node = new Node(1);
        node.append(2);
        node.append(3);
        node.append(4);
        node.append(5);
        int k = 2;
        Node element = FindKthToLast.findKthToLastNode(node, 2);
        assertEquals(4, element.getValue());
    }

    @Test
    void shouldReturnNullForInvalidK() {
        Node node = new Node(1);
        node.append(2);
        node.append(3);
        node.append(4);
        node.append(5);
        int k = 6;
        assertNull(FindKthToLast.findKthToLastNode(node, k));
    }

}