package main

import (
    "fmt"
    "strconv"
    )

func main () {
    var input string
    fmt.Scanln(&input)

    arr := make([]int, 4)

    for i := 0; i < len(input); i++ {
        arr[i], _ = strconv.Atoi(string(input[i]))
    }

    if (arr[3] + 1 > 9) {
        arr[3] = 0
        if(arr[2] + 1 > 9){
            arr[2] = 0
            if(arr[1] + 1 > 9){
                arr[1] = 0
                if(arr[0] + 1 > 9){
                    arr[0] = 0
                } else {
                    arr[0] += 1
                }
            } else {
                arr[1] += 1
            }
            
        } else {
            arr[2] += 1
        }
    } else {
        arr[3] += 1
    }

    newarr := reverseInts(arr)
    fmt.Printf("%d%d%d%d", newarr[0], newarr[1], newarr[2], newarr[3])
}

func reverseInts(input []int) []int {
    if len(input) == 0 {
        return input
    }
    return append(reverseInts(input[1:]), input[0]) 
}