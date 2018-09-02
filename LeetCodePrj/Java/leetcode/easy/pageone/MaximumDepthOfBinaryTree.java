package leetcode.easy.pageone;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Kyle
 * @create 2018/4/24 22:32
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        int front = -1, rear = -1;
        int last = 0, level = 0;
        TreeNode[] queue = new TreeNode[100000];
        if (root == null) {
            return 0;
        }
        queue[++rear] = root;
        TreeNode p;
        while(front < rear) {
            p = queue[++front];
            if(p.left != null) {
                queue[++rear] = p.left;
            }
            if(p.right != null) {
                queue[++rear] = p.right;
            }
            if(front == last) {
                level++;
                last = rear;
            }
        }
        return level;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}