package sorting

func InsertingSort(arr []int) []int {
	for i := 0; i < len(arr)-1; i++ {
		for j := i + 1; j > 0; j-- {
			if arr[j] < arr[j-1] {
				tmp := arr[j-1]
				arr[j-1] = arr[j]
				arr[j] = tmp
			} else {
				break
			}
		}
	}

	return arr
}
