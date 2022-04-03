
/*
Given the root of a binary search tree, a target value, and an integer k, return the k values in the BST that are closest to the target.
You may return the answer in any order.
You are guaranteed to have only one unique set of k values in the BST that are closest to the target.

Example 1:
Input: root = [4,2,5,1,3], target = 3.714286, k = 2
Output: [4,3]

Example 2:
Input: root = [1], target = 0.000000, k = 1
Output: [1]

 */


import java.util.*;

public class ClosestBinarySearchTreeValue2 {

    public static void main(String[] args) {

    }

    /*
    This will be done in three steps.
    1. Inorder traversal of the tree so that we can have all the values of the tree in an array.
    2. Collections.sort( using a comparator) we can find the values closest to target.
    3. using ArrayList.subList(); to make the final List that we want to return.
     */

    public static void inorder(TreeNode root, List<Integer> nums)
    {
        if (root == null)
        {
            return;
        }

        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }


    public static List<Integer> kClosestValues(TreeNode root, double target, int k) {

        //Flatten the tree --> to array using inorder traversal.
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);

//        ----------------------------

        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1 - target) < Math.abs(o2 - target) ? -1 : 1;
            }
        });

        return nums.subList(0,k);
    }

}
