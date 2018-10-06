package leetcode.easy.pagetwo;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Kyle
 * @create 2018/10/5 15:33
 */
public class BinaryTreePaths {
    private List<String> paths = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new LinkedList<>();

        String path = "";
        traversTree(root, path);

        return paths;
    }

    private void traversTree(TreeNode node, String path) {
        String newpath = String.format("%s%d->", path, node.val);

        if (node.left == null && node.right == null) {
            paths.add(newpath.substring(0, newpath.length() - 3));
        } else {
            if (node.left != null) {
                traversTree(node.left, newpath);
            }
            if (node.right != null) {
                traversTree(node.right, newpath);
            }
        }
    }
}
