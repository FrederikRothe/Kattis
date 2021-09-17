package main

import (
	"fmt"
)
func main(){
	var start, end, k, j int
	
	fmt.Scanln(&start)
	fmt.Scanln(&end)

	var i int = start


	for (i != end){
		i++
		if(i > 359){
			i = 0
		}
		j++
	}
	
	i = start

	for(i != end){
		i--
		if(i < 0){
			i = 359
		}
		k++
	}

	if(k < j) {
		k *= -1
		fmt.Println(k)
	} else {
		fmt.Println(j)
	}
}