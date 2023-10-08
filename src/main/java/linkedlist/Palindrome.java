package linkedlist;

import java.util.Stack;

public class Palindrome {
    /**
     * Implement a function to check if a linked list is a palindrome.
     * 1->2->2->1    1->2->2->1  1->2->3->2->1 1->2->3->2->1
     */
    public static boolean isPalindrome(Node node) {
        if(node == null) {
            return false;
        }
        Stack<Node> stack = new Stack<>();
        Node slow = node;
        Node fast = node;
        while (fast != null && fast.getNext() != null) {
            stack.push(slow);
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        if(fast != null) {
            stack.push(slow);
        }
        while (slow != null) {
            if(stack.pop().getValue() != slow.getValue()) { //3 3
                return false;
            }
            slow = slow.getNext(); //2 1
        }
        return true;
    }
}
