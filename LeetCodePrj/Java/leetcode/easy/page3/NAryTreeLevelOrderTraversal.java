package leetcode.easy.page3;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NAryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> traversal = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();

        // offer the root node
        queue.offer(root);
        while (queue.size() != 0) {
            int curLevelSize = queue.size();
            List<Integer> curLevel = new LinkedList<>();

            for (int i = 0; i < curLevelSize; i++) {
                Node curNode = queue.poll();
                curLevel.add(curNode.val);

                // get all children nodes
                for (int j = 0; j < curNode.children.size(); j++) {
                    queue.offer(curNode.children.get(j));
                }
            }
        }

        return traversal;
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}