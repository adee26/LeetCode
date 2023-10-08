package linkedlist;

import linkedlist.util.LinkedListTestUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumListsTest {
    @Test
    void shouldSumLists() {
        Node node1 = new Node(9);
        node1.append(7);
        node1.append(8);
        Node node2 = new Node(6);
        node2.append(8);
        node2.append(5);

        Node expected = new Node(5);
        expected.append(6);
        expected.append(14);

        List<Integer> expectedResult = LinkedListTestUtils.transposeLinkedListToList(expected);
        List<Integer> actual = LinkedListTestUtils.transposeLinkedListToList(SumLists.sumLists(node1, node2));

        assertEquals(expectedResult, actual);
    }

    @Test
    void shouldSumUnequalLists() {
        Node node1 = new Node(7);
        node1.append(1);
        node1.append(6);
        node1.append(2);
        Node node2 = new Node(5);
        node2.append(9);
        node2.append(2);

        Node expected = new Node(2);
        expected.append(1);
        expected.append(9);
        expected.append(2);

        List<Integer> expectedResult = LinkedListTestUtils.transposeLinkedListToList(expected);
        List<Integer> actual = LinkedListTestUtils.transposeLinkedListToList(SumLists.sumLists(node1, node2));

        assertEquals(expectedResult, actual);
    }

    @Test
    void shouldSumUnequalListsTwo() {
        Node node1 = new Node(7);
        node1.append(1);
        Node node2 = new Node(5);
        node2.append(9);
        node2.append(2);

        Node expected = new Node(2);
        expected.append(1);
        expected.append(3);

        List<Integer> expectedResult = LinkedListTestUtils.transposeLinkedListToList(expected);
        List<Integer> actual = LinkedListTestUtils.transposeLinkedListToList(SumLists.sumLists(node1, node2));

        assertEquals(expectedResult, actual);
    }

}