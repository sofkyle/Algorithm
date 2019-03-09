package page2

type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseList(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}

	tail := head.Next
	curNode := tail.Next
	head.Next = nil
	for {
		tail.Next = head
		head = tail
		tail = curNode
		if tail != nil {
			curNode = curNode.Next
		} else {
			tail = head
			break
		}
	}

	return tail
}
