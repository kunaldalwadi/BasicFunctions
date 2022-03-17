/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
 */

public class MergeSortedLinkedList {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);

        ListNode nodea = new ListNode(1);
        ListNode nodeb = new ListNode(3);
        ListNode nodec = new ListNode(4);

        node1.next = node2;
        node2.next = node3;

        nodea.next = nodeb;
        nodeb.next = nodec;

        ListNode.prettyPrint(node1);

        System.out.println();

        ListNode.prettyPrint(nodea);

        ListNode result = mergeTwoLists(node1, nodea);

        System.out.println();
        ListNode.prettyPrint(result);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode sentinel = new ListNode(-1);
        ListNode curr = sentinel;

        while (list1 != null && list2 != null)
        {
            if (list1.val <= list2.val)
            {
                curr.next = list1;
                list1 = list1.next;
            }
            else
            {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if (list1 != null)
        {
            curr.next = list1;
        }

        if (list2 != null)
        {
            curr.next = list2;
        }

        return sentinel.next;
    }
}
