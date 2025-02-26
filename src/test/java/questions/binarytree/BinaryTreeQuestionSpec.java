package questions.binarytree;

import core.java.treenode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class BinaryTreeQuestionSpec {

    @Test
    void constructTreeFromPrePost() {
        ConstructFromPrePost constructFromPrePost = new ConstructFromPrePost();
        TreeNode root = constructFromPrePost.constructFromPrePost(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 5, 2, 6, 7, 3, 1});
        ArrayList<Integer> inorder = BinaryTreeHelper.bfs(root);
        int[] inorderArray = inorder.stream().mapToInt(Integer::intValue).toArray();
        assert (Arrays.equals(inorderArray, new int[]{1, 2, 3, 4, 5, 6, 7}));
    }
    
    @Test
    void givenBinaryTreeBalanced() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        assert(!balancedBinaryTree.isBalanced(root));
    }

    @Test
    void givenMinHeight() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);

        MinimumHeightOfBinaryTree minimumHeightOfBinaryTree = new MinimumHeightOfBinaryTree();
        assert(minimumHeightOfBinaryTree.minDepth(root)==2);
    }
}
