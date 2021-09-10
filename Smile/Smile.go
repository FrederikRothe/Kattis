package main

import "fmt"

func main() {
	var input string;

	fmt.Scanln(&input);

	for i := 0; i < len(input)-1; i++ {
		if input[i] == ':' || input[i] == ';' {
			if input[i+1] == ')'{
				fmt.Println(i);
			}
			if input[i+1] == '-' {
				if input[i+2] == ')'{
					fmt.Println(i);
				}
			}
			
		}
		
	}


}