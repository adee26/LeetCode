package linkedlist;

public class SumLists {
    /**
     * You have two numbers represented by a linked list, where each node contains a single
     * digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
     * function that adds the two numbers and returns the sum as a linked list.
     * EXAMPLE
     * Input:(7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
     * Output: 2 -> 1 -> 9. That is, 912.
     * 7->1->6    7->1->6->2    7->1
     * 5->9->2    5->9->2       5->9->2
     */
    public static Node sumLists(Node l1, Node l2) {
        if(l1 == null && l2 == null) {
            return null;
        }else if(l1 == null) {
            return l2;
        }else if(l2 == null) {
            return l1;
        }
        int digitSum = 0;
        Node result = new Node(10);
        Node tail = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            if(l1 != null) {
                digitSum = l1.getValue();
                l1 = l1.getNext();
            }
            if(l2 != null) {
                digitSum = digitSum + l2.getValue();
                l2 = l2.getNext();
            }

            digitSum = digitSum + carry;
            if(carry > 0){
                carry--;
            }

            if(digitSum >= 10 && l1 != null && l2 != null) {
                digitSum = digitSum - 10;
                carry++;
            }

            if(result.getValue() == 10) {
                result = new Node(digitSum);
                tail = result;
            }else{
                tail.setNext(new Node(digitSum));
                tail = tail.getNext();
            }

            digitSum = 0;
        }

        return result;
    }
}
