package sorting

func MergeSort(arr []int, p int, q int) {
	if p >= q {
		return
	}

	r := p + (q-p)/2

	MergeSort(arr, p, r)
	MergeSort(arr, r+1, q)

	merge(arr, p, r, r+1, q)
}

func merge(arr []int, p, r, s, q int) {
	tmp := make([]int, q-p+1)
	k := 0
	i := 0
	j := 0
	for ; k < len(tmp) && i <= r && j <= q; k++ {
		if arr[i] <= arr[j] {
			tmp[k] = arr[i]
			i++
		} else {
			tmp[k] = arr[j]
			j++
		}
	}

	for ; i <= r; i++ {
		tmp[k] = arr[i]
		k++
		i++
	}
	for ; j <= r; j++ {
		tmp[k] = arr[j]
		k++
		j++
	}
}
