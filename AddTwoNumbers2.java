/*
You are given two non-empty linked lists representing two non-negative integers.
The most significant digit comes first and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [7,2,4,3], l2 = [5,6,4]
Output: [7,8,0,7]
 */

public class AddTwoNumbers2 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(7);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(3);

        ListNode nodea = new ListNode(5);
        ListNode nodeb = new ListNode(6);
        ListNode nodec = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        nodea.next = nodeb;
        nodeb.next = nodec;

        ListNode.prettyPrint(node1);

        System.out.println();

        ListNode.prettyPrint(nodea);

        ListNode reversedNode1 = reverseLinkedList(node1);

        System.out.println();

        ListNode.prettyPrint(reversedNode1);

        ListNode reversedNodea = reverseLinkedList(nodea);

        System.out.println();

        ListNode.prettyPrint(reversedNodea);

        System.out.println();

        ListNode result = addTwoNodes(reversedNode1, reversedNodea);

        ListNode.prettyPrint(result);
    }

    public static ListNode reverseLinkedList(ListNode head)
    {
        if (head == null)
        {
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static ListNode addTwoNodes(ListNode num1, ListNode num2) {

        ListNode head = null;
        int carry = 0;

        while (num1 != null || num2 != null)
        {
            int x = num1 != null ? num1.val : 0;
            int y = num2 != null ? num2.val : 0;

            int ans = (carry + x + y) % 10;
            carry = (carry + x + y) / 10;

            ListNode curr = new ListNode(ans);
            curr.next = head;
            head = curr;

            num1 = num1 != null ? num1.next : null;
            num2 = num2 != null ? num2.next : null;
        }

        if (carry != 0)
        {
            ListNode last = new ListNode(carry);
            last.next = head;
            head = last;
        }

        return head;
    }


}
