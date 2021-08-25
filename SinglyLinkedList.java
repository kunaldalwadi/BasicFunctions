public class SinglyLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void printLinkedList() {
        Node n = head;

        //while loop is good to traverse through the LinkedList.
        while (n != null) {
            System.out.print(n.data);
            n = n.next;
        }
        System.out.println();
    }

    public int countNodes() {
        //even to traverse through the linkedlist you need a node.
        //so create a node which you can use to traverse through the linkedlist.
        Node curr = head;

        //you can name it size/count which increments while traversing through the linkedlist
        int count = 0;

        //while loop is good to traverse through the LinkedList.
        while (curr != null) {
            count++;
            System.out.println(curr.data);
            curr = curr.next;
        }

        return count;
    }

    public int get(int index) {

        int resultValue = 0;
        Node curr = head;

        if (head == null)//there is no node in the list
        {
            return 1;// list is empty;
        }
        else //if list is not empty then traverse the list until you reach the desired index.
        {

            for (int i = 0; i < index + 1; i++)
            {
                if (i==index)
                {
                    resultValue = curr.data;
                    break;
                }
                curr = curr.next;
            }
        }

        return resultValue;
    }

    public void addNode() {
        //To Add a node. First make a node.
        //1. Making a new node to add.
        Node nodeToBeAdded = new Node(900);
        Node curr = head; //just used to traverse through the list to find the node which is last.

        //2. Confirm if the list is not null
        //as in that there is atleast one node in the linkedlist.
        if (head == null)//there is no node in the list
        {
            head = nodeToBeAdded;
        } else //if list is not empty then add the node at the end of the list.
        {
            //traverse untill you find a node whose node.next points to null.
            while (curr.next != null) {
                curr = curr.next;
            }

            //when you find that node whose .next(which is where it holds the pointer reference to next node)
            //point that to the new nodeToBeAdded.
            curr.next = nodeToBeAdded;
        }

        //**. Point next of new node to previous(prev) node's next(where ever that was pointing)
        // and previous(prev) node's next(which is address pointer) will now point to new node.
//        nodeToBeAdded.next = prev.next;
//        prev.next = nodeToBeAdded;


    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.head = new Node(100);
        Node node2 = new Node(200);
        Node node3 = new Node(300);
        Node node4 = new Node(400);
        Node node5 = new Node(500);
        Node node6 = new Node(600);
        Node node7 = new Node(700);

        list.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        list.printLinkedList();
        int totalNodes = list.countNodes();
        System.out.println("Total Nodes are = " + totalNodes);

        list.addNode();
        list.printLinkedList();
        totalNodes = list.countNodes();
        System.out.println("Total Nodes are = " + totalNodes);

        int nodeAtIndex = list.get(4);
        System.out.println("Node at Index is = " + nodeAtIndex);

    }

}
