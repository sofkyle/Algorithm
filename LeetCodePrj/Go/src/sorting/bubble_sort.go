package sorting

func BubbleSort(arr []int) []int {

	for i := 0; i < len(arr)-1; i++ {
		swapFlag := false
		for j := 0; j < len(arr)-1; j++ {
			if arr[j] > arr[j+1] {
				swapFlag = true
				tmp := arr[j]
				arr[j] = arr[j+1]
				arr[j+1] = tmp
			}
		}

		// break when swapping isn't occur
		if !swapFlag {
			break
		}
	}

	return arr
}
