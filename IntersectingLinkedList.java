import java.util.HashSet;
import java.util.Set;

public class IntersectingLinkedList {

    static ListNode head = null;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

    }

    //BruteForce - going through each node in list b for every node in list a.
    //if we find a node that coincides, then we have intersection.
    // WE ARE COMPARING NODE NOT NODE's VALUE.
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null) {
            ListNode pB = headB;
            while (pB != null) {
                if (headA == pB) return headA;
                pB = pB.next;
            }
            headA = headA.next;
        }
        return null;
    }

    //The above approach is not efficient.
    //In this approach we are storing linkedlist b into a hashset so that we do not have to traverse it multiple times.
    // which in turn reduces complexity and time consumed.
    //Return the value in list b that matches list a while traversing it.
    public static ListNode getIntersectionNodeUsingMoreMemory(ListNode headA, ListNode headB) {
        Set<ListNode> nodesInB = new HashSet<ListNode>();

        while (headB != null) {
            nodesInB.add(headB);
            headB = headB.next;
        }

        while (headA != null) {
            // if we find the node pointed to by headA,
            // in our set containing nodes of B, then return the node
            if (nodesInB.contains(headA)) {
                return headA;
            }
            headA = headA.next;
        }

        return null;
    }
}
