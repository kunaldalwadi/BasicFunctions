public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void prettyPrint(ListNode node)
    {
        while (node != null)
        {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print("->");
            }
            node = node.next;
        }
    }


    //Reversing the linkedlist
    public static ListNode reverseLinkedList(ListNode head)
    {
        if (head == null)
        {
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }


    // Add two LinkedList by adding each node and creating new LinkedList
    public static ListNode addTwoNodes(ListNode num1, ListNode num2) {

        ListNode head = null;
        int carry = 0;

        while (num1 != null || num2 != null)
        {
            int x = num1 != null ? num1.val : 0;
            int y = num2 != null ? num2.val : 0;

            int ans = (carry + x + y) % 10;
            carry = (carry + x + y) / 10;

            ListNode curr = new ListNode(ans);
            curr.next = head;
            head = curr;

            num1 = num1 != null ? num1.next : null;
            num2 = num2 != null ? num2.next : null;
        }

        if (carry != 0)
        {
            ListNode last = new ListNode(carry);
            last.next = head;
            head = last;
        }

        return head;
    }


    //Merge two sorted LinkedList in ascending sorted pattern.
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


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while (headA != null)
        {
            ListNode nodeb = headB;

            while (nodeb != null)
            {
                if (headA == nodeb)
                {
                    return headA;
                }

                nodeb = nodeb.next;
            }

            headA = headA.next;
        }

        return null;
    }
}
