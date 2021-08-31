public class ReverseLinkedList {

    static class Node {

        int val;
        Node next;
        Node(int x) {
            val = x;
            next = null;
        }

    }

    static Node head = null;

    public static void main(String[] args) {



        reverseList();
    }



    private static void reverseList() {

        Node prev = head;
        Node curr = prev.next;

        if (curr == null) {
            return;
        }

        if (curr.next == null)
        {
            // single link to be reversed.
        }

        while (curr.next.next != null)
        {
            curr = curr.next;
        }
        //at this point you should be at the tail of the list.



    }
}
