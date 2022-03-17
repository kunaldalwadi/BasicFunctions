/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
 */

public class MergeKSortedLinkedList {

    public static void main(String[] args) {

    }

    public static ListNode mergeKLists(ListNode[] listNodesList) {

        if(listNodesList.length == 0)
        {
            return null;
        }

        if(listNodesList.length == 1)
        {
            return listNodesList[0];
        }

        ListNode head = ListNode.mergeTwoLists(listNodesList[0], listNodesList[1]);

        for (int i = 2; i < listNodesList.length; i++) {
            head = ListNode.mergeTwoLists(head, listNodesList[i]);
        }

        return head;
    }
}
