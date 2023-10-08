package linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {
    /**
     * Write code to remove duplicates from an unsorted linked list.
     * 1->2->3->4->3
     */
    public static void removeDuplicates(Node head){
        if(head.getNext() == null) {
            return;
        }

        Node current = head;
        Node prev = head;

        HashSet<Integer> values = new HashSet<>();

        while (current != null) {
            if(values.contains(current.getValue())) {
                prev.setNext(current.getNext());
            }else{
                values.add(current.getValue());
                prev = current;
            }
            current = current.getNext();
        }
    }

    public static void removeDuplicatesWithoutHashSet(Node head) {
        if(head.getNext() == null) {
            return;
        }


    }
}
