public class TwoSumLinkedList {

    static class ListNode {

        int val;
       ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

    }

    static ListNode head;


    public static void main(String[] args) {

        addTwoNumbers();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null)
        {
            return l2;
        }

        if (l2 == null)
        {
            return l1;
        }


        ListNode total = new ListNode(-1);
        int carry = 0;

        while (l1.next != null && l2.next != null)
        {
            int num = l1.val + l2.val + carry;
            if( num > 9)
            {
                carry = 1;
                num = num/10;
            }

            total.next = new ListNode(num);

            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode finalList = reverseList(total);
        ListNode prev = finalList;
        finalList = finalList.next;
        prev.next = null;

        return finalList.next;
    }

    private static ListNode reverseList(ListNode node) {

        ListNode prev = null;
        ListNode curr = node;

        while (curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }

        return prev;
    }

}
