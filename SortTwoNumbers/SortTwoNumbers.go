package main

import "fmt"

func main() {
    var v1 int
    var v2 int
    fmt.Scan(&v1)
    fmt.Scan(&v2)
    

    if v1 > v2 {
        fmt.Printf("%v %v \n", v2, v1)
    } else {
        fmt.Printf("%v %v \n", v1, v2)
    }
}