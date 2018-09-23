package leetcode.easy.pagetwo;

import leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Kyle
 * @create 2018/9/23 16:06
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tmpNode = queue.poll();

            if (tmpNode == null) continue;

            queue.offer(tmpNode.right);
            queue.offer(tmpNode.left);

            TreeNode inverseNode = tmpNode.left;
            tmpNode.left = tmpNode.right;
            tmpNode.right = inverseNode;
        }

        return root;
    }
}
