package main

import "fmt"

func main() {
	var doctor, jon string

	fmt.Scan(&doctor, &jon)

	if len(doctor) < len(jon) {
		fmt.Println("no");
	} else {
		fmt.Println("go");
	}
}