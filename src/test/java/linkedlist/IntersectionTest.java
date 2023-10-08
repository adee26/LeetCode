package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {

    @Test
    void shouldFindIntersection() {
        Node common = new Node(3);
        common.append(2);
        common.append(1);
        Node l1 = new Node(0);
        l1.append(1);
        l1.getNext().setNext(common);
        Node l2 = new Node(5);
        l2.append(6);
        l2.getNext().setNext(common);
        assertEquals(common, Intersection.findIntersection(l1, l2));
    }

}