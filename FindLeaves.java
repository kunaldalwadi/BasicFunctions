/*
Given the root of a binary tree, collect a tree's nodes as if you were doing this:

Collect all the leaf nodes.
Remove all the leaf nodes.
Repeat until the tree is empty.

Example 1:
Input: root = [1,2,3,4,5]
Output: [[4,5,3],[2],[1]]
Explanation:
[[3,5,4],[2],[1]] and [[3,4,5],[2],[1]] are also considered correct answers since per each level it does not matter the order on which elements are returned.


Example 2:
Input: root = [1]
Output: [[1]]

 */

import java.util.ArrayList;
import java.util.List;

public class FindLeaves {

    public static List<List<Integer>> leavesList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static List<List<Integer>> collectLeaves(TreeNode root){

        //find the leaf node everytime recursively.

        helperFindLeaf(root);

        return leavesList;
    }

    public static int helperFindLeaf(TreeNode root) {

        if (root == null)
        {
            return -1;
        }

        int leftTree = helperFindLeaf(root.left);
        int rightTree = helperFindLeaf(root.right);

        int currentHeight = Math.max(leftTree, rightTree) + 1;

        if (leavesList.size() == currentHeight)
        {
            leavesList.add(new ArrayList<>());
        }

        leavesList.get(currentHeight).add(root.val);


        return currentHeight;
    }

}
