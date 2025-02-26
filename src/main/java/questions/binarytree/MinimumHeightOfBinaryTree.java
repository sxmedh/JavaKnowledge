package questions.binarytree;

import core.java.treenode.TreeNode;

public class MinimumHeightOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        if(root.left == null) {
            return 1 + minDepth(root.right);
        }
        if(root.right == null) {
            return 1 + minDepth(root.left);
        }
        return 1 + Math.min(minDepth(root.left),minDepth(root.right));
    }

}
