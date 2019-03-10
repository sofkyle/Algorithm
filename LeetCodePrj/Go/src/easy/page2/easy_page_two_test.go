package page2

import (
	"encoding/json"
	"fmt"
	"testing"
)

func TestReverseLinkedList(t *testing.T) {
	node1 := &ListNode{1, nil}
	node2 := &ListNode{2, node1}
	node3 := &ListNode{3, node2}
	node4 := &ListNode{4, node3}
	node5 := &ListNode{5, node4}
	node6 := &ListNode{6, node5}

	data, err := json.Marshal(reverseList(node6))
	if err != nil {
		t.Error(err)
	}

	fmt.Printf(string(data))
}
