package leetcode.hard.page1;

import leetcode.common.ListNode;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        // find the non-null node
        int i = 0;
        ListNode sortedListHead = null;
        for (; i < lists.length; i++) {
            if (lists[i] != null) {
                sortedListHead = lists[i];
                break;
            }
        }

        i++;
        for (; i < lists.length; i++) {
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
            if (tmpFast == null && tmpSlow != null) {
                tmpSlow.next = cmpNode;
            }
        }

        return sortedListHead;
    }
}
