package sorting

func QuickSort(arr []int, l int, r int) {
	if l >= r {
		return
	}

	p := partition2(arr, l, r)

	QuickSort(arr, l, p-1)
	QuickSort(arr, p+1, r)
}

func partition(arr []int, l int, r int) int {
	i := l
	j := l

	for ; i < r; i++ {
		if arr[i] < arr[r] {
			tmp := arr[i]
			arr[i] = arr[j]
			arr[j] = tmp
			j++
		}
	}

	tmp := arr[r]
	arr[r] = arr[j]
	arr[j] = tmp

	return j
}

func partition2(arr []int, l int, r int) int {
	mid := (l + r) / 2

	i := l
	j := r

	for i < j {
		for ; i <= j; i++ {
			if arr[i] >= arr[mid] {
				break
			}
		}

		for ; j > i; j-- {
			if arr[j] < arr[mid] {
				break
			}
		}

		if i <= r {
			tmp := arr[i]
			arr[i] = arr[j]
			arr[j] = tmp
			if i == mid {
				mid = j
			} else if j == mid {
				mid = i
			}
		}
	}

	tmp := arr[i]
	arr[i] = arr[mid]
	arr[mid] = tmp

	return i
}
