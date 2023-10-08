package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopDetectionTest {
    @Test
    void shouldFindIntersectionNode() {
        Node node = new Node(1);
        Node intersection = new Node(1);
        node.setNext(intersection);
        node.append(4);
        node.getNext().getNext().setNext(intersection);
        assertEquals(intersection, LoopDetection.findLoopNode(node));
    }

}