package questions.binarytree;

import core.java.treenode.TreeNode;

import java.util.Stack;


/*
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that adding up
 * all the values along the path equals targetSum.
 * A leaf is a node with no children.
 * leetcode 112
 */

public class HasPathSum {

    boolean helper(int sum, TreeNode node, int targetSum) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            if ((sum + node.val) == targetSum) {
                return true;
            }
        }
        return helper(sum + node.val, node.left, targetSum) || helper(sum + node.val, node.right, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                return true;
            }
        }

        return helper(root.val, root.left, targetSum) || helper(root.val, root.right, targetSum);
    }
}
