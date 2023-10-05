package twosumlinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumLinkedListTest {

    @Test
    void shouldAddTwoLists() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = TwoSumLinkedList.addTwoNumbers(l1, l2);
    }

}