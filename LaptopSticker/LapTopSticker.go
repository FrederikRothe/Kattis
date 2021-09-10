package main

import "fmt"

func main() {
	var wc,hc,ws,hs int;
	var isOkay bool;
	
	fmt.Scanln(&wc, &hc, &ws, &hs)
	
	if wc-1 > ws && hc-1 > hs {
		isOkay = true;
	} else {
		isOkay = false;
	}

	if (isOkay) {
		fmt.Print(1)
	 } else {
		fmt.Print(0);
	 }	
}