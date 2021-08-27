public class SelfTrialSinglyLinkedList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public SelfTrialSinglyLinkedList() {
        head = null;
    }


    public void printLinkedList() {
        Node n = head;

        if (head == null) {
            System.out.println("List is Empty");
        } else {
            while (n != null) {
                System.out.print(n.val + " ");
                n = n.next;
            }
        }
        System.out.println();
    }

    public int countNodes() {
        Node n = head;
        int count = 0;

        if (head == null) {
            System.out.println("List is Empty");
            return 0;
        } else {
            while (n != null) {
                count++;
                n = n.next;
            }
        }

        return count;
    }


    /**
     * Get the Node at the index in the linked list. If the index is invalid, return -1.
     */
    public Node getNode(int index) {

        Node curr = head;

        for (int i = 0; i < index && curr != null; ++i) {
            curr = curr.next;
        }
        return curr;
    }

    /**
     * Get the Node at the tail in the linked list.
     */
    public Node getTail() {

        Node curr = head;

        while (curr != null && curr.next != null)
        {
            curr = curr.next;
        }
        return curr;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        int result = 0;
        int counter = 0;
        Node curr = head;

        if (head == null) {
            //No element in the list
            System.out.println("List is Empty");
            return result;
        }

        while (curr.next != null) {
            counter++;
            curr = curr.next;

            if (counter == index) {
                result = curr.val;
                return result;
            }
        }

        return result;
    }

    /**
     * Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first(head) node of the linked list.
     */
    public void addAtHead(int val) {
        Node curr = new Node(val);
        curr.next = head;
        head = curr;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {

        Node toBeAdded = new Node(val);
        Node curr = head;

        if (head != null) {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = toBeAdded;
            toBeAdded.next = null;
        }

    }

    /**
     * Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {

        Node n = new Node(val);
        Node curr = head;
        int count = 0;

        while (curr.next != null) {
            if (count == index - 1) {
                n.next = curr.next;
                curr.next = n;
                return;
            }
            curr = curr.next;
            count++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {

        Node curr = head;
        int count = 0;

        while (curr.next != null) {
            if (count == index - 1) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
            count++;

            //when count is 1 less than index
            //point that node's.next to current+2;

        }

    }

    /**
     * Delete the last node in the linked list
     */
    public void deleteLastNode() {

        Node curr = head;

        if (head != null && curr.next != null) {

            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    /**
     * Delete the first node in the linked list
     */
    public void deleteFirstNode() {

        Node curr = head;

        if (head == null) {
            //List is empty
            System.out.println("List is Empty");
        } else if (curr.next != null) {
            head = curr.next;
        }
    }


    public static void main(String[] args) {

//          Your MyLinkedList object will be instantiated and called as such:
        SelfTrialSinglyLinkedList singlyLinkedList = new SelfTrialSinglyLinkedList();

        Node node1 = new Node(10);
        singlyLinkedList.head = node1;

        Node node2 = new Node(20);
        node1.next = node2;

        Node node3 = new Node(30);
        node2.next = node3;

        Node node4 = new Node(40);
        node3.next = node4;

        Node node5 = new Node(50);
        node4.next = node5;

        Node node6 = new Node(60);
        node5.next = node6;

        Node node7 = new Node(70);
        node6.next = node7;

        singlyLinkedList.printLinkedList();

        int totalNodes = singlyLinkedList.countNodes();

        System.out.println("Total Nodes in List are = " + totalNodes);

        singlyLinkedList.addAtHead(5);

        singlyLinkedList.printLinkedList();

        totalNodes = singlyLinkedList.countNodes();

        System.out.println("Total Nodes in List are = " + totalNodes);

        singlyLinkedList.addAtTail(90);

        singlyLinkedList.printLinkedList();

        totalNodes = singlyLinkedList.countNodes();

        System.out.println("Total Nodes in List are = " + totalNodes);

        int result = singlyLinkedList.get(5);

        System.out.println("Data at given index is = " + result);

        singlyLinkedList.deleteAtIndex(5);

        singlyLinkedList.printLinkedList();

        totalNodes = singlyLinkedList.countNodes();

        System.out.println("Total Nodes in List are = " + totalNodes);

        singlyLinkedList.addAtIndex(5, 99);

        singlyLinkedList.printLinkedList();

        totalNodes = singlyLinkedList.countNodes();

        System.out.println("Total Nodes in List are = " + totalNodes);

        singlyLinkedList.deleteFirstNode();

        singlyLinkedList.printLinkedList();

        totalNodes = singlyLinkedList.countNodes();

        System.out.println("Total Nodes in List are = " + totalNodes);

        singlyLinkedList.deleteLastNode();

        singlyLinkedList.printLinkedList();

        totalNodes = singlyLinkedList.countNodes();

        System.out.println("Total Nodes in List are = " + totalNodes);

        Node tail = singlyLinkedList.getTail();

        System.out.println("Tail = " + tail);
        System.out.println("Tail = " + tail.val);

        Node n1 = singlyLinkedList.getNode(2);
        Node n2 = singlyLinkedList.getNode(4);
        Node n3 = singlyLinkedList.getNode(6);
        Node n4 = singlyLinkedList.getNode(8);
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
        System.out.println(n1.val + " " + n2.val + " " + n3.val);
    }
}
