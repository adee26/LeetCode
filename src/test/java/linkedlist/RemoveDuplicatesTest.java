package linkedlist;

import linkedlist.util.LinkedListTestUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    void shouldRemoveDuplicatesFromList() {
        Node node = new Node(1);
        node.append(2);
        node.append(2);
        node.append(3);

        RemoveDuplicates.removeDuplicates(node);
        assertEquals(3, node.getNext().getNext().getValue());
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals(LinkedListTestUtils.transposeLinkedListToList(node), expected);
    }

}