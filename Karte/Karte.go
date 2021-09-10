package main

import (
    "fmt"
    "strconv"
)

func main() {
    var P, K, H, T int = 13, 13, 13, 13
    var input string
    var letter byte
    var greska bool
    fmt.Scanln(&input)

    p := []bool{false,false,false,false,false,false,false,false,false,false,false,false, false}
    k := []bool{false,false,false,false,false,false,false,false,false,false,false,false, false}
    h := []bool{false,false,false,false,false,false,false,false,false,false,false,false, false}
    t := []bool{false,false,false,false,false,false,false,false,false,false,false,false, false}

    for i := 0; i < len(input); i += 3 {
        var card string = input[i:i+3]
        letter = card[0]
        number, _ := strconv.Atoi(input[i+1:i+3])
        number--

        switch(letter) {
            case 'P': 
                P -= 1
                if p[number]{
                    fmt.Println("GRESKA")
                    greska = true;
                    break;
                }
                p[number] = true

            case 'K':
                K -= 1
                if k[number]{
                    fmt.Println("GRESKA")
                    greska = true;
                    break;
                }
                k[number] = true

            case 'H':
                if h[number]{
                    fmt.Println("GRESKA")
                    greska = true;
                    break
                }
                h[number] = true;
                H -= 1
            case 'T':
                if t[number]{
                    fmt.Println("GRESKA")
                    greska = true;
                    break
                }
                t[number] = true;
                T -= 1
        }
    }
    if !greska{
        fmt.Printf("%v %v %v %v", P, K, H, T)
    }
}