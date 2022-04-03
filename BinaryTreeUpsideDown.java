/*

Given the root of a binary tree, turn the tree upside down and return the new root.

You can turn a binary tree upside down with the following steps:

The original left child becomes the new root.
The original root becomes the new right child.
The original right child becomes the new left child.

The mentioned steps are done level by level. It is guaranteed that every right node has a sibling (a left node with the same parent) and has no children.


Input: root = [1,2,3,4,5]
Output: [4,5,2,null,null,3,1]

 */

public class BinaryTreeUpsideDown {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);


        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        prettyPrintTree(node1);

        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        System.out.println();

        TreeNode newRoot = makeUpsideDown(node1);

        prettyPrintTree(newRoot);

    }

    public static void prettyPrintTree(TreeNode root) {

        while (root.left != null || root.right != null)
        {
            System.out.println(root.val);
            System.out.println("|");
            if (root.left != null) {
                TreeNode tempLeft = root.left;
                System.out.print(tempLeft.val);
                System.out.print("|");
            }
            if (root.right != null) {
                TreeNode tempRight = root.right;
                System.out.print(" - ");
                System.out.print(tempRight.val);
                System.out.println("|");
            }

            if(root.left == null)
            {
                root = root.right;
            }
            else
            {
                root = root.left;
            }
        }

    }

    public static TreeNode makeUpsideDown(TreeNode root) {

        if (root == null)
        {
            return root;
        }
        TreeNode left = root.left;

        if (left == null)
        {
            return root;
        }

        TreeNode newRootLeft = makeUpsideDown(left); //this will recurse untill we reach the left most end node of the tree.

        left.left = root.right;
        left.right = root;
        root.left = null;
        root.right = null;

        return newRootLeft;

    }

}
