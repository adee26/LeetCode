package linkedlist.util;

import linkedlist.Node;

import java.util.ArrayList;
import java.util.List;

public class LinkedListTestUtils {
    public static List<Integer> transposeLinkedListToList(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        Node current = node;
        while (current != null) {
            list.add(current.getValue());
            current = current.getNext();
        }
        return list;
    }
}
