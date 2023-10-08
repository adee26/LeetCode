package linkedlist;

public class DeleteMiddleNode {
    /**
     * Implement an algorithm to delete a node in the middle (i.e., any node but
     * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
     * that node.
     * EXAMPLE
     * Input: the node from the linked list a->b->c->d->e->f
     * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
     */
    public void shouldDeleteNode(Node node) {
        if(node == null || node.getNext() == null) {
            return;
        }
        Node temp = node.getNext();
        node.setValue(temp.getValue());
        node.setNext(temp.getNext());
    }
}
