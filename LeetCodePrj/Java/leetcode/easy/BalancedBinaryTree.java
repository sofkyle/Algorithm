package leetcode.easy;

/**
 * @author Kyle
 * @create 2018/5/26 14:23
 */
public class BalancedBinaryTree {
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        traverseHeight(root);
        return result;
    }

    private int traverseHeight(TreeNode node) {
        if(node == null) return 0;
        int leftHeight = traverseHeight(node.left);
        int rightHeight = traverseHeight(node.right);
        if(Math.abs(leftHeight - rightHeight) > 1) {
            result = false;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
