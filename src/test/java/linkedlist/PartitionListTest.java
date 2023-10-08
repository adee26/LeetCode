package linkedlist;

import linkedlist.util.LinkedListTestUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionListTest {
    @Test
    void shouldPartitionList() {
        Node node = new Node(1);
        node.append(4);
        node.append(3);
        node.append(2);
        node.append(5);
        node.append(2);
        int x = 3;
        Node expected = new Node(1);
        expected.append(2);
        expected.append(2);
        expected.append(3);
        expected.append(4);
        expected.append(5);

        List<Integer> expectedResult = LinkedListTestUtils.transposeLinkedListToList(expected);
        List<Integer> actual = LinkedListTestUtils.transposeLinkedListToList(PartitionList.partitionList(node, x));
        assertEquals(expectedResult, actual);
    }

}