package linkedlist;

import java.util.HashSet;

public class Intersection {
    /**
     * Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting
     * node. Note that the intersection is defined based on reference, not value. That is, if the kth
     * node of the first linked list is the exact same node (by reference) as the jth node of the second
     * linked list, then they are intersecting.
     */
    public static Node findIntersection(Node l1, Node l2) {
        if(l1 == null || l2 == null) {
            return null;
        }

        HashSet<Node> set = new HashSet<>();
        while (l1 != null) {
            set.add(l1);
            l1 = l1.getNext();
        }
        while (l2 != null) {
            if(set.contains(l2)) {
                return l2;
            }
            l2 = l2.getNext();
        }
        return null;
    }
}
