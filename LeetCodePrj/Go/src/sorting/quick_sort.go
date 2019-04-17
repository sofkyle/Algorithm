package sorting

func QuickSort(arr []int, l int, r int) {
	if l > r {
		return
	}

	p := partition(arr, l, r)

	QuickSort(arr, l, p-1)
	QuickSort(arr, p+1, r)
}

func partition(arr []int, l int, r int) int {
	j := l

	var tmp int
	for i := l; i < r; i++ {
		if arr[i] < arr[r] {
			tmp = arr[i]
			arr[i] = arr[j]
			arr[j] = tmp
			j++
		}
	}

	tmp = arr[r]
	arr[r] = arr[j]
	arr[j] = tmp

	return j
}
