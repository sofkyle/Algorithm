package sorting

import (
	"fmt"
	"testing"
)

func TestSelectSort(t *testing.T) {
	arr := []int{5, 1, 3, 2, 6, 8, 4, 7}
	fmt.Println(SelectionSort(arr))
}
