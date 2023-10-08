package linkedlist;

public class FindKthToLast {
    /**
     * Implement an algorithm to find the kth to last element of a singly linked list.
     * 1->2->3->4->5  k = 2 expected = 4
     */
    public static Node findKthToLastNode(Node head, int k) {
        Node slowPointer = null;
        Node fastPointer = head;
        int iteration = 0;
        while (fastPointer != null) {
            iteration++;
            fastPointer = fastPointer.getNext();
            if(iteration == k) {
                slowPointer = head;
            }
            if(iteration > k) {
                slowPointer = slowPointer.getNext();
            }
        }
        return slowPointer;
    }
}
