package linkedlist;

public class PartitionList {
    /**
     * Write code to partition a linked list around a value x, such that all nodes less than x come
     * before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
     * to be after the elements less than x (see below). The partition element x can appear anywhere in the
     * "right partition"; it does not need to appear between the left and right partitions.
     * EXAMPLE
     * Input:
     * Output:
     * 3 - > 5 - > 8 - > 5 - > 10 - > 2 - > 1 [partition = 5]
     * 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
     */
    public static Node partitionList(Node head, int x) {//1 5 4 2 1
        if (head.getNext() == null) {
            return head;
        }
        Node less = null;
        Node headLess = less;
        Node equal = null;
        Node headEqual = equal;
        Node more = null;
        Node headMore = more;
        Node current = head;

        while (current != null) {
            if (current.getValue() < x) {
                if (less == null) {
                    less = new Node(current.getValue());
                    headLess = less;
                } else {
                    less.setNext(new Node(current.getValue()));
                    less = less.getNext();
                }
            }else if (current.getValue() == x) {
                if (equal == null) {
                    equal = new Node(current.getValue());
                    headEqual = equal;
                } else {
                    equal.setNext(new Node(current.getValue()));
                    equal = equal.getNext();
                }
            }else {
                if (more == null) {
                    more = new Node(current.getValue());
                    headMore = more;
                } else {
                    more.setNext(new Node(current.getValue()));
                    more = more.getNext();
                }
            }
            current = current.getNext();
        }
        return mergeLists(headLess, headEqual, headMore);
    }

    private static Node mergeLists(Node less, Node equal, Node more) {
        Node currLess = less;
        Node currEqual = equal;
        if (less == null && equal == null) {
            return more;
        }
        if(equal != null) {
            while (equal.getNext() != null) {
                equal = equal.getNext();
            }
            equal.setNext(more);
        }
        if (less == null) {
            return currEqual;
        }
        while (less.getNext() != null) {
            less = less.getNext();
        }
        if (equal == null) {
            less.setNext(more);
        } else {
            less.setNext(equal);
        }
        return currLess;
    }

}
