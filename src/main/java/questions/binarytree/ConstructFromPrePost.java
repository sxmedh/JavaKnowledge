package questions.binarytree;

import core.java.treenode.TreeNode;
import java.util.Arrays;

public class ConstructFromPrePost {

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        // Base cases: if the array is empty, or there is a single node.
        if (preorder.length == 0 || postorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        if (preorder.length == 1) {
            return root;
        }

        // The left subtree's root is the second element in preorder.
        int leftRoot = preorder[1];
        // Find the index of the left subtree's root in the postorder array.
        int leftSize = 0;
        for (int i = 0; i < postorder.length; i++) {
            if (postorder[i] == leftRoot) {
                leftSize = i + 1; // left subtree has i+1 elements
                break;
            }
        }

        // Split the arrays for the left subtree.
        int[] leftPre = Arrays.copyOfRange(preorder, 1, 1 + leftSize);
        int[] leftPost = Arrays.copyOfRange(postorder, 0, leftSize);

        // Split the arrays for the right subtree.
        int[] rightPre = Arrays.copyOfRange(preorder, 1 + leftSize, preorder.length);
        int[] rightPost = Arrays.copyOfRange(postorder, leftSize, postorder.length - 1);

        // Recursively build the subtrees.
        root.left = constructFromPrePost(leftPre, leftPost);
        root.right = constructFromPrePost(rightPre, rightPost);

        return root;
    }
}