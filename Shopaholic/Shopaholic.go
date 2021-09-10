package main

import (
	"fmt"
	"sort"
	"os"
) 

func main() {
	var amountOfItems, totalDiscount int;
	amountOfItems = nextInt();

	numbers := make([]int, amountOfItems);

	for i := 0; i < amountOfItems; i++ {
		var price = nextInt();
		numbers[i] = price;
	}

	sort.Ints(numbers);

	for i := amountOfItems -3; i >= 0; i-=3 {
			totalDiscount += numbers[i];
	}

	fmt.Println(totalDiscount);
}

const BUFFER_SIZE = 1<<16
var buffer = make([]byte, BUFFER_SIZE)
var bufferPointer = 0
var bytesRead = 0

func nextInt() int {
    ret := 0
    c := read()
    for c <= ' ' {
        c = read()
    }
    neg := c == '-'
    for c >= '0' && c <= '9'{
        ret = ret * 10 + int(c) - '0'
        c = read()
    }
    if neg {
        return -ret
    }
    return ret
}


func fillBuffer() {
    bytesRead, _ = os.Stdin.Read(buffer)
    if bytesRead == 0 {
        buffer[0] = 255
    }
    bufferPointer = 0
}

func read() byte {
    if bytesRead == bufferPointer{
        fillBuffer()
    }
    bufferPointer++
    return buffer[bufferPointer-1]
}