import java.util.HashSet;
import java.util.Set;

//Detect if the linkedlist is cycliclinkedlist.
public class DetectCycle {

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

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        head = node1;
        ListNode start = head;

        ListNode cyclicNode = detectCycle(start);

        System.out.println("Cyclic node is = " + cyclicNode.val);

    }


    public static ListNode detectCycle(ListNode head) {

        Set<ListNode> visited = new HashSet<ListNode>();

        ListNode node = head;
        while (node != null) {
            if (visited.contains(node)) {
                return node;
            }
            visited.add(node);
            node = node.next;
        }

        return null;
    }


    public static boolean hasCycleWithExtraMemory(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            }
            nodesSeen.add(head);
            head = head.next;
        }
        return false;
    }

    public static boolean hasCycleWithSlowFastPointer(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
