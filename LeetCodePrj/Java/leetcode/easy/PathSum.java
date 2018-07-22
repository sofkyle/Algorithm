package leetcode.easy;


/**
 * @author Kyle
 * @create 2018/7/22 23:23
 */
public class PathSum {

    private int actualSum = 0;

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }

        if(root.left == null && root.right == null) {
            actualSum += root.val;
            if(actualSum == sum) return true;
            else return false;
        } else if(root.left == null) {
            return hasPathSum(root.right, sum);
        } else if(root.right == null) {
            return hasPathSum(root.left, sum);
        } else {
            return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
