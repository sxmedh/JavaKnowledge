package questions.binarytree;

import core.java.treenode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null)
            return null;
        String current_path = Integer.toString(root.val);
        if (root.left == null && root.right == null) {
            paths.add(current_path);
        }
        if (root.left == null && root.right == null)
            return paths;
        if (root.left != null)
            traverse(root.left, current_path, paths);
        if (root.right != null)
            traverse(root.right, current_path, paths);
        return paths;
    }

    void traverse(TreeNode node, String current_path, List<String> paths) {
        current_path = current_path + "->" + node.val;
        if (node.left == null && node.right == null) {
            paths.add(current_path);
        }
        if (node.left != null)
            traverse(node.left, current_path, paths);
        if (node.right != null)
            traverse(node.right, current_path, paths);
    }
}
