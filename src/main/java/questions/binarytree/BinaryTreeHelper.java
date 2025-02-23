package questions.binarytree;

import core.java.treenode.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeHelper {

    static ArrayList<Integer> arrayList;

    // Helper method to perform inorder traversal and add values to the list
    static void inorder1(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inorder1(treeNode.left);
        arrayList.add(treeNode.val);
        inorder1(treeNode.right);
    }

    // Method to perform inorder traversal and return the list of values
    static ArrayList<Integer> inorder(TreeNode treeNode) {
        // Initialize the list before traversal
        arrayList = new ArrayList<>();
        inorder1(treeNode);
        return arrayList;
    }

    public static ArrayList<Integer> bfs(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result; // Return empty list if tree is empty
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            result.add(current.val);

            // Add left and right children to the queue
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return result;
    }
}

