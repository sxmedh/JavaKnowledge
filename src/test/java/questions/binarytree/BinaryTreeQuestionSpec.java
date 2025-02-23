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
}
