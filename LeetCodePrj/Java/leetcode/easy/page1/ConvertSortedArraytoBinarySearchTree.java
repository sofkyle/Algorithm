package leetcode.easy.page1;

/**
 * @author Kyle
 * @create 2018/5/4 23:02
 */
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode treeNode = arrayToBST(nums, 0, nums.length - 1);
        return treeNode;
    }

    private TreeNode arrayToBST(int[] nums, int start, int end) {
        if(start <= end) {
            int pivot = (start + end) / 2;
            TreeNode treeNode = new TreeNode(nums[pivot]);
            treeNode.left = arrayToBST(nums, start, pivot - 1);
            treeNode.right = arrayToBST(nums, pivot + 1, end);
            return treeNode;
        }
        return null;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}