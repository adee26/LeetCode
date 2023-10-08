package linkedlist;

import java.util.List;

public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public void append(int value) {
        Node node = new Node(value);
        Node current = this;
        while (current.next != null) {
            current = current.getNext();
        }
        current.next = node;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
