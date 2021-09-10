package main

import (
    "fmt"
)

func main() {
    var orangeBought, appleBought, pinappleBought float32
    var orangeRatio, appleRatio, pinappleRatio float32

    fmt.Scanln(&orangeBought, &appleBought, &pinappleBought)
    fmt.Scanln(&orangeRatio, &appleRatio, &pinappleRatio)


    var orange, apple, pineapple, lowestRatio float32

    orange = orangeBought/orangeRatio
    apple = appleBought/appleRatio
    pineapple = pinappleBought/pinappleRatio

    if orange < apple && orange < pineapple {
        lowestRatio = orange
    } else if apple < orange && apple < pineapple {
        lowestRatio = apple
    } else {
        lowestRatio = pineapple
    }

    var leftOverOrange, leftOverApple, leftOverPineApple float32

    leftOverOrange = orangeBought - (orangeRatio * lowestRatio)
    leftOverApple = appleBought - (appleRatio * lowestRatio)
    leftOverPineApple = pinappleBought - (pinappleRatio * lowestRatio)
    


    fmt.Printf("%v %v %v", leftOverOrange, leftOverApple, leftOverPineApple)
}