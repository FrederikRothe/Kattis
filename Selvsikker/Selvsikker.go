package main

import "fmt"
import "strings"
import "os"
import "bufio"

func main(){

	inputReader := bufio.NewReader(os.Stdin)
	input, _ := inputReader.ReadString('\n')

	input = strings.Replace(input, "?", "!", -1)
	var words []string = strings.Split(input, " ")
	var temp string = strings.ToLower(words[0])

	words[0] = strings.Title(words[1])
	words[1] = temp

	fmt.Println(strings.Join(words," "))

}