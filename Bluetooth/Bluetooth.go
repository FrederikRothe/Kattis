package main

import "fmt"

func main(){
	var amount int;
	var topR, topL, botR, botL = 8,8,8,8;
	var leftUse, rightUse bool = true,true;

	fmt.Scanln(&amount);

	for i := 0; i < amount; i++ {
		var input, problem string;
		fmt.Scanln(&input, &problem);

		//Check top left
		if input[0] == '+' {
			if problem == "b" {
				leftUse = false;
			} else {
				topL--;
			}
		}
		//Check top right
		if input[1] == '+' {
			if problem == "b" {
				rightUse = false;
			} else {
				topR--;
			}
			
		}
		//Check bottom left
		if input[0] == '-' {
			if problem == "b" {
				leftUse = false;
			} else {
				botL--;
			}
		}
		//Check bottom right
		if input[1] == '-' {
			if problem == "b" {
				rightUse = false;
			} else {
				botR--;
			}
		}

	}
	if topL == 0 || botL == 0 {
		leftUse = false;
	}
	if topR == 0 || botR == 0 {
		rightUse = false;
	}
	if topL != 0 && botL != 0 && leftUse {
		fmt.Println(0);
	}
	if topR != 0 && botR != 0 && rightUse {
		fmt.Println(1);
	}
	if !leftUse && !rightUse {
		fmt.Println(2);
	}

}