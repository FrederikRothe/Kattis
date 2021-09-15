package main

import (
	"math"
	"fmt"
)
func main(){
	var n,k,h int;

	fmt.Scanln(&n, &k, &h)

	var missing int;

	if n-(k*h) > 0 {
		missing = n - (k*h)
		var toprint float64 = (float64(missing)/float64(h))
		x := math.Ceil(toprint)
		fmt.Printf("%d", int(x))
	} else {
		fmt.Println(0);	
	}
		
}