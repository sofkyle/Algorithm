package leetcode.easy.page3;

import leetcode.common.TreeNode;

public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        return pathSum(root.left, sum) + pathSum(root.right, sum) + numOfPath(root, sum);
    }

    private int numOfPath(TreeNode node, int sum) {
        if (node == null) return 0;
        return node.val == sum ? 1 : 0 +
                numOfPath(node.left, sum - node.val) +
                numOfPath(node.right, sum - node.val);
    }
}
