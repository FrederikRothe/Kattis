package main

import (
    "fmt"
    "strconv"
)

func main(){
    var size, currentNumber int
    var nextString string
    var allOkay bool

    fmt.Scanln(&size)
    currentNumber = 1
    allOkay = true;


    for i := 0; i < size; i++ {

        fmt.Scan(&nextString)

        if nextString[0] == 'm' {
            currentNumber++
        }else{
            number, _ := strconv.Atoi(nextString)

            if number == currentNumber {
                currentNumber++
            }else{
                allOkay = false;
            }
            }
        }

        if allOkay {
            fmt.Println("makes sense")
        } else{
            fmt.Println("something is fishy")
        }
    }