import java.util.LinkedList;

public class MergeSortedLinkedList {

    static class Node {

        int val;
        Node next;
        Node(int x) {
            val = x;
            next = null;
        }

    }

    static Node head;

    public static void main(String[] args) {

        Node result = mergeLinkedList();
    }

    public static Node mergeLinkedList(Node n1, Node n2)
    {

        Node sentinel = new Node(-1);
        Node prev = sentinel;

        if (n1 == null)
        {
            return n2;
        }

        if (n2 == null)
        {
            return n1;
        }

        while (n1 != null && n2 != null)
        {
            if (n1.val <= n2.val)
            {
                prev.next = n1;
                n1=n1.next;
            }
            else
            {
                prev.next = n2;
                n2 = n2.next;
            }

            prev = prev.next;
        }

        if (n1 == null)
        {
            prev.next = n2;
        }
        else
        {
            prev.next = n1;
        }

        return sentinel.next;
    }
}
