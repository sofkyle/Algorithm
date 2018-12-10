package leetcode.easy.page1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Kyle
 * @create 2018/4/26 23:36
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return result;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> tmpList = new LinkedList<>();
            for(int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                tmpList.add(node.val);
            }
            result.add(0, tmpList);
        }

        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
