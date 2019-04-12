package sorting

func QuickSort(arr []int, l int, r int) {
	p := quickMerge(arr, l, r)

	QuickSort(arr, l, p-1)
	QuickSort(arr, p+1, r)
}

func quickMerge(arr []int, l int, r int) int {
	j := l

	for i := l; i < r; i++ {
		if arr[i] < arr[r] {
			tmp := arr[i]
			arr[i] = arr[j]
			arr[j] = tmp
			j++
		}
	}

	return j
}
