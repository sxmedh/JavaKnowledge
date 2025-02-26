package questions.binarytree;

import core.java.treenode.TreeNode;

/*
 * A height-balanced binary tree is a binary tree
 * in which the depth of the two subtrees of every
 * node never differs by more than one.
 */

public class BalancedBinaryTree {

    public static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int lHeight = height(root.left);
        int rHeight = height(root.right);

        if (Math.abs(lHeight - rHeight) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
}
