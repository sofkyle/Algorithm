package sorting

func InsertingSort(arr []int) []int {
	for i := 1; i < len(arr); i++ {
		val := arr[i]
		j := i - 1
		for ; j >= 0; j-- {
			if arr[j] > val {
				arr[j+1] = arr[j]
			} else {
				break
			}
		}
		arr[j+1] = val
	}

	return arr
}
