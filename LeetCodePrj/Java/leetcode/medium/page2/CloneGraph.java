package leetcode.medium.page2;

import java.util.*;

public class CloneGraph {
    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        Node res = new Node(node.val);
        visited.put(node, res);

        while (!queue.isEmpty()) {
            Node oldNode = queue.poll();
            Node newNode = visited.getOrDefault(oldNode, new Node(oldNode.val));

            for (Node oldSubNode : oldNode.neighbors) {
                Node newSubNode = null;
                if (visited.containsKey(oldSubNode)) {
                    newSubNode = visited.get(oldSubNode);
                } else {
                    queue.offer(oldSubNode);
                    newSubNode = new Node(oldSubNode.val);
                    visited.put(oldSubNode, newSubNode);
                }
                newNode.neighbors.add(newSubNode);
            }
        }

        return res;
    }
}
