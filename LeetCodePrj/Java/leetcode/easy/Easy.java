package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Kyle
 * @create 2018/4/12 2:45
 */
public class Easy {

    @Test
    public void twoSum() {
         TwoSum twoSum =  new TwoSum();
         int nums[] = {2, 7, 11, 15};
         int target = 9;
         System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }

    @Test
    public void searchInsert() {
        SearchInsert searchInsert = new SearchInsert();
        int nums[] = {1, 3, 5, 6};
        int target = 0;
        System.out.println(searchInsert.searchInsert(nums, target));
    }

    @Test
    public void countAndSay() {
        CountAndSay countAndSay = new CountAndSay();
        int n = 3;
        System.out.println(countAndSay.countAndSay(n));
    }

    @Test
    public void maxSubArray() {
        MaxSubArray maxSubArray = new MaxSubArray();
        int[] nums = {-1};
        System.out.println(maxSubArray.maxSubArray(nums));
    }

    @Test
    public void lengthOfLastWord() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String str = " ";
        System.out.println(lengthOfLastWord.lengthOfLastWord(str));
    }

    @Test
    public void plusOne() {
        PlusOne plusOne = new PlusOne();
        int[] digits = {0};
        System.out.println(Arrays.toString(plusOne.plusOne(digits)));
    }

    @Test
    public void sqrtX() {
        SqrtX sqrtX = new SqrtX();
        int x = 4;
        System.out.println(sqrtX.sqrt(x));
    }

    @Test
    public void climbStairs() {
        ClimbStairs climbStairs = new ClimbStairs();
        int n = 44;
        Long begin = System.currentTimeMillis();
        System.out.println(climbStairs.climbStairs(n));
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Test
    public void deleteDuplicates() {
        DeleteDuplicates.ListNode listNodeOne = new DeleteDuplicates.ListNode(1);
        listNodeOne.next = new DeleteDuplicates.ListNode(1);
        listNodeOne.next.next = new DeleteDuplicates.ListNode(1);
        listNodeOne.next.next.next = new DeleteDuplicates.ListNode(1);
        listNodeOne.next.next.next.next = new DeleteDuplicates.ListNode(1);
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        DeleteDuplicates.ListNode head = deleteDuplicates.deleteDuplicates(listNodeOne);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    @Test
    public void mergeSortedArray() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        mergeSortedArray.mergeSortedArray(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    public void sameTree() {
        SameTree sameTree = new SameTree();

        SameTree.TreeNode treeOne = new SameTree.TreeNode(1);
        treeOne.left = new SameTree.TreeNode(2);

        SameTree.TreeNode treeTwo = new SameTree.TreeNode(1);
        treeTwo.right = new SameTree.TreeNode(2);

        System.out.println(sameTree.isSameTree(treeOne, treeTwo));
    }

    @Test
    public void symmetricTree() {
        SymmetricTree symmetricTree = new SymmetricTree();
        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);

        SymmetricTree.TreeNode left = new SymmetricTree.TreeNode(2);
        left.right = new SymmetricTree.TreeNode(3);

        SymmetricTree.TreeNode right = new SymmetricTree.TreeNode(2);
        right.right = new SymmetricTree.TreeNode(3);

        root.left = left;
        root.right = right;

        System.out.println(symmetricTree.isSymmetric(root));
    }

    @Test
    public void maximumDepthOfBinaryTree() {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(3);
        root.left = new MaximumDepthOfBinaryTree.TreeNode(9);

        MaximumDepthOfBinaryTree.TreeNode right = new MaximumDepthOfBinaryTree.TreeNode(20);
        right.left = new MaximumDepthOfBinaryTree.TreeNode(15);
        right.right = new MaximumDepthOfBinaryTree.TreeNode(7);

        root.right = right;

        System.out.println(maximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    public void binaryTreeLevelOrderTraversalII() {
        BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII();

        BinaryTreeLevelOrderTraversalII.TreeNode root = new BinaryTreeLevelOrderTraversalII.TreeNode(3);
        root.left = new BinaryTreeLevelOrderTraversalII.TreeNode(9);

        BinaryTreeLevelOrderTraversalII.TreeNode right = new BinaryTreeLevelOrderTraversalII.TreeNode(20);
        right.left = new BinaryTreeLevelOrderTraversalII.TreeNode(15);
        right.right = new BinaryTreeLevelOrderTraversalII.TreeNode(7);

        root.right = right;

        System.out.println(binaryTreeLevelOrderTraversalII.levelOrderBottom(root));
    }

    @Test
    public void convertSortedArraytoBinarySearchTree() {
        int[] nums = new int[]{-10,-3,0,5,9};

        ConvertSortedArraytoBinarySearchTree convertSortedArraytoBinarySearchTree = new ConvertSortedArraytoBinarySearchTree();
        convertSortedArraytoBinarySearchTree.sortedArrayToBST(nums);
    }

    @Test
    public void balancedBinaryTree() {
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(3);
        root.left = new BalancedBinaryTree.TreeNode(9);

        BalancedBinaryTree.TreeNode rightTree = new BalancedBinaryTree.TreeNode(20);
        rightTree.left = new BalancedBinaryTree.TreeNode(15);
        rightTree.right = new BalancedBinaryTree.TreeNode(7);

        root.right = rightTree;

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        System.out.println(balancedBinaryTree.isBalanced(root));
    }

    @Test
    public void pascalsTriangleII() {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        System.out.println(pascalsTriangleII.getRow(3));
    }

    @Test
    public void bestTimeToBuyAndSellStockII() {
        int[] prices = new int[]{7,1,5,3,6,4};
        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
        bestTimeToBuyAndSellStockII.maxProfit(prices);
    }

    @Test
    public void testValidPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome(s));
    }

    @Test
    public void testSize() {
        int[] a = new int[2];
        a = Arrays.copyOf(a, 4);
        System.out.println(a.length);
    }

    @Test
    public void testExcelSheetColumnNumber() {
        String s = "AB";
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        System.out.println(excelSheetColumnNumber.titleToNumber(s));
    }

    @Test
    public void testFactorialTrailingZeros() {
        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        System.out.println(factorialTrailingZeroes.trailingZeroes(1808548329));
    }
}
