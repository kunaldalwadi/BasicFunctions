//Add a val into sorted circular linkedlist and keep it sorted and cicular.
// if there is nothing in the list return the new value with a circular linked list.

public class AddIntoSortedCircularLinkedList {

    // Definition for a Node.
    static class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }

    public static void main(String[] args) {

//        addThisNode();

    }

    private static Node addThisNode(Node head, int valToBeInserted) {
        // head being the starting of the node given to this function.

        //list is empty
        if (head == null)
        {
            //create a new cicular link list with one node and return it.
            Node newNode = new Node(valToBeInserted);
            newNode.next = newNode; //should point to itself to create the circular linkedlist.
            return newNode;
        }

        //if list is not empty.
        //To traverse through 3 cases we need to have two pointers.
        // if the value is in between those pointers ahhaah add the tobeinsertedvalue in between them.
        // case 1 = which is ideal case
        Node prev = head;
        Node curr = head.next;

        do {
            if (prev.val <= valToBeInserted && valToBeInserted <= curr.val) { //case 1
                //ideal case scenario, insert the valToBeInserted here.
                prev.next = new Node(valToBeInserted, curr);
                return head;
            } else if (prev.val > curr.val) { //case 2
                if (prev.val <= valToBeInserted || valToBeInserted <= curr.val) { //hack - use the same case1's if statement just use "OR" operator
                    prev.next = new Node(valToBeInserted, curr);
                    return head;
                }
            }

            prev = curr;
            curr = curr.next;

        }while (prev != head);

        //case3
        prev.next = new Node(valToBeInserted, curr);
        return head;
    }
}
