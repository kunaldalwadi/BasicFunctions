//Sort the Linkedlist with odd indices first followed by even indices;
public class OddEvenLinkedList {

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

        OddEvenLinkedList list = new OddEvenLinkedList();

        head = new Node(100);
        Node node2 = new Node(200);
        Node node3 = new Node(300);
        Node node4 = new Node(400);
        Node node5 = new Node(500);
        Node node6 = new Node(600);
        Node node7 = new Node(700);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;


        Node node = oddEvenSort(head);

        System.out.println(node);
    }

    private static Node oddEvenSort(Node head) {

        //if head is null return;
        if (head == null)
            return null;

        //if head is not null start the 1st node as odd
        Node odd = head;
        //and 2nd node as even
        Node even = head.next;
        Node evenHead = even;

        //this check the possibility of the list being single or only two noded.
        while (even != null && even.next != null)
        {
            // we have to start with odd for the even nodes to work.
            
            //even's next will obviously be odd.
            odd.next = even.next;
            //move the odd one step further.
            odd = odd.next;
            //even's next will be odd.
            even.next = odd.next;
            //move even node a step further.
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }


}
