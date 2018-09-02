package leetcode.easy.pageone;

/**
 * @author Kyle
 * @create 2018/4/22 0:40
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null && q != null) {
            return false;
        }
        if(p != null && q == null) {
            return false;
        }

        if(p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
