package leetcode.easy.pagetwo;

import leetcode.common.TreeNode;

public class SumOfLeftLeaves {
    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return sum;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }
            sumOfLeftLeaves(root.left);
        }
        if (root.right != null) {
            sumOfLeftLeaves(root.right);
        }

        return sum;
    }
}
