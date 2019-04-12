package leetcode.hard.page1;

import leetcode.common.ListNode;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        int step = 1;
        while (step < lists.length) {
            for (int i = 0; i < lists.length - step; i += step * 2) {
                lists[i] = merge(lists[i], lists[i + step]);
            }
            step *= 2;
        }

        return lists[0];
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }

            node = node.next;
        }
        node.next = list1 != null ? list1 : list2;

        return head.next;
    }

    private ListNode simpleMerge(ListNode[] lists) {
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
