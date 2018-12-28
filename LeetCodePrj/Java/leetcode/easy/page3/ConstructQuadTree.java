package leetcode.easy.page3;

public class ConstructQuadTree {

    public Node construct(int[][] grid) {
        if (grid.length == 0) return null;

        return recurse(grid, 0, 0, grid.length);
    }

    private Node recurse(int[][] grid, int x, int y, int length) {
        if (length == 1) {
            return new Node(grid[x][y] == 1, true,
                    null, null, null, null);
        }

        length /= 2;

        Node topLeftNode = recurse(grid, x, y, length);
        Node topRightNode = recurse(grid, x, y + length, length);
        Node bottomLeftNode = recurse(grid, x + length, y, length);
        Node bottomRightNode = recurse(grid, x + length, y + length, length);

        // Merging the leaves with same value
        if (topLeftNode.isLeaf &&  topRightNode.isLeaf && topRightNode.isLeaf
                && bottomLeftNode.isLeaf && bottomRightNode.isLeaf
                && topLeftNode.val == topRightNode.val && topRightNode.val == bottomLeftNode.val
                && bottomLeftNode.val == bottomRightNode.val) {
            return new Node(topLeftNode.val, true,
                   null, null, null, null);
        }

        return new Node(false, false, topLeftNode, topRightNode, bottomLeftNode, bottomRightNode);
    }

    static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {}

        public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    };
}
