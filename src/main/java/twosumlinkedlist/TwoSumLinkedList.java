package twosumlinkedlist;

public class TwoSumLinkedList {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) { //2,4,3 + 5,6,4
        ListNode results = null; //7

        ListNode current1 = l1; //2
        ListNode current2 = l2; //5
        int carry = 0;

        while(current1 != null || current2 != null) { // 4 + 6
            int result = carry; //0
            if(current1 != null) {
                result = result + current1.val; // r=4
            }else{
                result = result + 0;
            }
            if(current2 != null) {
                result = result + current2.val; //r=10
            }else{
                result = result + 0;
            }

            if(result >= 10) {
                result = result % 10; //10%10 = 0
                carry = 1;
            }
            if(results == null) {
                results = new ListNode(result);
            }else{
                results.next = new ListNode(result);
                results = results.next;
            }
            if(current1 != null) {
                current1 = current1.next; // 4
            }
            if(current2 != null) {
                current2 = current2.next; // 6
            }
        }
        return results;
    }
}
