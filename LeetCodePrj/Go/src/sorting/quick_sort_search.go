package sorting

func QuickSortSearch(arr []int, l int, r int, n int) int {
	if l > r {
		return -1
	}

	p := quickSearch(arr, l, r)

	if p == n-1 {
		return arr[p]
	}
	if p > n-1 {
		return QuickSortSearch(arr, l, p-1, n)
	} else {
		return QuickSortSearch(arr, p+1, r, n)
	}
}

func quickSearch(arr []int, l int, r int) int {
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
