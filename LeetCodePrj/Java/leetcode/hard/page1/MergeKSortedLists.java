package leetcode.hard.page1;

import leetcode.common.ListNode;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];

        ListNode sortedListHead = lists[0];

        for (int i = 1; i < lists.length; i++) {
            ListNode tmpFast = sortedListHead;
            ListNode tmpSlow = sortedListHead;
            ListNode cmpNode = lists[i];
            while (tmpFast != null && cmpNode != null) {
                if (tmpFast.val <= cmpNode.val) {
                    if (tmpFast == tmpSlow) {
                        tmpFast = tmpFast.next;
                    } else {
                        tmpFast = tmpFast.next;
                        tmpSlow = tmpSlow.next;
                    }
                } else {
                    ListNode cmpNodeNext = cmpNode.next;
                    cmpNode.next = tmpFast;
                    if (tmpFast == tmpSlow) {
                        tmpSlow = cmpNode;
                        sortedListHead = tmpSlow;
                    } else {
                        tmpSlow.next = cmpNode;
                        tmpSlow = tmpSlow.next;
                    }
                    cmpNode = cmpNodeNext;
                }
            }
            if (tmpFast == null) {
                tmpSlow.next = cmpNode;
            }
        }

        return sortedListHead;
    }
}
