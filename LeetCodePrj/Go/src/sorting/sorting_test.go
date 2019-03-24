package sorting

import (
	"fmt"
	"testing"
)

var Arr = []int{5, 1, 3, 2, 6, 8, 4, 7}

func TestSelectSort(t *testing.T) {
	fmt.Println(SelectionSort(Arr))
}

func TestInsertingSort(t *testing.T) {
	fmt.Print(InsertingSort(Arr))
}
