package linkedlist;

public class LoopDetection {
    /**
     * Given a circular linked list, implement an algorithm that returns the node at the
     * beginning of the loop.
     * //1->2->3->4  ---->2->3->4->2...
     */
    public static Node findLoopNode(Node node) {
        if(node == null) {
            return null;
        }
        Node slow = node;
        Node fast = node;
        while (fast != null && slow !=null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow == fast) {
                break;
            }
        }

        if(fast == null || fast.getNext() == null ) {
            return null;
        }

        slow = node;
        while (slow != fast) {
            slow = slow.getNext();
            fast = fast.getNext();
        }

        return slow;
    }
}
