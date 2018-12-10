package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/5/26 14:23
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        int differ = traverseHeight(root);
        if(differ == -1) return false;
        return true;
    }

    private int traverseHeight(TreeNode node) {
        if(node == null) return 0;

        int leftHeight = traverseHeight(node.left);
        // left child is unbalanced
        if(leftHeight == -1) return -1;

        int rightHeight = traverseHeight(node.right);
        // right child is unbalanced
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
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
