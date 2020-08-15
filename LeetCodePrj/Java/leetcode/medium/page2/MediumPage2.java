package leetcode.medium.page2;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MediumPage2 {
    @Test
    public void testSortList() {
        SortList sortList = new SortList();

        ListNode node = new ListNode(4);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);
        node.next.next.next = new ListNode(3);

        ListNode sortedList = sortList.sortList(node);
    }

    @Test
    public void testEvalRPN() {
        String[] input = new String[] {"2", "1", "+", "3", "*"};
        EvaluateReversePolishNotation evalRPN = new EvaluateReversePolishNotation();
        System.out.println(evalRPN.evalRPN(input));
    }

    @Test
    public void testCloneMap() {
        CloneGraph.Node node = new CloneGraph.Node();
        node.neighbors = new ArrayList<>();
        CloneGraph cloneGraph = new CloneGraph();
        System.out.println(cloneGraph.cloneGraph(node));
    }
}
