/*

Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node
in this tree has exactly two or zero sub-node. If the node has two sub-nodes,
then this node's value is the smaller value among its two sub-nodes.
More formally, the property root.val = min(root.left.val, root.right.val) always holds.

Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
If no such second minimum value exists, output -1 instead.


Example 1:
Input: root = [2,2,5,null,null,5,7]
Output: 5
Explanation: The smallest value is 2, the second smallest value is 5.


Example 2:
Input: root = [2,2,2]
Output: -1
Explanation: The smallest value is 2, but there isn't any second smallest value.

 */

import java.util.HashSet;
import java.util.Set;

public class SecondMinimumValueBinaryTree {

    public static void main(String[] args) {

    }

    public static int secondMinimum(TreeNode root) {

        //Traverse through the tree and save the node values.
        //save the node values in some data structure that you can go through. // Set preferred coz it can ignore duplicates.
        //find 1st minimum which should be root itself.
        //find 2nd minimum.
        //Any integer number they said which can be more than Integer.MAX_VALUE which means we have to take long as the variable

        Set<Integer> nodeSet = new HashSet<>();
        traverseTree(root, nodeSet);

        int min = root.val;
        long answer = Long.MAX_VALUE;

        for (int value : nodeSet) {

            if (min < value && value < answer)
            {
                answer = value;
            }
        }

        return answer < Long.MAX_VALUE ? (int)answer : -1;
    }

    private static void traverseTree(TreeNode root, Set<Integer> nodeSet) {

        if (root != null)
        {
            nodeSet.add(root.val);
            traverseTree(root.left, nodeSet);
            traverseTree(root.right, nodeSet);
        }

    }


}
