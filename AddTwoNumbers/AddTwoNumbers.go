package main

import "fmt"

func main() {
    var v1 int
    var v2 int
    fmt.Scan(&v1)
    fmt.Scan(&v2)
    var n int = v1 + v2

    fmt.Print(n)
}