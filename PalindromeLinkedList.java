import java.util.ArrayList;
import java.util.List;

//check is the LinkedList is Palindrome.
public class PalindromeLinkedList {

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

        boolean b = checkPelindromeApproach1();

        System.out.println("Is it palindreome? " + b);
    }

    private static boolean checkPelindromeApproach1() {

        //easy solution
        //move this data structure to something that is easy to traverse.
        //Approach 1
        //Move this LinkedList to ArrayList
        //Check if ArrayList is Palindrome.

        List<Integer> integerArrayList = new ArrayList<>();

        //Adding LinkedList into the ArrayList
        Node curr = head;
        while(curr != null)
        {
            integerArrayList.add(curr.val);
            curr = curr.next;
        }

        //Checking if the ArrayList is pelindrome
        for (int start=0, end= integerArrayList.size()-1; start<end; start++, end--)
        {
            if (!integerArrayList.get(start).equals(integerArrayList.get(end)))
            {
                //not pelindrome
                return false;
            }
        }
        return true;

    }

    public static boolean checkPalindromeApproach2(){


        //hard solution
        //Approach 2
        //find midpoint(half) of LinkedList
        //Reverse the second half of the list
        //Confirm that matches or not with the first half
        //Reset the reversed(second half) back to normal
        //return the LinkedList or the boolean if it is palindrome.

        return false;
    }
}
