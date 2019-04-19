package sorting

import (
	"fmt"
	"testing"
)

var Arr = []int{9, 3, 2, 4, 7, 6, 7, 8}

func TestSelectSort(t *testing.T) {
	fmt.Println(SelectionSort(Arr))
}

func TestInsertingSort(t *testing.T) {
	fmt.Println(InsertingSort(Arr))
}

func TestBubbleSort(t *testing.T) {
	fmt.Println(BubbleSort(Arr))
}

func TestMergeSort(t *testing.T) {
	MergeSort(Arr, 0, 7)
	fmt.Print(Arr)
}

func TestQuickSort(t *testing.T) {
	QuickSort(Arr, 0, 7)
	fmt.Print(Arr)
}

func TestQuickSortSearch(t *testing.T) {
	val := QuickSortSearch(Arr, 0, 7, 4)
	fmt.Print(val)
}
