package leetcode.easy.pageone;

/**
 * @author Kyle
 * @create 2018/4/22 16:24
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        return p != null && q != null && p.val==q.val && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
