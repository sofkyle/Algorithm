package other

import (
	"fmt"
	"testing"
)

func TestFuncParam(t *testing.T) {
	array1 := []int{1, 2}
	fmt.Printf("1.1--%v\n", array1)
	array2 := modifyIntArray(array1)
	fmt.Printf("1.2--%v\n", array2)
	fmt.Printf("1.3--%v\n", array1)

	// when the length of array is fixed, the array3 won't be modified
	array3 := [2]string{"a", "b"}
	fmt.Printf("2.1--%v\n", array3)
	array4 := modifyFixIntArray(array3)
	fmt.Printf("2.2--%v\n", array4)
	fmt.Printf("2.3--%v\n", array3)
}

func modifyIntArray(a []int) []int {
	a[1] = 3
	return a
}

func modifyFixIntArray(a [2]string) [2]string {
	a[1] = "c"
	return a
}
