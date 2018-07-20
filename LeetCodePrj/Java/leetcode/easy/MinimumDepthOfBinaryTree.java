package leetcode.easy;

/**
 * @author Kyle
 * @create 2018/7/20 8:41
 */
public class MinimumDepthOfBinaryTree {
    Integer minHeigth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
